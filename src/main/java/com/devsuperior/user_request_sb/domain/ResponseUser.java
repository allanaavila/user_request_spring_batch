package com.devsuperior.user_request_sb.domain;

import com.devsuperior.user_request_sb.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseUser {
    private List<UserDTO> content;
}
