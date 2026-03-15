package com.devsuperior.user_request_sb.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {

    private Long id;
    private String login;
    private String name;
    private String location;
    private String avatarUrl;
    private Integer followers;
    private Integer createAt;
    private String reposUrl;
    private String company;

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", followers=" + followers +
                ", createAt=" + createAt +
                ", reposUrl='" + reposUrl + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
