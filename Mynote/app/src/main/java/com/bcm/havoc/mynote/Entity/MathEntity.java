package com.bcm.havoc.mynote.Entity;

import android.text.TextUtils;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.io.Serializable;

public class MathEntity implements Serializable,MultiItemEntity {
    public static final int INF= 1;
    public static final int REC = 2;
    public static final int CIR = 3;



    private int itemType;
//    通知列表由三类数据组成
//（1）召集令，点击跳转至对应召集令
//    判断条件：CircleId != 0;
//（2）有图通知，点击打开Target对应的网页。
//    判断条件：NoticeId != 0 && ImageUrl != "";
//（3）无图通知，点击打开Target对应的网页。
//    判断条件：NoticeId != 0 && ImageUrl == "";
//
//      "noticeDescription": 通知描述
//      "nickName":  圈子发布者昵称
//      "applyCount": 召集令报名人数
//      "departmentId": 后台逻辑字段
//      "contentText": 后台逻辑字段
//      "activityTime": 召集令活动时间
//      "noticeType": 1,后台逻辑字段
//      "activityAddress": 召集令活动地点
//      "tagName": 召集令标签
//      "userId": 0, 后台逻辑字段
//      "noticeId": 1, 通知Id
//      "noticeContent": 后台逻辑字段
//      "trueName": "", 召集令发布者真实名称
//      "expireTime": 后台逻辑字段
//      "createTime": 创建时间
//      "noticeName": 通知标题
//      "schoolId": 后台逻辑字段
//      "imageUrl": 通知或召集令图片
//      "isPublic": 后台逻辑字段
//      "logo": 召集令发布者头像
//      "circleId": 圈子Id
//      "targetUrl": 通知内容的Url页面

    public MathEntity() {

    }
    public MathEntity(int itemType) {
        this.itemType = itemType;
    }
    public MathEntity(String noticeDescription, String nickName, String applyCount, String departmentId, String contentText, String activityTime, String noticeType, String activityAddress, String tagName, String userId, String noticeId, String noticeContent, String trueName, String expireTime, String createTime, String noticeName, String schoolId, String imageUrl, String isPublic, String logo, String circleId, String targetUrl) {
        this.noticeDescription = noticeDescription;
        this.nickName = nickName;
        this.applyCount = applyCount;
        this.departmentId = departmentId;
        this.contentText = contentText;
        this.activityTime = activityTime;
        this.noticeType = noticeType;
        this.activityAddress = activityAddress;
        this.tagName = tagName;
        this.userId = userId;
        this.noticeId = noticeId;
        this.noticeContent = noticeContent;
        this.trueName = trueName;
        this.expireTime = expireTime;
        this.createTime = createTime;
        this.noticeName = noticeName;
        this.schoolId = schoolId;
        this.imageUrl = imageUrl;
        this.isPublic = isPublic;
        this.logo = logo;
        this.circleId = circleId;
        this.targetUrl = targetUrl;
    }



    private String noticeDescription;
    private String nickName;
    private String applyCount;
    private String departmentId;
    private String contentText;
    private String activityTime;
    private String noticeType;
    private String activityAddress;
    private String tagName;
    private String userId;
    private String noticeId;
    private String noticeContent;
    private String trueName;
    private String expireTime;
    private String createTime;
    private String noticeName;
    private String schoolId;
    private String imageUrl;
    private String isPublic;
    private String logo;
    private String circleId;
    private String targetUrl;

    public String getNoticeDescription() {
        return noticeDescription;
    }

    public void setNoticeDescription(String noticeDescription) {
        this.noticeDescription = noticeDescription;
    }

    public String getNickName() {
        if(TextUtils.isEmpty(nickName)){
            return trueName;
        }
        return nickName;
    }
    public void setItemType(int itemType) {
        this.itemType = itemType;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getApplyCount() {
        return applyCount;
    }

    public void setApplyCount(String applyCount) {
        this.applyCount = applyCount;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public String getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime;
    }

    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    public String getActivityAddress() {
        return activityAddress;
    }

    public void setActivityAddress(String activityAddress) {
        this.activityAddress = activityAddress;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getNoticeName() {
        return noticeName;
    }

    public void setNoticeName(String noticeName) {
        this.noticeName = noticeName;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCircleId() {
        return circleId;
    }

    public void setCircleId(String circleId) {
        this.circleId = circleId;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    @Override
    public String toString() {
        return "MathEntity{" +
                "noticeDescription='" + noticeDescription + '\'' +
                ", nickName='" + nickName + '\'' +
                ", applyCount='" + applyCount + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", contentText='" + contentText + '\'' +
                ", activityTime='" + activityTime + '\'' +
                ", noticeType='" + noticeType + '\'' +
                ", activityAddress='" + activityAddress + '\'' +
                ", tagName='" + tagName + '\'' +
                ", userId='" + userId + '\'' +
                ", noticeId='" + noticeId + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                ", trueName='" + trueName + '\'' +
                ", expireTime='" + expireTime + '\'' +
                ", createTime='" + createTime + '\'' +
                ", noticeName='" + noticeName + '\'' +
                ", schoolId='" + schoolId + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", isPublic='" + isPublic + '\'' +
                ", logo='" + logo + '\'' +
                ", circleId='" + circleId + '\'' +
                ", targetUrl='" + targetUrl + '\'' +
                '}';
    }




    @Override
    public int getItemType() {
        //        通知列表由三类数据组成
//（1）召集令，点击跳转至对应召集令
//        判断条件：CircleId != 0;
//（2）有图通知，点击打开Target对应的网页。
//        判断条件：NoticeId != 0 && ImageUrl != "";
//（3）无图通知，点击打开Target对应的网页。
//        判断条件：NoticeId != 0 && ImageUrl == "";
//
//      "noticeDescription": 通知描述
//      "nickName":  圈子发布者昵称
//      "applyCount": 召集令报名人数
//      "departmentId": 后台逻辑字段
//      "contentText": 后台逻辑字段
//      "activityTime": 召集令活动时间
//      "noticeType": 1,后台逻辑字段
//      "activityAddress": 召集令活动地点
//      "tagName": 召集令标签
//      "userId": 0, 后台逻辑字段
//      "noticeId": 1, 通知Id
//      "noticeContent": 后台逻辑字段
//      "trueName": "", 召集令发布者真实名称
//      "expireTime": 后台逻辑字段
//      "createTime": 创建时间
//      "noticeName": 通知标题
//      "schoolId": 后台逻辑字段
//      "imageUrl": 通知或召集令图片
//      "isPublic": 后台逻辑字段
//      "logo": 召集令发布者头像
//      "circleId": 圈子Id
//      "targetUrl": 通知内容的Url页面
        if(!getCircleId().equals("0")){
            itemType = CIR;
        }
        else if(!TextUtils.isEmpty(getNoticeId())&&TextUtils.isEmpty(getImageUrl())){
            itemType =INF;
        }
        else  if(!TextUtils.isEmpty(getNoticeId())&&!TextUtils.isEmpty(getImageUrl())){
            itemType = REC;
        }
        else {
            itemType = CIR;
        }
        return itemType;
    }
}
