package com.lcwd.user.service.entities;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    private String ratingId;
    private String userId;
    private String hotelId;
    private  int rating;
    private  String feedback;

    private Hotel hotel;


}
