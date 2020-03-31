package com.API1.LeeApi;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
@Service
public class LeeService {
        private List<Lee> topics= new ArrayList<>(Arrays.asList(
                new Lee(1,"jeans","https://images.lee.com/is/image/Lee/2015045-HERO?$XL-MAX-1380$","MEN'S EXTREME MOTION STRAIGHT FIT TAPERED LEG JEANS",2599),
                new Lee(2,"jeans","https://images.lee.com/is/image/Lee/2015145-HERO?$XL-MAX-1380$","MEN'S EXTREME MOTION BOOTCUT JEAN",3599),
                new Lee(3,"jeans","https://images.lee.com/is/image/Lee/2003010-HERO?$XL-MAX-1380$","MEN'S LEE SKINNY FIT JEAN",2399),
                new Lee(4,"jeans","https://images.lee.com/is/image/Lee/2877940-HERO?$XL-MAX-1380$","MEN'S 100% COTTON LEE CARPENTER JEAN",4999)
        ));

        public List<Lee> getAllTopicsByService(){
            return this.topics;
        }

        public Lee getTopicById(int id){
            return this.topics.stream().filter(t-> t.getId()==(id)).findFirst().get();
        }

        public void addTopic(Lee topic){
            topics.add(topic);
        }

        public void updateTopic(int id, Lee topic){
            for(int i=0;i<topics.size();i++){
                Lee ref= topics.get(i);
                if(ref.getId()==(id)){
                    topics.set(i,topic);
                }
            }
            return;
        }

        public void deleteTopic(int id){
            for(int i=0;i<topics.size();i++){
                Lee ref=topics.get(i);
                if(ref.getId()==(id)){
                    topics.remove(i);
                }
            }
        }
}
