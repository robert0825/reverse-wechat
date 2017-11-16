package com.tencent.mm.ui.account;

import android.os.Bundle;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.g.a.a;
import com.tencent.mm.ui.g.a.a.1;
import com.tencent.mm.ui.g.a.a.a;
import com.tencent.mm.ui.g.a.c;
import com.tencent.mm.ui.g.a.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h
{
  ae handler;
  private c vPk;
  public a vRz;
  
  public h(c paramc, a parama)
  {
    GMTrace.i(2741933965312L, 20429);
    this.vPk = paramc;
    this.vRz = parama;
    GMTrace.o(2741933965312L, 20429);
  }
  
  public final void aJ(int paramInt, String paramString)
  {
    GMTrace.i(16019020054528L, 119351);
    Message localMessage = Message.obtain();
    localMessage.what = 1;
    localMessage.arg1 = paramInt;
    localMessage.obj = paramString;
    this.handler.sendMessage(localMessage);
    GMTrace.o(16019020054528L, 119351);
  }
  
  public final void bYB()
  {
    GMTrace.i(2742068183040L, 20430);
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(2677777891328L, 19951);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(2677777891328L, 19951);
          return;
          if (h.this.vRz != null)
          {
            h.this.vRz.onError(paramAnonymousMessage.arg1, (String)paramAnonymousMessage.obj);
            GMTrace.o(2677777891328L, 19951);
            return;
            if (h.this.vRz != null) {
              h.this.vRz.m(paramAnonymousMessage.getData());
            }
          }
        }
      }
    };
    Bundle localBundle = new Bundle();
    localBundle.putString("client_id", "290293790992170");
    localBundle.putString("client_secret", "6667e9307e67283c76028fd37189c096");
    localBundle.putString("grant_type", "fb_exchange_token");
    localBundle.putString("fb_exchange_token", this.vPk.wlZ);
    a.a local2 = new a.a()
    {
      public final void Vo(String paramAnonymousString)
      {
        GMTrace.i(2657779449856L, 19802);
        if ((paramAnonymousString == null) || (paramAnonymousString.length() == 0))
        {
          w.e("MicroMsg.RefreshTokenRunner", "response is null or nil");
          h.this.aJ(1, "response is null or nil");
          GMTrace.o(2657779449856L, 19802);
          return;
        }
        Object localObject1;
        if ((paramAnonymousString.contains("access_token")) && (paramAnonymousString.length() > 12))
        {
          for (;;)
          {
            String str1;
            JSONArray localJSONArray;
            Object localObject3;
            String str2;
            try
            {
              localObject1 = com.tencent.mm.ui.g.a.e.WK(paramAnonymousString);
              if (((JSONObject)localObject1).has("access_token"))
              {
                paramAnonymousString = new Bundle();
                localObject2 = ((JSONObject)localObject1).keys();
                if (!((Iterator)localObject2).hasNext()) {
                  break;
                }
                str1 = (String)((Iterator)localObject2).next();
                localJSONArray = ((JSONObject)localObject1).optJSONArray(str1);
                localObject3 = Double.valueOf(((JSONObject)localObject1).optDouble(str1));
                str2 = ((JSONObject)localObject1).optString(str1);
                if ((localJSONArray == null) || (localJSONArray.length() > 0)) {
                  break label201;
                }
                paramAnonymousString.putStringArray(str1, new String[0]);
                continue;
              }
              if (localJSONArray == null) {
                break label266;
              }
            }
            catch (Throwable paramAnonymousString)
            {
              w.printErrStackTrace("MicroMsg.RefreshTokenRunner", paramAnonymousString, "", new Object[0]);
              h.this.aJ(2, "decodeUrl fail");
              GMTrace.o(2657779449856L, 19802);
              return;
            }
            label201:
            int i;
            if (!Double.isNaN(localJSONArray.optDouble(0)))
            {
              localObject3 = new double[localJSONArray.length()];
              i = 0;
              while (i < localJSONArray.length())
              {
                localObject3[i] = localJSONArray.optDouble(i);
                i += 1;
              }
              paramAnonymousString.putDoubleArray(str1, (double[])localObject3);
            }
            else
            {
              label266:
              if ((localJSONArray != null) && (localJSONArray.optString(0) != null))
              {
                localObject3 = new String[localJSONArray.length()];
                i = 0;
                while (i < localJSONArray.length())
                {
                  localObject3[i] = localJSONArray.optString(i);
                  i += 1;
                }
                paramAnonymousString.putStringArray(str1, (String[])localObject3);
              }
              else if (!((Double)localObject3).isNaN())
              {
                paramAnonymousString.putDouble(str1, ((Double)localObject3).doubleValue());
              }
              else if (str2 != null)
              {
                paramAnonymousString.putString(str1, str2);
              }
              else
              {
                System.err.println("unable to transform json to bundle " + str1);
              }
            }
          }
          localObject1 = h.this;
          Object localObject2 = Message.obtain();
          ((Message)localObject2).what = 2;
          ((Message)localObject2).setData(paramAnonymousString);
          ((h)localObject1).handler.sendMessage((Message)localObject2);
          GMTrace.o(2657779449856L, 19802);
          return;
        }
        try
        {
          com.tencent.mm.ui.g.a.e.WK(paramAnonymousString);
          h.this.aJ(2, "parseJson error");
          GMTrace.o(2657779449856L, 19802);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          for (;;)
          {
            w.e("MicroMsg.RefreshTokenRunner", "parseJson exception : " + paramAnonymousString.getMessage());
            w.printErrStackTrace("MicroMsg.RefreshTokenRunner", paramAnonymousString, "", new Object[0]);
          }
        }
        catch (d paramAnonymousString)
        {
          localObject1 = "errCode = " + paramAnonymousString.mErrorCode + ", errType = " + paramAnonymousString.xbb + ", errMsg = " + paramAnonymousString.getMessage();
          w.e("MicroMsg.RefreshTokenRunner", "parseJson facebookerror, " + (String)localObject1);
          w.printErrStackTrace("MicroMsg.RefreshTokenRunner", paramAnonymousString, "", new Object[0]);
          h.this.aJ(3, (String)localObject1);
          GMTrace.o(2657779449856L, 19802);
        }
      }
      
      public final void a(FileNotFoundException paramAnonymousFileNotFoundException)
      {
        GMTrace.i(2658047885312L, 19804);
        w.e("MicroMsg.RefreshTokenRunner", "onFileNotFoundException");
        h.this.aJ(2, paramAnonymousFileNotFoundException.getMessage());
        GMTrace.o(2658047885312L, 19804);
      }
      
      public final void a(IOException paramAnonymousIOException)
      {
        GMTrace.i(2657913667584L, 19803);
        w.e("MicroMsg.RefreshTokenRunner", "onIOException");
        h.this.aJ(2, paramAnonymousIOException.getMessage());
        GMTrace.o(2657913667584L, 19803);
      }
      
      public final void a(MalformedURLException paramAnonymousMalformedURLException)
      {
        GMTrace.i(2658182103040L, 19805);
        w.e("MicroMsg.RefreshTokenRunner", "onMalformedURLException");
        h.this.aJ(2, paramAnonymousMalformedURLException.getMessage());
        GMTrace.o(2658182103040L, 19805);
      }
    };
    com.tencent.mm.sdk.f.e.post(new a.1(new a(this.vPk), "oauth/access_token", localBundle, "GET", local2, null), "AsyncFacebookRunner_request");
    GMTrace.o(2742068183040L, 20430);
  }
  
  public static abstract interface a
  {
    public abstract void m(Bundle paramBundle);
    
    public abstract void onError(int paramInt, String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */