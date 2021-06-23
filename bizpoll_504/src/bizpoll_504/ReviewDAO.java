package bizpoll_504;

import java.util.List;

public class ReviewDAO {
	public void reviewInfo(List<ReviewDTO> reviewList) {
		for (int i = 0; i < reviewList.size(); i++) {
			System.out.println(reviewList.get(i).getGender());
			System.out.println(reviewList.get(i).getName());
			System.out.println(reviewList.get(i).getId());
			System.out.println(reviewList.get(i).getClassroom());
			System.out.println(reviewList.get(i).getAddress());
		}
	}
}
