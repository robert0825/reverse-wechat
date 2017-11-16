package com.tencent.mm.ad;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import oicq.wlogin_sdk.request.WUserSigInfo;
import oicq.wlogin_sdk.request.b.a;
import oicq.wlogin_sdk.request.i;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.tools.util;

public final class v
{
  private oicq.wlogin_sdk.request.b gvs;
  private long gvt;
  
  public v()
  {
    GMTrace.i(13390500069376L, 99767);
    this.gvt = 0L;
    this.gvs = null;
    try
    {
      long l = bg.Pv();
      this.gvs = new oicq.wlogin_sdk.request.b(ab.getContext(), com.tencent.mm.protocal.d.tJC);
      util.ytx = 1;
      util.yty = new a();
      w.d("MicroMsg.WtloginMgr", "dkstart wtlogin init :%d", new Object[] { Long.valueOf(bg.aH(l)) });
      GMTrace.o(13390500069376L, 99767);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.WtloginMgr", localException, "Failed initializing WtloginMgr.", new Object[0]);
      GMTrace.o(13390500069376L, 99767);
    }
  }
  
  public final byte[] Y(long paramLong)
  {
    GMTrace.i(13390902722560L, 99770);
    if (paramLong != this.gvt)
    {
      w.e("MicroMsg.WtloginMgr", "dkwt getVerifyImg Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.gvt), Long.valueOf(paramLong) });
      GMTrace.o(13390902722560L, 99770);
      return new byte[0];
    }
    try
    {
      byte[] arrayOfByte = this.gvs.fE(paramLong);
      GMTrace.o(13390902722560L, 99770);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.WtloginMgr", "dkwt getVerifyImg e:%s", new Object[] { localException.getMessage() });
      w.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13390902722560L, 99770);
    }
    return new byte[0];
  }
  
  public final byte[] Z(long paramLong)
  {
    GMTrace.i(13391171158016L, 99772);
    if (paramLong != this.gvt)
    {
      w.e("MicroMsg.WtloginMgr", "dkwt getA2KeyByRespBuf Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.gvt), Long.valueOf(paramLong) });
      GMTrace.o(13391171158016L, 99772);
      return new byte[0];
    }
    for (;;)
    {
      WloginSigInfo localWloginSigInfo;
      try
      {
        localWloginSigInfo = this.gvs.yrd.D(paramLong, 522017402L);
        if (localWloginSigInfo == null)
        {
          Object localObject1 = null;
          if (localObject1 != null) {
            break;
          }
          GMTrace.o(13391171158016L, 99772);
          return new byte[0];
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.WtloginMgr", "dkwt getA2KeyByRespBuf e:%s", new Object[] { localException.getMessage() });
        w.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bg.f(localException) });
        GMTrace.o(13391171158016L, 99772);
        return new byte[0];
      }
      localObject2 = new WUserSigInfo();
      ((WUserSigInfo)localObject2).get_clone(localWloginSigInfo);
    }
    Object localObject2 = ((WUserSigInfo)localObject2)._A2;
    GMTrace.o(13391171158016L, 99772);
    return (byte[])localObject2;
  }
  
  public final boolean a(long paramLong, byte[] paramArrayOfByte)
  {
    GMTrace.i(13390768504832L, 99769);
    if (paramLong != this.gvt)
    {
      w.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.gvt), Long.valueOf(paramLong) });
      GMTrace.o(13390768504832L, 99769);
      return false;
    }
    if (bg.bq(paramArrayOfByte))
    {
      w.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf respBuf is null.");
      GMTrace.o(13390768504832L, 99769);
      return false;
    }
    for (;;)
    {
      try
      {
        oicq.wlogin_sdk.request.b localb = this.gvs;
        if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
          break label306;
        }
        if (localb.yrj == null)
        {
          break label306;
          w.d("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf buflen:%d ret:%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(i) });
          if (i == 0)
          {
            GMTrace.o(13390768504832L, 99769);
            return true;
          }
        }
        else
        {
          util.Zk("user:" + localb.yrd._uin + " ResolveSvrData ...");
          i = localb.yrj.E(paramArrayOfByte, paramArrayOfByte.length);
          if (i == 1) {
            localb.fF(localb.yrd._uin);
          }
          util.Zk("user:" + localb.yrd._uin + " ResolveSvrData ret=" + i);
          continue;
        }
        GMTrace.o(13390768504832L, 99769);
      }
      catch (Exception paramArrayOfByte)
      {
        w.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf e:%s", new Object[] { paramArrayOfByte.getMessage() });
        w.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bg.f(paramArrayOfByte) });
        GMTrace.o(13390768504832L, 99769);
        return false;
      }
      return false;
      label306:
      int i = 64519;
    }
  }
  
  public final byte[] a(long paramLong, String paramString, boolean paramBoolean)
  {
    GMTrace.i(13390634287104L, 99768);
    if (r.hkj == 10006) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.WtloginMgr", "dkwt isTestWtLogin:%b val:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(r.hkk) });
      if (r.hkj != 10006) {
        break label105;
      }
      if (r.hkk != 1) {
        break;
      }
      r.hkk = 0;
      GMTrace.o(13390634287104L, 99768);
      return new byte[0];
    }
    if (r.hkk == 2)
    {
      GMTrace.o(13390634287104L, 99768);
      return new byte[0];
    }
    for (;;)
    {
      try
      {
        label105:
        this.gvt = paramLong;
        byte[] arrayOfByte;
        if (paramBoolean)
        {
          arrayOfByte = null;
          if (bg.bq(arrayOfByte)) {
            break label299;
          }
          bool = true;
          w.d("MicroMsg.WtloginMgr", "dkwt getReqLoginBuf sig:%d uin:%d manualauth:%b  byA1Buf:%b ", new Object[] { Integer.valueOf(8256), Long.valueOf(paramLong), Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
          paramBoolean = bg.bq(arrayOfByte);
          if (!paramBoolean)
          {
            GMTrace.o(13390634287104L, 99768);
            return arrayOfByte;
          }
        }
        else
        {
          arrayOfByte = this.gvs.a(paramLong, b.a.yrp, "");
          continue;
        }
        paramString = this.gvs.a(paramLong, b.a.yro, new String(bg.St(paramString), "ISO-8859-1"));
        GMTrace.o(13390634287104L, 99768);
        return paramString;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBuf e:%s", new Object[] { paramString.getMessage() });
        w.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bg.f(paramString) });
        GMTrace.o(13390634287104L, 99768);
        return new byte[0];
      }
      label299:
      bool = false;
    }
  }
  
  public final void aa(long paramLong)
  {
    GMTrace.i(13391305375744L, 99773);
    if (paramLong != this.gvt)
    {
      w.e("MicroMsg.WtloginMgr", "dkwt clearUserWtInfo Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.gvt), Long.valueOf(paramLong) });
      GMTrace.o(13391305375744L, 99773);
      return;
    }
    try
    {
      this.gvs.fF(paramLong);
      GMTrace.o(13391305375744L, 99773);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.WtloginMgr", "dkwt clearUserWtInfo e:%s", new Object[] { localException.getMessage() });
      w.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13391305375744L, 99773);
    }
  }
  
  public final byte[] c(long paramLong, String paramString)
  {
    GMTrace.i(13391036940288L, 99771);
    if (paramLong != this.gvt)
    {
      w.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBufbyVerifyImg Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.gvt), Long.valueOf(paramLong) });
      GMTrace.o(13391036940288L, 99771);
      return new byte[0];
    }
    if (bg.nm(paramString)) {}
    for (paramString = "****".getBytes();; paramString = paramString.getBytes()) {
      try
      {
        paramString = this.gvs.f(paramLong, paramString);
        GMTrace.o(13391036940288L, 99771);
        return paramString;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBufbyVerifyImg e:%s", new Object[] { paramString.getMessage() });
        w.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bg.f(paramString) });
        GMTrace.o(13391036940288L, 99771);
      }
    }
    return new byte[0];
  }
  
  final class a
    extends oicq.wlogin_sdk.tools.b
  {
    public a()
    {
      GMTrace.i(13398284697600L, 99825);
      GMTrace.o(13398284697600L, 99825);
    }
    
    public final void OnLog(int paramInt, String paramString1, String paramString2)
    {
      GMTrace.i(13398553133056L, 99827);
      if (paramInt == 1)
      {
        w.i("MicroMsg.WtloginMgr.Core", "[%s]%s", new Object[] { paramString1, paramString2 });
        GMTrace.o(13398553133056L, 99827);
        return;
      }
      if (paramInt == 2)
      {
        w.d("MicroMsg.WtloginMgr.Core", "[%s]%s", new Object[] { paramString1, paramString2 });
        GMTrace.o(13398553133056L, 99827);
        return;
      }
      if (paramInt == 0) {
        w.w("MicroMsg.WtloginMgr.Core", "[%s]%s", new Object[] { paramString1, paramString2 });
      }
      GMTrace.o(13398553133056L, 99827);
    }
    
    public final void n(int paramInt, String paramString)
    {
      GMTrace.i(13398418915328L, 99826);
      OnLog(paramInt, "", paramString);
      GMTrace.o(13398418915328L, 99826);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ad\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */