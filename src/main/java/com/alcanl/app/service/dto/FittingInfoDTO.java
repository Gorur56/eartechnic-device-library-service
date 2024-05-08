package com.alcanl.app.service.dto;

import com.alcanl.app.repository.entity.User;
import java.time.LocalDateTime;

public class FittingInfoDTO {

    public User user;

    public LocalDateTime fittingDate;

    @Override
    public boolean equals(Object other)
    {
        return other instanceof FittingInfoDTO fi && user.equals(fi.user) && fittingDate.equals(fi.fittingDate);
    }
    @Override
    public int hashCode()
    {
        return user.hashCode();
    }
}