package com.ruoyi.vehicle.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

public class TokenUtils {
    // 创建token
    public static String createToken(String username, String secret) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000L * 60 * 60 * 24 * 30))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    // 用token中获取用户信息
    public static String getUsernameFromToken(String token, String secret) {
        if (token == null || token.isEmpty()) {
            throw new IllegalArgumentException("Token cannot be null or empty");
        }

        if (token.startsWith("Bearer ")) {
            token = token.substring(7).trim(); // 移除 "Bearer " 并去除空格
        }

        // 检查 JWT 格式（必须包含 2 个点）
        if (token.chars().filter(ch -> ch == '.').count() != 2) {
            throw new IllegalArgumentException("Invalid JWT format: Token must contain exactly 2 periods");
        }

        // 解析 JWT
        Claims claims = Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }
}
