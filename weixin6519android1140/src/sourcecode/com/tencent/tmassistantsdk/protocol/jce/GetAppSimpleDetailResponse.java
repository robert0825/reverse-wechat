package com.tencent.tmassistantsdk.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class GetAppSimpleDetailResponse
  extends JceStruct
{
  static ArrayList<AppSimpleDetail> cache_appSimpleDetailList;
  public ArrayList<AppSimpleDetail> appSimpleDetailList = null;
  public int ret = 0;
  
  public GetAppSimpleDetailResponse() {}
  
  public GetAppSimpleDetailResponse(int paramInt, ArrayList<AppSimpleDetail> paramArrayList)
  {
    this.ret = paramInt;
    this.appSimpleDetailList = paramArrayList;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.ret = paramJceInputStream.read(this.ret, 0, true);
    if (cache_appSimpleDetailList == null)
    {
      cache_appSimpleDetailList = new ArrayList();
      AppSimpleDetail localAppSimpleDetail = new AppSimpleDetail();
      cache_appSimpleDetailList.add(localAppSimpleDetail);
    }
    this.appSimpleDetailList = ((ArrayList)paramJceInputStream.read(cache_appSimpleDetailList, 1, true));
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.ret, 0);
    paramJceOutputStream.write(this.appSimpleDetailList, 1);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\protocol\jce\GetAppSimpleDetailResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */