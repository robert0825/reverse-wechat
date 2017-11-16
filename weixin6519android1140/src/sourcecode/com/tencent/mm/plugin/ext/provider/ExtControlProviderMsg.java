package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.ex;
import com.tencent.mm.g.a.ex.b;
import com.tencent.mm.g.a.ez;
import com.tencent.mm.g.a.fa;
import com.tencent.mm.g.a.fa.b;
import com.tencent.mm.g.a.fg;
import com.tencent.mm.g.a.fg.b;
import com.tencent.mm.g.a.fh;
import com.tencent.mm.g.a.fh.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.modelvoice.p;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtControlProviderMsg
  extends ExtContentProviderBase
{
  private static final UriMatcher kMX;
  private static final String[] kNa;
  private static final String[] kNb;
  private static final String[] kNc;
  private static final String[] kNd;
  private static final String[] kNe;
  private static final String[] kNf;
  private String[] kMI;
  private int kMJ;
  private boolean kMY;
  private Context kMZ;
  private MatrixCursor kNg;
  
  static
  {
    GMTrace.i(5732170727424L, 42708);
    kNa = new String[] { "msgId", "fromUserId", "fromUserNickName", "msgType", "contentType", "content", "status", "createTime" };
    kNb = new String[] { "userId", "unReadCount" };
    kNc = new String[] { "userId", "unReadCount" };
    kNd = new String[] { "userId", "retCode", "msgId" };
    kNe = new String[] { "msgId", "retCode" };
    kNf = new String[] { "msgId", "retCode" };
    UriMatcher localUriMatcher = new UriMatcher(-1);
    kMX = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.message", "oneMsg", 7);
    kMX.addURI("com.tencent.mm.plugin.ext.message", "unReadCount", 8);
    kMX.addURI("com.tencent.mm.plugin.ext.message", "unReadMsgs", 9);
    kMX.addURI("com.tencent.mm.plugin.ext.message", "unReadUserList", 10);
    kMX.addURI("com.tencent.mm.plugin.ext.message", "recordMsg", 11);
    kMX.addURI("com.tencent.mm.plugin.ext.message", "playVoice", 12);
    kMX.addURI("com.tencent.mm.plugin.ext.message", "setReaded", 13);
    kMX.addURI("com.tencent.mm.plugin.ext.message", "sendTextMsg", 14);
    GMTrace.o(5732170727424L, 42708);
  }
  
  public ExtControlProviderMsg()
  {
    GMTrace.i(5729486372864L, 42688);
    this.kNg = null;
    this.kMY = false;
    this.kMI = null;
    this.kMJ = -1;
    GMTrace.o(5729486372864L, 42688);
  }
  
  public ExtControlProviderMsg(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    GMTrace.i(5729620590592L, 42689);
    this.kNg = null;
    this.kMY = false;
    this.kMI = null;
    this.kMJ = -1;
    this.kMY = true;
    this.kMI = paramArrayOfString;
    this.kMJ = paramInt;
    this.kMZ = paramContext;
    GMTrace.o(5729620590592L, 42689);
  }
  
  private Cursor a(String[] paramArrayOfString, String paramString1, String paramString2)
  {
    GMTrace.i(5730694332416L, 42697);
    w.i("MicroMsg.ExtControlProviderMsg", "getUnReadMsgs() ");
    w.d("MicroMsg.ExtControlProviderMsg", "getUnReadMsgs(), %s, %s", new Object[] { paramString1, paramString2 });
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      w.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      bY(3, 3701);
      paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(3701);
      GMTrace.o(5730694332416L, 42697);
      return paramArrayOfString;
    }
    if (bg.nm(paramString1))
    {
      w.e("MicroMsg.ExtControlProviderMsg", "callSource == null");
      bY(3, 3702);
      paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(3702);
      GMTrace.o(5730694332416L, 42697);
      return paramArrayOfString;
    }
    if (bg.nm(paramString2))
    {
      w.e("MicroMsg.ExtControlProviderMsg", "countStr == null");
      bY(3, 3703);
      paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(3703);
      GMTrace.o(5730694332416L, 42697);
      return paramArrayOfString;
    }
    boolean bool1;
    if ((paramString1 != null) && (paramString1.equalsIgnoreCase("openapi"))) {
      bool1 = true;
    }
    x localx;
    boolean bool2;
    String str;
    int i;
    for (;;)
    {
      if (bool1) {}
      try
      {
        paramString1 = com.tencent.mm.plugin.ext.b.avk().UC(paramArrayOfString[0]);
        if ((paramString1 == null) || (bg.nm(paramString1.field_openId)) || (bg.nm(paramString1.field_username)))
        {
          w.e("MicroMsg.ExtControlProviderMsg", "openidInApp is null");
          bY(3, 3704);
          paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(3704);
          GMTrace.o(5730694332416L, 42697);
          return paramArrayOfString;
          bool1 = false;
        }
        else
        {
          at.AR();
          long l;
          for (localx = com.tencent.mm.y.c.yK().TE(paramString1.field_username); (localx == null) || (localx.field_username == null) || (localx.field_username.length() <= 0); localx = com.tencent.mm.y.c.yK().eQ(l))
          {
            w.e("MicroMsg.ExtControlProviderMsg", "contact is null");
            bY(3, 3705);
            paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(3705);
            GMTrace.o(5730694332416L, 42697);
            return paramArrayOfString;
            l = com.tencent.mm.plugin.ext.a.a.xk(paramArrayOfString[0]);
            at.AR();
          }
          bool2 = false;
          str = localx.vk();
          if (localx.field_username.endsWith("@chatroom"))
          {
            str = r.fs(localx.field_username);
            bool2 = true;
          }
          if (bool1)
          {
            i = 0;
            try
            {
              int j = bg.getInt(paramString2, 0);
              i = j;
            }
            catch (Exception paramString1)
            {
              for (;;)
              {
                w.e("MicroMsg.ExtControlProviderMsg", "exception in parseInt(%s)", new Object[] { paramString2 });
              }
            }
            if ((i <= 0) || (i >= 15))
            {
              at.AR();
              paramString1 = com.tencent.mm.y.c.yM().bp(localx.field_username, 15);
              if (paramString1 != null) {
                break label595;
              }
              w.e("MicroMsg.ExtControlProviderMsg", "msgCursor == null");
              A(3, 4, 3706);
              paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(3706);
              GMTrace.o(5730694332416L, 42697);
              return paramArrayOfString;
            }
          }
        }
      }
      catch (Exception paramArrayOfString)
      {
        paramString1 = null;
      }
    }
    for (;;)
    {
      w.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
      w.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
      if (paramString1 != null) {
        paramString1.close();
      }
      A(3, 4, 12);
      paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(12);
      GMTrace.o(5730694332416L, 42697);
      return paramArrayOfString;
      at.AR();
      paramString1 = com.tencent.mm.y.c.yM().bp(localx.field_username, i);
      break;
      at.AR();
      paramString1 = com.tencent.mm.y.c.yM().bp(localx.field_username, 3);
      break;
      label595:
      paramString2 = new MatrixCursor(kNa);
      try
      {
        if ((paramString1.getCount() > 0) && (paramString1.moveToFirst()))
        {
          au localau = new au();
          do
          {
            localau.b(paramString1);
            a(paramString2, localau, localx, bool2, str, bool1, paramArrayOfString[0]);
          } while (paramString1.moveToNext());
        }
        paramString1.close();
        A(2, 0, 1);
        GMTrace.o(5730694332416L, 42697);
        return paramString2;
      }
      catch (Exception paramArrayOfString)
      {
        paramString1 = paramString2;
      }
    }
  }
  
  private void a(MatrixCursor paramMatrixCursor, au paramau, x paramx, boolean paramBoolean1, String paramString1, boolean paramBoolean2, String paramString2)
  {
    GMTrace.i(5731633856512L, 42704);
    if (paramau == null)
    {
      GMTrace.o(5731633856512L, 42704);
      return;
    }
    if (bg.nm(paramString2))
    {
      w.d("MicroMsg.ExtControlProviderMsg", "userOpenId is null");
      GMTrace.o(5731633856512L, 42704);
      return;
    }
    if ((paramau.field_type == 9999) || (paramau.field_type == 10000))
    {
      GMTrace.o(5731633856512L, 42704);
      return;
    }
    String str2 = "";
    String str3 = "";
    String str1 = str3;
    Object localObject = str2;
    int i;
    if (paramBoolean1)
    {
      i = bc.gO(paramau.field_content);
      str1 = str3;
      localObject = str2;
      if (i != -1)
      {
        str1 = str3;
        localObject = str2;
        if (paramau.field_content.length() > i)
        {
          String str4 = paramau.field_content.substring(0, i).trim();
          str1 = str3;
          localObject = str2;
          if (str4 != null)
          {
            str1 = str3;
            localObject = str2;
            if (str4.length() > 0)
            {
              str1 = str3;
              localObject = str2;
              if (paramau.field_content.length() >= i + 2)
              {
                localObject = r.fs(str4);
                str1 = paramau.field_content.substring(i + 2);
              }
            }
          }
        }
      }
    }
    int k = com.tencent.mm.plugin.ext.b.b.L(paramau);
    if (k == 1) {
      if (paramBoolean1)
      {
        localObject = (String)localObject + "!]" + str1;
        if (!paramBoolean2) {
          break label413;
        }
      }
    }
    label413:
    label575:
    for (;;)
    {
      try
      {
        if (bg.nm(paramString2))
        {
          w.w("MicroMsg.ExtControlProviderMsg", "userId is null");
          GMTrace.o(5731633856512L, 42704);
          return;
          localObject = paramau.field_content;
          break;
          if (k == 2)
          {
            localObject = m.NK().hr((int)paramau.field_msgId);
            if ((localObject == null) || (((p)localObject).euR == null)) {
              break label575;
            }
            localObject = q.getFullPath(((p)localObject).euR);
            w.d("MicroMsg.ExtControlProviderMsg", "voice file = %s", new Object[] { localObject });
            break;
          }
          if (paramBoolean1) {
            break;
          }
          if (this.kMZ != null)
          {
            localObject = this.kMZ.getString(R.l.dsj);
            break;
          }
          localObject = "";
          break;
          paramString2 = com.tencent.mm.plugin.ext.a.a.bW((int)paramx.fTq);
          continue;
        }
        paramx = com.tencent.mm.plugin.ext.a.a.bW(paramau.field_msgId);
        if (paramau.field_isSend == 0)
        {
          i = 1;
          if (paramau.field_status == 4)
          {
            j = 1;
            paramMatrixCursor.addRow(new Object[] { paramx, paramString2, paramString1, Integer.valueOf(i), Integer.valueOf(k), localObject, Integer.valueOf(j), Long.valueOf(paramau.field_createTime) });
            GMTrace.o(5731633856512L, 42704);
          }
        }
        else
        {
          i = 2;
          continue;
        }
        int j = 2;
        continue;
        localObject = "";
      }
      catch (Exception paramMatrixCursor)
      {
        w.e("MicroMsg.ExtControlProviderMsg", paramMatrixCursor.getMessage());
        w.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramMatrixCursor, "", new Object[0]);
        GMTrace.o(5731633856512L, 42704);
        return;
      }
    }
  }
  
  private Cursor avv()
  {
    GMTrace.i(5730828550144L, 42698);
    w.d("MicroMsg.ExtControlProviderMsg", "getUnReadUserList()");
    MatrixCursor localMatrixCursor = new MatrixCursor(kNc);
    label277:
    for (;;)
    {
      try
      {
        at.AR();
        Cursor localCursor = com.tencent.mm.y.c.yM().aOo();
        if (localCursor != null)
        {
          if (localCursor.moveToFirst())
          {
            String str = localCursor.getString(localCursor.getColumnIndex("talker"));
            at.AR();
            x localx = com.tencent.mm.y.c.yK().TE(str);
            if (!s.eb(str))
            {
              if ((s.gm(localx.field_username)) || (s.gk(localx.field_username)) || (x.At(localx.field_verifyFlag)) || (s.gc(localx.field_username))) {
                break label277;
              }
              if (!s.gd(localx.field_username)) {
                continue;
              }
              break label277;
              if (i == 0) {
                localMatrixCursor.addRow(new Object[] { com.tencent.mm.plugin.ext.a.a.bW((int)localx.fTq), Integer.valueOf(localCursor.getInt(localCursor.getColumnIndex("unReadCount"))) });
              }
            }
            if (localCursor.moveToNext()) {
              continue;
            }
          }
          else
          {
            localCursor.close();
          }
        }
        else
        {
          nl(0);
          GMTrace.o(5730828550144L, 42698);
          return localMatrixCursor;
        }
        int i = 1;
        continue;
        i = 0;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.ExtControlProviderMsg", localException.getMessage());
        w.printErrStackTrace("MicroMsg.ExtControlProviderMsg", localException, "", new Object[0]);
        localMatrixCursor.close();
        nl(4);
        GMTrace.o(5730828550144L, 42698);
        return null;
      }
    }
  }
  
  private Cursor c(String[] paramArrayOfString, String paramString)
  {
    GMTrace.i(5730962767872L, 42699);
    w.d("MicroMsg.ExtControlProviderMsg", "getOneMsg()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      w.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      nl(3);
      GMTrace.o(5730962767872L, 42699);
      return null;
    }
    for (;;)
    {
      try
      {
        long l = com.tencent.mm.plugin.ext.a.a.xk(paramArrayOfString[0]);
        at.AR();
        localau = com.tencent.mm.y.c.yM().cM(l);
        at.AR();
        localx = com.tencent.mm.y.c.yK().TE(localau.field_talker);
        if ((localx == null) || ((int)localx.fTq <= 0))
        {
          nl(3);
          GMTrace.o(5730962767872L, 42699);
          return null;
        }
        bool1 = false;
        str = localx.vk();
        if (localx.field_username.endsWith("@chatroom"))
        {
          str = r.fs(localx.field_username);
          bool1 = true;
        }
        if ((paramString != null) && (paramString.equalsIgnoreCase("openapi")))
        {
          bool2 = true;
          paramString = new MatrixCursor(kNa);
        }
      }
      catch (Exception paramArrayOfString)
      {
        au localau;
        x localx;
        boolean bool1;
        String str;
        boolean bool2;
        paramString = null;
      }
      try
      {
        a(paramString, localau, localx, bool1, str, bool2, paramArrayOfString[0]);
        nl(0);
        GMTrace.o(5730962767872L, 42699);
        return paramString;
      }
      catch (Exception paramArrayOfString)
      {
        for (;;) {}
      }
      bool2 = false;
    }
    w.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
    w.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
    if (paramString != null) {
      paramString.close();
    }
    nl(4);
    GMTrace.o(5730962767872L, 42699);
    return null;
  }
  
  private Cursor n(String[] paramArrayOfString)
  {
    GMTrace.i(5730560114688L, 42696);
    w.d("MicroMsg.ExtControlProviderMsg", "getUnReadCount()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      w.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      nl(3);
      GMTrace.o(5730560114688L, 42696);
      return null;
    }
    MatrixCursor localMatrixCursor = new MatrixCursor(kNb);
    try
    {
      if ("*".equals(paramArrayOfString[0]))
      {
        at.AR();
        localMatrixCursor.addRow(new Object[] { "0", Integer.valueOf(com.tencent.mm.y.c.yP().gu("")) });
      }
      for (;;)
      {
        nl(0);
        GMTrace.o(5730560114688L, 42696);
        return localMatrixCursor;
        int i = 0;
        while (i < paramArrayOfString.length)
        {
          long l = com.tencent.mm.plugin.ext.a.a.xk(paramArrayOfString[i]);
          at.AR();
          x localx = com.tencent.mm.y.c.yK().eQ(l);
          if ((localx != null) && ((int)localx.fTq > 0))
          {
            at.AR();
            localMatrixCursor.addRow(new Object[] { Long.valueOf(l), Integer.valueOf(com.tencent.mm.y.c.yP().gu(" and ( rconversation.username='" + localx.field_username + "' );")) });
          }
          i += 1;
        }
      }
      return null;
    }
    catch (Exception paramArrayOfString)
    {
      w.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
      w.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
      localMatrixCursor.close();
      nl(4);
      GMTrace.o(5730560114688L, 42696);
    }
  }
  
  private Cursor o(final String[] paramArrayOfString)
  {
    GMTrace.i(5731096985600L, 42700);
    w.d("MicroMsg.ExtControlProviderMsg", "handleRecordMsg()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length < 2))
    {
      w.w("MicroMsg.ExtControlProviderMsg", "wrong args");
      nl(3);
      GMTrace.o(5731096985600L, 42700);
      return null;
    }
    try
    {
      final int i = Integer.valueOf(paramArrayOfString[0]).intValue();
      final long l = com.tencent.mm.plugin.ext.a.a.xk(paramArrayOfString[1]);
      if (l <= 0L)
      {
        nl(3);
        GMTrace.o(5731096985600L, 42700);
        return null;
      }
      com.tencent.mm.pluginsdk.f.a.b localb = new com.tencent.mm.pluginsdk.f.a.b();
      localb.b(4000L, new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5718480519168L, 42606);
          Object localObject1;
          Object localObject2;
          if (i == 1)
          {
            com.tencent.mm.plugin.ext.b.avh();
            localObject1 = com.tencent.mm.plugin.ext.b.bU(l);
            if ((localObject1 == null) || ((int)((com.tencent.mm.l.a)localObject1).fTq <= 0))
            {
              ExtControlProviderMsg.this.nl(3);
              paramArrayOfString.countDown();
              GMTrace.o(5718480519168L, 42606);
              return;
            }
            localObject2 = new fa();
            ((fa)localObject2).eHe.op = 1;
            ((fa)localObject2).eHe.username = ((af)localObject1).field_username;
            if (!com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2))
            {
              ExtControlProviderMsg.this.nl(4);
              paramArrayOfString.countDown();
              GMTrace.o(5718480519168L, 42606);
              return;
            }
            ExtControlProviderMsg.a(ExtControlProviderMsg.this, new MatrixCursor(ExtControlProviderMsg.avw()));
            if ((localObject1 != null) && ((int)((com.tencent.mm.l.a)localObject1).fTq > 0) && (((fa)localObject2).eHf.eDb))
            {
              ExtControlProviderMsg.a(ExtControlProviderMsg.this).addRow(new Object[] { this.hTq[1], Integer.valueOf(1), "0" });
              ExtControlProviderMsg.this.nl(0);
              w.d("MicroMsg.ExtControlProviderMsg", "start record, ret=[%s], fileName=[%s]", new Object[] { Boolean.valueOf(((fa)localObject2).eHf.eDb), ((fa)localObject2).eHf.euR });
            }
          }
          for (;;)
          {
            paramArrayOfString.countDown();
            GMTrace.o(5718480519168L, 42606);
            return;
            ExtControlProviderMsg.a(ExtControlProviderMsg.this).addRow(new Object[] { this.hTq[1], Integer.valueOf(2), "0" });
            ExtControlProviderMsg.this.nl(3);
            break;
            if (i == 2)
            {
              localObject1 = new fa();
              ((fa)localObject1).eHe.op = 2;
              if (!com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1))
              {
                ExtControlProviderMsg.this.nl(4);
                paramArrayOfString.countDown();
                GMTrace.o(5718480519168L, 42606);
                return;
              }
              localObject2 = ((fa)localObject1).eHf.euR;
              ExtControlProviderMsg.a(ExtControlProviderMsg.this, new MatrixCursor(ExtControlProviderMsg.avw()));
              fg localfg = new fg();
              localfg.eHB.euR = ((String)localObject2);
              if (!com.tencent.mm.sdk.b.a.vgX.m(localfg))
              {
                ExtControlProviderMsg.this.nl(4);
                ExtControlProviderMsg.a(ExtControlProviderMsg.this).close();
                paramArrayOfString.countDown();
                GMTrace.o(5718480519168L, 42606);
                return;
              }
              w.d("MicroMsg.ExtControlProviderMsg", "stop record, msgId=[%s]", new Object[] { Long.valueOf(localfg.eHC.eDr) });
              long l = localfg.eHC.eDr;
              if (l > 0L)
              {
                try
                {
                  if (!((fa)localObject1).eHf.eDb) {
                    break label655;
                  }
                  if ((ab.getContext() == null) || (!am.isConnected(ab.getContext()))) {
                    break label606;
                  }
                  ExtControlProviderMsg.a(ExtControlProviderMsg.this).addRow(new Object[] { this.hTq[1], Integer.valueOf(1), com.tencent.mm.plugin.ext.a.a.bW(l) });
                  ExtControlProviderMsg.this.nl(0);
                }
                catch (Exception localException)
                {
                  w.w("MicroMsg.ExtControlProviderMsg", localException.getMessage());
                  w.printErrStackTrace("MicroMsg.ExtControlProviderMsg", localException, "", new Object[0]);
                  ExtControlProviderMsg.this.nl(4);
                }
                continue;
                label606:
                ExtControlProviderMsg.a(ExtControlProviderMsg.this).addRow(new Object[] { this.hTq[1], Integer.valueOf(6), com.tencent.mm.plugin.ext.a.a.bW(l) });
                ExtControlProviderMsg.this.nl(4);
                continue;
                label655:
                ExtControlProviderMsg.a(ExtControlProviderMsg.this).addRow(new Object[] { this.hTq[1], Integer.valueOf(4), com.tencent.mm.plugin.ext.a.a.bW(l) });
                ExtControlProviderMsg.this.nl(4);
              }
              else
              {
                ExtControlProviderMsg.this.nl(3);
              }
            }
          }
        }
      });
      paramArrayOfString = this.kNg;
      GMTrace.o(5731096985600L, 42700);
      return paramArrayOfString;
    }
    catch (Exception paramArrayOfString)
    {
      w.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
      w.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
      if (this.kNg != null) {
        this.kNg.close();
      }
      nl(4);
      GMTrace.o(5731096985600L, 42700);
    }
    return null;
  }
  
  private Cursor p(String[] paramArrayOfString)
  {
    GMTrace.i(5731231203328L, 42701);
    w.d("MicroMsg.ExtControlProviderMsg", "handlePlayVoice()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length < 2))
    {
      w.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      nl(3);
      GMTrace.o(5731231203328L, 42701);
      return null;
    }
    fh localfh = null;
    try
    {
      i = Integer.valueOf(paramArrayOfString[0]).intValue();
      long l = com.tencent.mm.plugin.ext.a.a.xk(paramArrayOfString[1]);
      if (l <= 0L)
      {
        nl(3);
        GMTrace.o(5731231203328L, 42701);
        return null;
      }
      if (i != 3) {
        break label387;
      }
      localObject = new MatrixCursor(kNe);
      try
      {
        localfh = new fh();
        localfh.eHD.eDr = l;
        com.tencent.mm.sdk.b.a.vgX.m(localfh);
        if ((localfh.eHE.euR == null) || (localfh.eHE.euR.length() <= 0))
        {
          ((MatrixCursor)localObject).addRow(new Object[] { paramArrayOfString[1], Integer.valueOf(2) });
          nl(4);
          GMTrace.o(5731231203328L, 42701);
          return (Cursor)localObject;
        }
        ez localez = new ez();
        localez.eGZ.op = 1;
        localez.eGZ.euR = localfh.eHE.euR;
        if (com.tencent.mm.sdk.b.a.vgX.m(localez))
        {
          ((MatrixCursor)localObject).addRow(new Object[] { paramArrayOfString[1], Integer.valueOf(1) });
          nl(0);
        }
        for (;;)
        {
          com.tencent.mm.plugin.ext.b.avh();
          com.tencent.mm.plugin.ext.b.bV(l);
          GMTrace.o(5731231203328L, 42701);
          return (Cursor)localObject;
          w.e("MicroMsg.ExtControlProviderMsg", "play failed");
          ((MatrixCursor)localObject).addRow(new Object[] { paramArrayOfString[1], Integer.valueOf(2) });
          nl(4);
        }
        w.e("MicroMsg.ExtControlProviderMsg", ((Exception)localObject).getMessage());
      }
      catch (Exception localException2)
      {
        paramArrayOfString = (String[])localObject;
        localObject = localException2;
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        int i;
        Object localObject;
        paramArrayOfString = localException2;
      }
    }
    w.printErrStackTrace("MicroMsg.ExtControlProviderMsg", (Throwable)localObject, "", new Object[0]);
    if (paramArrayOfString != null) {
      paramArrayOfString.close();
    }
    nl(4);
    GMTrace.o(5731231203328L, 42701);
    return null;
    label387:
    if (i == 4)
    {
      paramArrayOfString = new ez();
      paramArrayOfString.eGZ.op = 2;
      if (!com.tencent.mm.sdk.b.a.vgX.m(paramArrayOfString)) {
        break label442;
      }
      w.i("MicroMsg.ExtControlProviderMsg", "stop last playing");
      nl(0);
    }
    for (;;)
    {
      GMTrace.o(5731231203328L, 42701);
      return null;
      label442:
      w.i("MicroMsg.ExtControlProviderMsg", "stop last playing fail");
      nl(4);
    }
  }
  
  private Cursor q(String[] paramArrayOfString)
  {
    GMTrace.i(5731365421056L, 42702);
    w.i("MicroMsg.ExtControlProviderMsg", "setMsgReaded()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      w.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      bY(3, 3801);
      paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(3801);
      GMTrace.o(5731365421056L, 42702);
      return paramArrayOfString;
    }
    int i = 0;
    for (;;)
    {
      try
      {
        if (i < paramArrayOfString.length) {
          if ((paramArrayOfString[i] == null) || (paramArrayOfString[i].length() <= 0))
          {
            w.w("MicroMsg.ExtControlProviderMsg", "setMsgReaded() wrongArgs i = " + i);
          }
          else
          {
            long l = com.tencent.mm.plugin.ext.a.a.xk(paramArrayOfString[i]);
            com.tencent.mm.plugin.ext.b.avh();
            com.tencent.mm.plugin.ext.b.bV(l);
          }
        }
      }
      catch (Exception paramArrayOfString)
      {
        w.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
        w.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
        bY(4, 12);
        paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(12);
        GMTrace.o(5731365421056L, 42702);
        return paramArrayOfString;
      }
      bY(0, 1);
      paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(1);
      GMTrace.o(5731365421056L, 42702);
      return paramArrayOfString;
      i += 1;
    }
  }
  
  private Cursor r(final String[] paramArrayOfString)
  {
    GMTrace.i(5731499638784L, 42703);
    w.d("MicroMsg.ExtControlProviderMsg", "sendTextMsg()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      w.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      nl(3);
      GMTrace.o(5731499638784L, 42703);
      return null;
    }
    try
    {
      long l = com.tencent.mm.plugin.ext.a.a.xk(paramArrayOfString[0]);
      if (l <= 0L)
      {
        nl(3);
        GMTrace.o(5731499638784L, 42703);
        return null;
      }
      com.tencent.mm.plugin.ext.b.avh();
      final x localx = com.tencent.mm.plugin.ext.b.bU(l);
      if ((localx == null) || ((int)localx.fTq <= 0))
      {
        w.e("MicroMsg.ExtControlProviderMsg", "toContact is null ");
        nl(3);
        GMTrace.o(5731499638784L, 42703);
        return null;
      }
      this.kNg = new MatrixCursor(kNf);
      final com.tencent.mm.pluginsdk.f.a.b localb = new com.tencent.mm.pluginsdk.f.a.b();
      localb.b(15000L, new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5726667800576L, 42667);
          Object localObject = new ex();
          ((ex)localObject).eGU.toUserName = localx.field_username;
          ((ex)localObject).eGU.content = paramArrayOfString[1];
          ((ex)localObject).eGU.type = s.go(localx.field_username);
          ((ex)localObject).eGU.flags = 0;
          if (!com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject))
          {
            ExtControlProviderMsg.this.nl(4);
            localb.countDown();
            GMTrace.o(5726667800576L, 42667);
            return;
          }
          k localk = ((ex)localObject).eGV.eGW;
          try
          {
            localObject = new e()
            {
              public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, k paramAnonymous2k)
              {
                GMTrace.i(5726399365120L, 42665);
                w.d("MicroMsg.ExtControlProviderMsg", "onSceneEnd errType=%s, errCode=%s", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) });
                if (paramAnonymous2k == null)
                {
                  w.e("MicroMsg.ExtControlProviderMsg", "scene == null");
                  at.wS().b(522, this);
                  ExtControlProviderMsg.this.nl(4);
                  ExtControlProviderMsg.2.this.jjy.countDown();
                  GMTrace.o(5726399365120L, 42665);
                  return;
                }
                switch (paramAnonymous2k.getType())
                {
                default: 
                  ExtControlProviderMsg.this.nl(0);
                }
                for (;;)
                {
                  ExtControlProviderMsg.2.this.jjy.countDown();
                  at.wS().b(522, this);
                  GMTrace.o(5726399365120L, 42665);
                  return;
                  if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0))
                  {
                    w.d("MicroMsg.ExtControlProviderMsg", "rtSENDMSG onSceneEnd ok, ");
                    ExtControlProviderMsg.a(ExtControlProviderMsg.this).addRow(new Object[] { this.kNl, Integer.valueOf(1) });
                    break;
                  }
                  w.e("MicroMsg.ExtControlProviderMsg", "rtSENDMSG onSceneEnd err, errType = " + paramAnonymous2Int1 + ", errCode = " + paramAnonymous2Int2);
                  ExtControlProviderMsg.a(ExtControlProviderMsg.this).addRow(new Object[] { this.kNl, Integer.valueOf(2) });
                  ExtControlProviderMsg.this.nl(4);
                }
              }
            };
            at.wS().a(522, (e)localObject);
            at.wS().a(localk, 0);
            GMTrace.o(5726667800576L, 42667);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.ExtControlProviderMsg", localException.getMessage());
            w.printErrStackTrace("MicroMsg.ExtControlProviderMsg", localException, "", new Object[0]);
            ExtControlProviderMsg.this.nl(4);
            localb.countDown();
            GMTrace.o(5726667800576L, 42667);
          }
        }
      });
      paramArrayOfString = this.kNg;
      GMTrace.o(5731499638784L, 42703);
      return paramArrayOfString;
    }
    catch (Exception paramArrayOfString)
    {
      w.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
      w.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
      if (this.kNg != null) {
        this.kNg.close();
      }
      nl(4);
      GMTrace.o(5731499638784L, 42703);
    }
    return null;
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(5730291679232L, 42694);
    GMTrace.o(5730291679232L, 42694);
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    GMTrace.i(5729754808320L, 42690);
    GMTrace.o(5729754808320L, 42690);
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    GMTrace.i(5730157461504L, 42693);
    GMTrace.o(5730157461504L, 42693);
    return null;
  }
  
  public boolean onCreate()
  {
    GMTrace.i(5729889026048L, 42691);
    GMTrace.o(5729889026048L, 42691);
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    GMTrace.i(5730023243776L, 42692);
    w.i("MicroMsg.ExtControlProviderMsg", "ExtControlProviderMsg query() mIsLocalUsed :" + this.kMY);
    if (this.kMY)
    {
      a(paramUri, this.kMZ, this.kMJ, this.kMI);
      if (bg.nm(this.kMR))
      {
        w.e("MicroMsg.ExtControlProviderMsg", "AppID == null");
        bY(3, 7);
        paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(7);
        GMTrace.o(5730023243776L, 42692);
        return paramUri;
      }
      if (bg.nm(avt()))
      {
        w.e("MicroMsg.ExtControlProviderMsg", "PkgName == null");
        bY(3, 6);
        paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(6);
        GMTrace.o(5730023243776L, 42692);
        return paramUri;
      }
      int i = avu();
      if (i != 1)
      {
        w.e("MicroMsg.ExtControlProviderMsg", "invalid appid ! return code = " + i);
        bY(2, i);
        paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(i);
        GMTrace.o(5730023243776L, 42692);
        return paramUri;
      }
    }
    else
    {
      this.kMZ = getContext();
      a(paramUri, this.kMZ, kMX);
      if (paramUri == null)
      {
        nl(3);
        GMTrace.o(5730023243776L, 42692);
        return null;
      }
      if ((bg.nm(this.kMR)) || (bg.nm(avt())))
      {
        nl(3);
        GMTrace.o(5730023243776L, 42692);
        return null;
      }
      if (!agO())
      {
        nl(1);
        paramUri = this.jjo;
        GMTrace.o(5730023243776L, 42692);
        return paramUri;
      }
      if (!cn(this.kMZ))
      {
        w.w("MicroMsg.ExtControlProviderMsg", "invalid appid ! return null");
        nl(2);
        GMTrace.o(5730023243776L, 42692);
        return null;
      }
    }
    paramArrayOfString1 = bg.nl(paramUri.getQueryParameter("source"));
    paramString1 = bg.nl(paramUri.getQueryParameter("count"));
    if (!this.kMY) {
      this.kMJ = kMX.match(paramUri);
    }
    switch (this.kMJ)
    {
    default: 
      bY(3, 15);
      GMTrace.o(5730023243776L, 42692);
      return null;
    case 7: 
      paramUri = c(paramArrayOfString2, paramArrayOfString1);
      GMTrace.o(5730023243776L, 42692);
      return paramUri;
    case 8: 
      paramUri = n(paramArrayOfString2);
      GMTrace.o(5730023243776L, 42692);
      return paramUri;
    case 9: 
      paramUri = a(paramArrayOfString2, paramArrayOfString1, paramString1);
      GMTrace.o(5730023243776L, 42692);
      return paramUri;
    case 10: 
      paramUri = avv();
      GMTrace.o(5730023243776L, 42692);
      return paramUri;
    case 11: 
      paramUri = o(paramArrayOfString2);
      GMTrace.o(5730023243776L, 42692);
      return paramUri;
    case 12: 
      paramUri = p(paramArrayOfString2);
      GMTrace.o(5730023243776L, 42692);
      return paramUri;
    case 13: 
      paramUri = q(paramArrayOfString2);
      GMTrace.o(5730023243776L, 42692);
      return paramUri;
    }
    paramUri = r(paramArrayOfString2);
    GMTrace.o(5730023243776L, 42692);
    return paramUri;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(5730425896960L, 42695);
    GMTrace.o(5730425896960L, 42695);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\provider\ExtControlProviderMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */