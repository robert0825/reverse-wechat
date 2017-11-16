package com.tencent.mm.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.RemoteException;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mars.stn.StnLogic;
import com.tencent.mars.stn.StnLogic.ICallBack;
import com.tencent.mm.a.n;
import com.tencent.mm.a.o;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.protocal.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public final class af
  implements StnLogic.ICallBack
{
  private static WakerLock hhV;
  private static int hhW;
  private static int hhX;
  private static byte[] hhY;
  private static byte[] hhZ;
  
  static
  {
    GMTrace.i(13646453276672L, 101674);
    hhV = null;
    hhW = 1000000205;
    hhX = 205;
    GMTrace.o(13646453276672L, 101674);
  }
  
  public af()
  {
    GMTrace.i(13644305793024L, 101658);
    GMTrace.o(13644305793024L, 101658);
  }
  
  private static int a(ByteArrayOutputStream paramByteArrayOutputStream1, ByteArrayOutputStream paramByteArrayOutputStream2)
  {
    GMTrace.i(13646050623488L, 101671);
    if (aa.OY() == null)
    {
      GMTrace.o(13646050623488L, 101671);
      return 0;
    }
    try
    {
      byte[] arrayOfByte = aa.OY().OH();
      if (arrayOfByte != null)
      {
        paramByteArrayOutputStream1.write(arrayOfByte);
        hhY = arrayOfByte;
      }
      arrayOfByte = aa.OY().fYy;
      if (arrayOfByte != null)
      {
        paramByteArrayOutputStream2.write(arrayOfByte);
        hhZ = arrayOfByte;
      }
      int i = aa.OY().hgw.ww();
      GMTrace.o(13646050623488L, 101671);
      return i;
    }
    catch (Exception localException)
    {
      w.e("StnCallBack", exception2String(localException));
      if ((hhY == null) || (hhZ == null)) {}
    }
    try
    {
      paramByteArrayOutputStream1.write(hhY);
      paramByteArrayOutputStream2.write(hhZ);
      GMTrace.o(13646050623488L, 101671);
      return 0;
    }
    catch (IOException paramByteArrayOutputStream1)
    {
      for (;;) {}
    }
  }
  
  private static String exception2String(Exception paramException)
  {
    GMTrace.i(13644440010752L, 101659);
    StringWriter localStringWriter = new StringWriter();
    paramException.printStackTrace(new PrintWriter(localStringWriter));
    paramException = localStringWriter.toString();
    GMTrace.o(13644440010752L, 101659);
    return paramException;
  }
  
  public final int buf2Resp(int paramInt1, Object paramObject, byte[] paramArrayOfByte, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt2)
  {
    GMTrace.i(20313047826432L, 151344);
    if (aa.OZ() == null)
    {
      GMTrace.o(20313047826432L, 151344);
      return -1;
    }
    try
    {
      paramInt1 = aa.OZ().a(paramInt1, paramArrayOfByte, paramArrayOfInt1, paramArrayOfInt2);
      GMTrace.o(20313047826432L, 151344);
      return paramInt1;
    }
    catch (Exception paramObject)
    {
      w.e("StnCallBack", exception2String((Exception)paramObject));
      new StringBuilder().append(paramObject.getClass().getSimpleName()).append(":").append(paramObject.getStackTrace()[0]).append(", ").append(paramObject.getStackTrace()[1]);
      GMTrace.o(20313047826432L, 151344);
    }
    return -1;
  }
  
  public final int getLongLinkIdentifyCheckBuffer(ByteArrayOutputStream paramByteArrayOutputStream1, ByteArrayOutputStream paramByteArrayOutputStream2, int[] paramArrayOfInt)
  {
    GMTrace.i(13645647970304L, 101668);
    paramArrayOfInt[0] = hhX;
    paramArrayOfInt[1] = hhW;
    if ((a(paramByteArrayOutputStream1, paramByteArrayOutputStream2) == 0) || (paramByteArrayOutputStream1.size() == 0) || (paramByteArrayOutputStream2.size() == 0))
    {
      requestDoSync();
      i = StnLogic.ECHECK_NEXT;
      GMTrace.o(13645647970304L, 101668);
      return i;
    }
    int i = StnLogic.ECHECK_NOW;
    GMTrace.o(13645647970304L, 101668);
    return i;
  }
  
  public final boolean isLogoned()
  {
    GMTrace.i(13646319058944L, 101673);
    if (aa.OY() == null)
    {
      GMTrace.o(13646319058944L, 101673);
      return false;
    }
    try
    {
      boolean bool = aa.OY().hgw.DU();
      GMTrace.o(13646319058944L, 101673);
      return bool;
    }
    catch (Exception localException)
    {
      w.e("StnCallBack", exception2String(localException));
      new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
      GMTrace.o(13646319058944L, 101673);
    }
    return false;
  }
  
  public final boolean makesureAuthed()
  {
    GMTrace.i(13644574228480L, 101660);
    if (aa.OY() == null)
    {
      GMTrace.o(13644574228480L, 101660);
      return false;
    }
    try
    {
      boolean bool = aa.OY().OG();
      GMTrace.o(13644574228480L, 101660);
      return bool;
    }
    catch (Exception localException)
    {
      w.e("StnCallBack", exception2String(localException));
      new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
      GMTrace.o(13644574228480L, 101660);
    }
    return false;
  }
  
  public final void networkAnalysisCallBack(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
  {
    GMTrace.i(21017690898432L, 156594);
    w.i("StnCallBack", "networkAnalysisCallBack: status:%d, stage:%d, isDetectEnd:%b, kvInfo:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean), paramString });
    try
    {
      aa.OY().hgE.networkAnalysisCallBack(paramInt1, paramInt2, paramBoolean, paramString);
      GMTrace.o(21017690898432L, 156594);
      return;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("StnCallBack", paramString, "", new Object[0]);
      new StringBuilder().append(paramString.getClass().getSimpleName()).append(":").append(paramString.getStackTrace()[0]).append(", ").append(paramString.getStackTrace()[1]);
      GMTrace.o(21017690898432L, 156594);
    }
  }
  
  public final boolean onLongLinkIdentifyResp(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(13645782188032L, 101669);
    ByteArrayOutputStream localByteArrayOutputStream;
    if ((paramArrayOfByte1 != null) && (paramArrayOfByte2 != null)) {
      localByteArrayOutputStream = new ByteArrayOutputStream();
    }
    try
    {
      localByteArrayOutputStream.write(paramArrayOfByte1);
      localByteArrayOutputStream.write(paramArrayOfByte2);
      onPush(hhW, localByteArrayOutputStream.toByteArray());
      GMTrace.o(13645782188032L, 101669);
      return true;
    }
    catch (IOException paramArrayOfByte1)
    {
      for (;;) {}
    }
  }
  
  public final String[] onNewDns(String paramString)
  {
    GMTrace.i(13644708446208L, 101661);
    GMTrace.o(13644708446208L, 101661);
    return new String[0];
  }
  
  public final void onPush(final int paramInt, final byte[] paramArrayOfByte)
  {
    GMTrace.i(13644842663936L, 101662);
    if (aa.Pa() == null)
    {
      GMTrace.o(13644842663936L, 101662);
      return;
    }
    try
    {
      if (hhV == null) {
        hhV = new WakerLock(aa.getContext());
      }
      hhV.lock(1000L, "StnLogic.onNotify");
      aa.OW().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13692489957376L, 102017);
          aa.Pa().onPush(paramInt, paramArrayOfByte);
          GMTrace.o(13692489957376L, 102017);
        }
      });
      GMTrace.o(13644842663936L, 101662);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      w.e("StnCallBack", exception2String(paramArrayOfByte));
      new StringBuilder().append(paramArrayOfByte.getClass().getSimpleName()).append(":").append(paramArrayOfByte.getStackTrace()[0]).append(", ").append(paramArrayOfByte.getStackTrace()[1]);
      GMTrace.o(13644842663936L, 101662);
    }
  }
  
  public final int onTaskEnd(final int paramInt1, final Object paramObject, final int paramInt2, final int paramInt3)
  {
    GMTrace.i(13645245317120L, 101665);
    if (aa.OZ() == null)
    {
      GMTrace.o(13645245317120L, 101665);
      return 0;
    }
    i = 0;
    try
    {
      j = aa.OZ().hw(paramInt1);
      i = j;
      aa.OW().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13712891052032L, 102169);
          z localz = aa.OZ();
          int i1 = paramInt1;
          int j = paramInt2;
          int m = paramInt3;
          int n = -1;
          for (;;)
          {
            int i2;
            int i;
            int k;
            r localr;
            l locall;
            synchronized (localz.hht)
            {
              i2 = localz.hx(i1);
              if (-1 == i2)
              {
                w.e("MicroMsg.MMNativeNetTaskAdapter", "mmcgi onGYNetEnd GET FROM QUEUE failed. native:[%d,%d] taskId:%d ", new Object[] { Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(i1) });
                GMTrace.o(13712891052032L, 102169);
                return;
              }
              i = 0;
              long l;
              switch (j)
              {
              default: 
                w.f("MicroMsg.MMNativeNetTaskAdapter", "c2JavaErrorType not exits c_errType:%d", new Object[] { Integer.valueOf(j) });
                break label2049;
                k = i;
                j = m;
                if (!aa.OU().hhL)
                {
                  k = i;
                  j = m;
                  if (i == 1)
                  {
                    w.i("MicroMsg.MMNativeNetTaskAdapter", "network not available");
                    k = 2;
                    j = -1;
                  }
                }
                localr = localz.hht[i2].hhx;
                locall = localz.hht[i2].hhy;
                l = localz.hht[i2].startTime;
                localz.hht[i2] = null;
                if (k == 0) {
                  i = k;
                }
                break;
              case 0: 
              case 1: 
              case 2: 
              case 3: 
              case 4: 
              case 5: 
              case 6: 
              case 7: 
              case 8: 
              case 9: 
                try
                {
                  if (localr.Ek().Eo() == 0) {
                    break;
                  }
                  i = 4;
                  k = localr.Ek().Eo();
                  j = 4;
                  i = k;
                }
                catch (RemoteException localRemoteException5)
                {
                  t localt;
                  byte[] arrayOfByte;
                  com.tencent.mm.protocal.h localh;
                  k = n;
                  continue;
                }
                try
                {
                  k = localr.getType();
                  try
                  {
                    localt = aa.OY();
                    arrayOfByte = localr.Ek().DT();
                    try
                    {
                      w.d("MicroMsg.AutoAuth", "summerauth onGYNetEnd threadId: 0" + " errType: " + j + " errCode: " + i + " errMsg: " + null + " rr: " + localr + " type: " + localr.getType() + " netIdGetCertBeforeAutoAuth: " + localt.hgA);
                      if (i == 0) {
                        continue;
                      }
                      localt.hgr += 1;
                      localh = localr.Ek();
                      m = localr.getType();
                      switch (m)
                      {
                      }
                    }
                    catch (RemoteException localRemoteException1)
                    {
                      w.e("MicroMsg.AutoAuth", "exception:%s", new Object[] { bg.f(localRemoteException1) });
                      continue;
                    }
                    m = localr.DI();
                    w.i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi onTaskEnd type:%d time:%d hash[%d,%d] [%d,%d]", new Object[] { Integer.valueOf(k), Long.valueOf(bg.aH(l)), Integer.valueOf(i1), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(i) });
                    if ((4 == j) && ((-1 == i) || (-2 == i) || (-24 == i) || (-34 == i))) {
                      aa.OW().post(new z.1(localz, k, i));
                    }
                    try
                    {
                      String str1 = localr.Ek().En();
                      if ((str1 == null) || (str1.length() <= 0)) {
                        break label1974;
                      }
                      locall.a(i2, j, i, str1, localr, localr.Ek().DT());
                      GMTrace.o(13712891052032L, 102169);
                      return;
                    }
                    catch (Exception localException)
                    {
                      w.e("MicroMsg.MMNativeNetTaskAdapter", "onGYNetEnd cb %s", new Object[] { localException.getMessage() });
                      w.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s taskid:%d", new Object[] { bg.f(localException), Integer.valueOf(i1) });
                      GMTrace.o(13712891052032L, 102169);
                      return;
                    }
                    i = 0;
                  }
                  catch (RemoteException localRemoteException2)
                  {
                    m = j;
                    j = i;
                    i = m;
                  }
                  i = 2;
                }
                catch (RemoteException localRemoteException6)
                {
                  m = i;
                  k = n;
                  i = j;
                  j = m;
                  continue;
                  m = j;
                  n = i;
                  break label1937;
                }
                i = 2;
                break label2049;
                i = 1;
                break label2049;
                i = 1;
                break label2049;
                i = 1;
                break label2049;
                i = 1;
                break label2049;
                if ((62534 == m) || (62533 == m))
                {
                  i = 4;
                }
                else if (55535 == m)
                {
                  i = 6;
                }
                else
                {
                  i = 5;
                  break label2049;
                  i = 4;
                  break label2049;
                  i = 1;
                  break label2049;
                  if (localr.getType() == 10) {
                    continue;
                  }
                  localt.hgr = 0;
                  continue;
                  w.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s taskid:%d", new Object[] { bg.f(localRemoteException2), Integer.valueOf(i1) });
                  m = 0;
                  n = j;
                  j = i;
                  i = n;
                  continue;
                  w.i("MicroMsg.AutoAuth", "summerauth end type: %d, ret:[%d,%d][%s]", new Object[] { Integer.valueOf(localr.getType()), Integer.valueOf(j), Integer.valueOf(i), null });
                  if ((localh.Eo() != 0) || (j != 0) || (i != 0)) {
                    if (localr.getType() == 126) {
                      w.e("MicroMsg.AutoAuth", "net.end: reg err: type=" + localr.getType() + " err=" + j + "," + i + " errmsg=" + null);
                    }
                  }
                }
                break;
              }
            }
            switch (i)
            {
            default: 
              break;
            case -213: 
            case -205: 
            case -100: 
              com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences("auth_hold_prefs", 0).edit().putBoolean("auth_ishold", true).commit();
              if (i == 65323)
              {
                d.oqe.a(148L, 31L, 1L, false);
              }
              else if (i == -100)
              {
                d.oqe.a(148L, 32L, 1L, false);
              }
              else if (i == 65331)
              {
                d.oqe.a(148L, 33L, 1L, false);
                continue;
                m = localr.El();
                w.i("MicroMsg.AutoAuth", "summerauth accinfo doAuthEnd type:%d, ret:%d loginDecodeFailedTry:%d", new Object[] { Integer.valueOf(localr.getType()), Integer.valueOf(m), Integer.valueOf(localt.gUE) });
                String str2;
                Object localObject3;
                if (m == 2)
                {
                  if (localr.getType() == 702)
                  {
                    d.oqe.a(148L, 34L, 1L, false);
                    localt.gUE += 1;
                    if (localt.gUE > 1)
                    {
                      w.w("MicroMsg.AutoAuth", "summerauth loginDecodeFailedTry beyond 1 no more try!");
                      localt.d(j, i, "auth_decode_failed_" + bg.aq(null, ""));
                    }
                    else
                    {
                      for (;;)
                      {
                        try
                        {
                          m = localh.ww();
                          Object localObject2 = localh.Ep();
                          if (bg.bq((byte[])localObject2))
                          {
                            localObject2 = "";
                            if (!bg.bq(arrayOfByte)) {
                              break label1471;
                            }
                            str2 = "";
                            if (!localt.g((String)localObject2, str2, m)) {
                              break label1481;
                            }
                            localt.hgw.gvf = arrayOfByte;
                            localr.a(localt.hgx, 0, 0);
                          }
                        }
                        catch (RemoteException localRemoteException3)
                        {
                          w.printErrStackTrace("MicroMsg.AutoAuth", localRemoteException3, "summerauth save serverid aak failed 1 cookie:" + bg.bs(arrayOfByte), new Object[0]);
                          w.bPM();
                          throw localRemoteException3;
                        }
                        localObject3 = bg.bs(localRemoteException3);
                        continue;
                        label1471:
                        str2 = bg.bs(arrayOfByte);
                        continue;
                        label1481:
                        w.w("MicroMsg.AutoAuth", "summerauth save serverid aak failed 1");
                      }
                    }
                  }
                }
                else
                {
                  localt.gUE = 0;
                  g localg = localr.Ej();
                  try
                  {
                    w.i("MicroMsg.AutoAuth", "summerauth accinfo %d: username:%s, wxusername:%s, ticket:%s, session:%s, uin:%d", new Object[] { Integer.valueOf(localr.getType()), localg.getUserName(), localh.Et(), bg.SJ(bg.bp(localh.Ep())), bg.SJ(bg.bp(localh.wR())), Integer.valueOf(localh.ww()) });
                    m = localh.ww();
                    localObject3 = localh.Ep();
                    if (bg.bq((byte[])localObject3))
                    {
                      localObject3 = "";
                      label1629:
                      if (!bg.bq(arrayOfByte)) {
                        break label1765;
                      }
                      str2 = "";
                      label1642:
                      if (!localt.g((String)localObject3, str2, m)) {
                        break label1775;
                      }
                      localt.hgw.gvf = arrayOfByte;
                      localt.hgw.username = localg.getUserName();
                      localt.hgw.hgh = localh.Et();
                      localt.hgw.i(localh.wR(), localh.ww());
                      localt.hgw.hgg = localh.DV();
                      o.getString(localh.ww());
                    }
                    for (;;)
                    {
                      w.i("MicroMsg.AutoAuth", "summerauth decode and save ok!");
                      break;
                      localObject3 = bg.bs((byte[])localObject3);
                      break label1629;
                      label1765:
                      str2 = bg.bs(arrayOfByte);
                      break label1642;
                      label1775:
                      d.oqe.a(148L, 35L, 1L, false);
                      w.w("MicroMsg.AutoAuth", "summerauth save serverid aak failed 2");
                    }
                    if (j != 0) {
                      break label1895;
                    }
                  }
                  catch (RemoteException localRemoteException4)
                  {
                    w.printErrStackTrace("MicroMsg.AutoAuth", localRemoteException4, "summerauth save serverid aak failed 2 cookie:" + bg.bs(arrayOfByte), new Object[0]);
                    w.bPM();
                    throw localRemoteException4;
                  }
                  if (i == 0)
                  {
                    com.tencent.mm.protocal.ac.G(localr.Ek().Eq(), localr.Ek().Er(), localr.Ek().Es());
                    localt.hgz = SystemClock.elapsedRealtime();
                  }
                  label1895:
                  if ((com.tencent.mm.platformtools.r.hkj == 10003) && (com.tencent.mm.platformtools.r.hkk > 0))
                  {
                    if (com.tencent.mm.platformtools.r.hkk <= 1) {
                      com.tencent.mm.platformtools.r.hkk = 0;
                    }
                    m = 4;
                    n = 0;
                    com.tencent.mm.protocal.ac.G("", "", 0);
                    label1937:
                    if (localt.hgA != -1)
                    {
                      if ((m == 0) && (n == 0)) {
                        localt.a(localr, 0, 0);
                      }
                      localt.hgA = -1;
                      continue;
                      label1974:
                      locall.a(i2, j, i, null, localr, localr.Ek().DT());
                      GMTrace.o(13712891052032L, 102169);
                    }
                  }
                  else
                  {
                    i = j;
                    j = k;
                    continue;
                    label2049:
                    if (i == 0) {
                      m = 0;
                    }
                    if (i == 3) {
                      m = -1;
                    }
                  }
                }
              }
              break;
            }
          }
        }
      });
    }
    catch (Exception paramObject)
    {
      for (;;)
      {
        w.e("StnCallBack", exception2String((Exception)paramObject));
        new StringBuilder().append(paramObject.getClass().getSimpleName()).append(":").append(paramObject.getStackTrace()[0]).append(", ").append(paramObject.getStackTrace()[1]);
        int j = i;
      }
    }
    GMTrace.o(13645245317120L, 101665);
    return j;
  }
  
  public final void reportConnectInfo(int paramInt1, int paramInt2)
  {
    GMTrace.i(13645513752576L, 101667);
    try
    {
      aa.OV().hy(paramInt1);
      com.tencent.mm.ai.a.fY(paramInt1);
      GMTrace.o(13645513752576L, 101667);
      return;
    }
    catch (Exception localException)
    {
      w.e("StnCallBack", "reportConnectInfo :%s", new Object[] { bg.f(localException) });
      GMTrace.o(13645513752576L, 101667);
    }
  }
  
  public final boolean req2Buf(int paramInt1, Object paramObject, ByteArrayOutputStream paramByteArrayOutputStream, int[] paramArrayOfInt, int paramInt2)
  {
    GMTrace.i(13644976881664L, 101663);
    if (aa.OZ() == null)
    {
      GMTrace.o(13644976881664L, 101663);
      return false;
    }
    try
    {
      boolean bool = aa.OZ().a(paramInt1, paramByteArrayOutputStream, paramArrayOfInt, paramInt2);
      GMTrace.o(13644976881664L, 101663);
      return bool;
    }
    catch (Exception paramObject)
    {
      w.e("StnCallBack", exception2String((Exception)paramObject));
      new StringBuilder().append(paramObject.getClass().getSimpleName()).append(":").append(paramObject.getStackTrace()[0]).append(", ").append(paramObject.getStackTrace()[1]);
      GMTrace.o(13644976881664L, 101663);
    }
    return false;
  }
  
  public final void requestDoSync()
  {
    GMTrace.i(13646184841216L, 101672);
    if (aa.Pa() == null)
    {
      GMTrace.o(13646184841216L, 101672);
      return;
    }
    try
    {
      aa.OW().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13699603496960L, 102070);
          aa.Pa().onPush(24, n.cS(7));
          GMTrace.o(13699603496960L, 102070);
        }
      });
      GMTrace.o(13646184841216L, 101672);
      return;
    }
    catch (Exception localException)
    {
      w.e("StnCallBack", exception2String(localException));
      new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
      GMTrace.o(13646184841216L, 101672);
    }
  }
  
  public final String[] requestNetCheckShortLinkHosts()
  {
    GMTrace.i(13645916405760L, 101670);
    GMTrace.o(13645916405760L, 101670);
    return new String[0];
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */