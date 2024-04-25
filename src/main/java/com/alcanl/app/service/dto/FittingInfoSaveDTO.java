package com.alcanl.app.service.dto;

import com.alcanl.app.repository.entity.FittingInfo;
import com.alcanl.app.repository.entity.User;

import java.time.LocalDateTime;

public class FittingInfoSaveDTO {

    public User user;

    public LocalDateTime fittingDate = LocalDateTime.now();

    @Override
    public boolean equals(Object other)
    {
        return other instanceof FittingInfo fi && user.equals(fi.user) && fittingDate.equals(fi.fittingDate);
    }
    @Override
    public int hashCode()
    {
        return user.hashCode();
    }
}