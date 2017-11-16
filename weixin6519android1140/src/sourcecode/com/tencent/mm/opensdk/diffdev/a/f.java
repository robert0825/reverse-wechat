package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.json.JSONObject;

final class f
  extends AsyncTask<Void, Void, a>
{
  private OAuthListener m;
  private String p;
  private String url;
  private int v;
  
  public f(String paramString, OAuthListener paramOAuthListener)
  {
    GMTrace.i(7113539584L, 53);
    this.p = paramString;
    this.m = paramOAuthListener;
    this.url = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", new Object[] { paramString });
    GMTrace.o(7113539584L, 53);
  }
  
  static final class a
  {
    public OAuthErrCode o;
    public String w;
    public int x;
    
    a()
    {
      GMTrace.i(6845104128L, 51);
      GMTrace.o(6845104128L, 51);
    }
    
    public static a b(byte[] paramArrayOfByte)
    {
      GMTrace.i(6979321856L, 52);
      a locala = new a();
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      {
        Log.e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
        locala.o = OAuthErrCode.WechatAuth_Err_NetworkErr;
        GMTrace.o(6979321856L, 52);
        return locala;
      }
      for (;;)
      {
        try
        {
          paramArrayOfByte = new String(paramArrayOfByte, "utf-8");
          locala.o = OAuthErrCode.WechatAuth_Err_OK;
        }
        catch (Exception paramArrayOfByte)
        {
          try
          {
            paramArrayOfByte = new JSONObject(paramArrayOfByte);
            locala.x = paramArrayOfByte.getInt("wx_errcode");
            Log.d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", new Object[] { Integer.valueOf(locala.x) }));
            switch (locala.x)
            {
            case 405: 
              locala.o = OAuthErrCode.WechatAuth_Err_NormalErr;
              GMTrace.o(6979321856L, 52);
              return locala;
            }
          }
          catch (Exception paramArrayOfByte)
          {
            Log.e("MicroMsg.SDK.NoopingResult", String.format("parse json fail, ex = %s", new Object[] { paramArrayOfByte.getMessage() }));
            locala.o = OAuthErrCode.WechatAuth_Err_NormalErr;
            GMTrace.o(6979321856L, 52);
            return locala;
          }
          paramArrayOfByte = paramArrayOfByte;
          Log.e("MicroMsg.SDK.NoopingResult", String.format("parse fail, build String fail, ex = %s", new Object[] { paramArrayOfByte.getMessage() }));
          locala.o = OAuthErrCode.WechatAuth_Err_NormalErr;
          GMTrace.o(6979321856L, 52);
          return locala;
        }
        locala.w = paramArrayOfByte.getString("wx_code");
        continue;
        locala.o = OAuthErrCode.WechatAuth_Err_OK;
        continue;
        locala.o = OAuthErrCode.WechatAuth_Err_OK;
        continue;
        locala.o = OAuthErrCode.WechatAuth_Err_Timeout;
        continue;
        locala.o = OAuthErrCode.WechatAuth_Err_Cancel;
        continue;
        locala.o = OAuthErrCode.WechatAuth_Err_NormalErr;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\diffdev\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */