package com.fancky.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/home")
public class HomeController {
    private final static Logger logger = LogManager.getLogger(HomeController.class);
//
//    @Autowired
//    private UserInfoService userInfoService;
//
//    @Autowired
//    ObjectMapper mapper;
//
//    @GetMapping("/getUserWithOrderPage")
//    public MessageResult<PageData<UserInfoVO>> getUserWithOrderPage(UserInfoDto userInfoDto) {
//        MessageResult<PageData<UserInfoVO>> message = userInfoService.getUserWithOrderPage(userInfoDto);
//        return message;
//    }
//
//    @PostMapping("/updateRelative")
//    public MessageResult<Void> updateRelative(@RequestBody RelativeUserInfoEosStudentDto relativeUserInfoEosStudentDto) {
//        MessageResult<Void> messageResult = new MessageResult<>();
//        ;
//        try {
//            messageResult = userInfoService.updateRelative(relativeUserInfoEosStudentDto);
//            messageResult.setCode(0);
//        } catch (Exception e) {
//            messageResult.setCode(500);
//            messageResult.setMessage(e.getMessage());
//            logger.error(e.toString());
//        }
//        return messageResult;
//    }
//
//    @PostMapping("/unRelative")
//    public MessageResult<Void> unRelative(@RequestBody UserInfoStudentUnRelativeDto userInfoStudentUnRelativeDto) {
//        MessageResult<Void> messageResult = new MessageResult<>();
//
//        try {
//            messageResult = userInfoService.unRelative(userInfoStudentUnRelativeDto);
//            messageResult.setCode(0);
//        } catch (Exception e) {
//            messageResult.setCode(500);
//            messageResult.setMessage(e.getMessage());
//            logger.error(e.toString());
//        }
//        return messageResult;
//    }
//
//    @GetMapping("/getUserInfoStatistics")
//    public MessageResult<UserInfoStatisticsDto> getUserInfoStatistics() {
//        return userInfoService.getUserInfoStatistics();
//    }
//
//    @GetMapping("/getGrade")
//    public MessageResult<List<Integer>> getGrade() {
//        return userInfoService.getGrade();
//    }
//
//    @GetMapping("/getRelativeState")
//    public MessageResult<List<RelativeStateDto>> getRelativeState() {
//        return userInfoService.getRelativeState();
//    }
//
//    @PostMapping("/postTest")
//    public MessageResult<Integer> postTest(@RequestParam Integer id,
//                                           @RequestParam String EOSOrder,
//                                           @RequestParam BigDecimal EOSBalance,
//                                           @RequestParam Boolean relativeState) {
//        UserInfo userInfo = new UserInfo();
////        MessageResult<Integer> messageResult = userInfoService.updateRelative(userInfo);
//        return null;
//    }
//
//    @PostMapping("/subbmit")
//    public void subbmit(String name) {
//        ObjectMapper mapper = new ObjectMapper();
//    }
//
//    @GetMapping("/getJackSon")
//    public String getJackSon() {
//        String jsonStr = "";
//        try {
//
//            UserInfoDto userInfo = new UserInfoDto();
//            userInfo.setRegTime(LocalDateTime.now());
//            userInfo.setRelativeState(true);
//            userInfo.setUserId("fancky");
//            //序列化
//            jsonStr = mapper.writeValueAsString(userInfo);
//            //反序列化
//            UserInfoDto pojo = mapper.readValue(jsonStr, UserInfoDto.class);
//            int m = 0;
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        return jsonStr;
//    }
//
//    @GetMapping("/getUserInfoByGuid")
//    public MessageResult<List<UserInfoVO>> getUserInfoByGuid(UserInfoDto userInfoDto) {
//        MessageResult<List<UserInfoVO>> message = userInfoService.getUserInfoByGuid(userInfoDto);
//        return message;
//    }
//
//
//    @PostMapping("/autoRelative")
//    public MessageResult<Void> autoRelative() {
//        return userInfoService.autoRelative();
//    }
}
