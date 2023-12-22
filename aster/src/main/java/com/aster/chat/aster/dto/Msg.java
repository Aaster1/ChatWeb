package com.aster.chat.aster.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Msg {

    private int msgNo;
    private String nickname;
    private String msg;
    private Date regDate;

}
