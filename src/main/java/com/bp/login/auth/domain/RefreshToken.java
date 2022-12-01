package com.bp.login.auth.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "refreshtoken")
@Data
@Getter
@NoArgsConstructor
public class RefreshToken {
    @Id
    @Column(nullable = false)
    private String uuid;

    private LocalDateTime expiredDt;

    public LocalDateTime getExpiredDt() {
        return expiredDt;
    }

    public RefreshToken(String uuid, User email, LocalDateTime expiredDt) {
        this.uuid = uuid;
        this.expiredDt = expiredDt;
    }
}
