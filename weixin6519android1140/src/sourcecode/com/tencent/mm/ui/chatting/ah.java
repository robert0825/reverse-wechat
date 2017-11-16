package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.af.a.c;
import com.tencent.mm.af.h.a;
import com.tencent.mm.af.i;
import com.tencent.mm.af.x;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.cn;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.a.nb;
import com.tencent.mm.g.a.nb.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.k.e;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.j;
import com.tencent.mm.pluginsdk.ui.chat.l.a;
import com.tencent.mm.pluginsdk.ui.chat.l.b;
import com.tencent.mm.protocal.c.btz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.m;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import com.tencent.mm.y.t;
import java.util.LinkedList;
import java.util.Map;

public abstract class ah
{
  protected final int jHw;
  protected boolean tIv;
  public boolean wqK;
  private final long wvx;
  
  public ah(int paramInt)
  {
    GMTrace.i(2120371666944L, 15798);
    this.wvx = 120000L;
    this.jHw = paramInt;
    GMTrace.o(2120371666944L, 15798);
  }
  
  protected static boolean VU(String paramString)
  {
    GMTrace.i(2125740376064L, 15838);
    if (((!s.fP(paramString)) && (!s.gf(paramString)) && (!s.fD(paramString)) && (!s.gn(paramString))) || (s.eb(paramString)))
    {
      GMTrace.o(2125740376064L, 15838);
      return true;
    }
    GMTrace.o(2125740376064L, 15838);
    return false;
  }
  
  public static String a(au paramau, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str1 = null;
    GMTrace.i(2122519150592L, 15814);
    if (paramau == null)
    {
      GMTrace.o(2122519150592L, 15814);
      return null;
    }
    if (paramau.field_isSend == 1)
    {
      paramau = com.tencent.mm.y.q.zE();
      GMTrace.o(2122519150592L, 15814);
      return paramau;
    }
    if (paramBoolean1) {
      str1 = bc.gP(paramau.field_content);
    }
    for (;;)
    {
      String str2 = str1;
      if (bg.nm(str1)) {
        str2 = paramau.field_talker;
      }
      GMTrace.o(2122519150592L, 15814);
      return str2;
      if (paramBoolean2) {
        str1 = paramau.field_bizChatUserId;
      }
    }
  }
  
  protected static void a(int paramInt, a parama, au paramau, String paramString, boolean paramBoolean, cw paramcw)
  {
    GMTrace.i(2124666634240L, 15830);
    if (paramau.field_isSend == 1)
    {
      parama.wsh.setTag(new dr(paramau, paramBoolean, paramInt, paramString, 5, (byte)0));
      parama.wsh.setOnClickListener(paramcw);
      switch (paramau.field_status)
      {
      default: 
        w.e("MicroMsg.ChattingItem", "getMsgStateResId: not found this state");
        paramInt = -1;
      }
      while (paramInt != -1)
      {
        parama.wsh.setImageResource(paramInt);
        parama.wsh.setVisibility(0);
        parama.wsh.setContentDescription(ab.getContext().getString(R.l.dJn));
        if (parama.nWt == null) {
          break label177;
        }
        parama.nWt.setVisibility(8);
        GMTrace.o(2124666634240L, 15830);
        return;
        paramInt = -1;
        continue;
        paramInt = R.g.baD;
      }
      parama.wsh.setVisibility(8);
    }
    label177:
    GMTrace.o(2124666634240L, 15830);
  }
  
  protected static void a(En_5b8fbb1e.a parama, View paramView, au paramau, f.a parama1, String paramString, long paramLong)
  {
    GMTrace.i(2123190239232L, 15819);
    if (!com.tencent.mm.pluginsdk.model.app.g.Or(parama1.appId))
    {
      paramView.setTag(new l.b());
      GMTrace.o(2123190239232L, 15819);
      return;
    }
    if (parama.wqK) {}
    for (int i = 2;; i = 1)
    {
      l.a locala = new l.a();
      locala.appId = parama1.appId;
      locala.eRB = "message";
      locala.esM = paramString;
      locala.eRY = c(parama, paramau);
      locala.tAY = parama1.type;
      locala.scene = i;
      locala.tAZ = parama1.mediaTagName;
      locala.eSf = paramLong;
      a(parama, paramView, locala);
      GMTrace.o(2123190239232L, 15819);
      return;
    }
  }
  
  private static void a(En_5b8fbb1e.a parama, View paramView, Object paramObject)
  {
    GMTrace.i(2123324456960L, 15820);
    paramView.setTag(paramObject);
    paramView.setOnClickListener(parama.wvd.wze);
    GMTrace.o(2123324456960L, 15820);
  }
  
  protected static void a(En_5b8fbb1e.a parama, View paramView, String paramString)
  {
    GMTrace.i(2123056021504L, 15818);
    if (!com.tencent.mm.pluginsdk.model.app.g.Or(paramString))
    {
      paramView.setTag(new l.b());
      GMTrace.o(2123056021504L, 15818);
      return;
    }
    l.b localb = new l.b();
    localb.appId = paramString;
    localb.eRB = "message";
    a(parama, paramView, localb);
    GMTrace.o(2123056021504L, 15818);
  }
  
  private static void a(En_5b8fbb1e.a parama, ImageView paramImageView, Bitmap paramBitmap)
  {
    GMTrace.i(2123592892416L, 15822);
    paramBitmap = new BitmapDrawable(paramBitmap);
    int i = (int)parama.getResources().getDimension(R.f.aQR);
    paramBitmap.setBounds(0, 0, i, i);
    paramImageView.setImageDrawable(paramBitmap);
    GMTrace.o(2123592892416L, 15822);
  }
  
  protected static void a(En_5b8fbb1e.a parama, ImageView paramImageView, String paramString)
  {
    GMTrace.i(2123458674688L, 15821);
    paramString = com.tencent.mm.pluginsdk.model.app.g.b(paramString, 2, com.tencent.mm.br.a.getDensity(parama.vKB.vKW));
    if ((paramString != null) && (!paramString.isRecycled()))
    {
      a(parama, paramImageView, paramString);
      GMTrace.o(2123458674688L, 15821);
      return;
    }
    a(parama, paramImageView, BitmapFactory.decodeResource(parama.getResources(), R.g.aYz));
    GMTrace.o(2123458674688L, 15821);
  }
  
  private static void a(En_5b8fbb1e.a parama, TextView paramTextView, Bitmap paramBitmap)
  {
    GMTrace.i(2123861327872L, 15824);
    paramBitmap = new BitmapDrawable(paramBitmap);
    int i = (int)parama.getResources().getDimension(R.f.aQR);
    paramBitmap.setBounds(0, 0, i, i);
    paramTextView.setCompoundDrawables(paramBitmap, null, null, null);
    GMTrace.o(2123861327872L, 15824);
  }
  
  protected static void a(En_5b8fbb1e.a parama, TextView paramTextView, String paramString)
  {
    GMTrace.i(2123727110144L, 15823);
    paramString = com.tencent.mm.pluginsdk.model.app.g.b(paramString, 2, com.tencent.mm.br.a.getDensity(parama.vKB.vKW));
    if ((paramString != null) && (!paramString.isRecycled()))
    {
      a(parama, paramTextView, paramString);
      GMTrace.o(2123727110144L, 15823);
      return;
    }
    a(parama, paramTextView, BitmapFactory.decodeResource(parama.getResources(), R.g.aYz));
    GMTrace.o(2123727110144L, 15823);
  }
  
  protected static void a(En_5b8fbb1e.a parama, f.a parama1, au paramau, f paramf)
  {
    GMTrace.i(2124935069696L, 15832);
    p.j localj = p.a.tma;
    int i;
    ActionBarActivity localActionBarActivity;
    String str;
    if (localj != null)
    {
      if (!parama.wvi) {
        break label89;
      }
      i = 2;
      paramau = c(parama, paramau);
      localActionBarActivity = parama.vKB.vKW;
      str = parama1.appId;
      if (paramf != null) {
        break label95;
      }
    }
    label89:
    label95:
    for (parama = null;; parama = paramf.field_packageName)
    {
      localj.a(localActionBarActivity, str, parama, paramau, parama1.type, parama1.mediaTagName, i);
      GMTrace.o(2124935069696L, 15832);
      return;
      i = 1;
      break;
    }
  }
  
  protected static void a(En_5b8fbb1e.a parama, f.a parama1, String paramString, f paramf, long paramLong)
  {
    GMTrace.i(2124800851968L, 15831);
    int j;
    int i;
    label43:
    label54:
    nb localnb;
    nb.a locala;
    if (parama.wqK)
    {
      j = 2;
      if ((paramf == null) || (!com.tencent.mm.pluginsdk.model.app.p.n(parama.vKB.vKW, paramf.field_packageName))) {
        break label208;
      }
      i = 3;
      if (parama1.type != 2) {
        break label215;
      }
      i = 4;
      localnb = new nb();
      localnb.eSc.context = parama.vKB.vKW;
      localnb.eSc.scene = j;
      localnb.eSc.eSd = parama1.appId;
      locala = localnb.eSc;
      if (paramf != null) {
        break label229;
      }
    }
    label208:
    label215:
    label229:
    for (parama = null;; parama = paramf.field_packageName)
    {
      locala.packageName = parama;
      localnb.eSc.msgType = parama1.type;
      localnb.eSc.eMI = paramString;
      localnb.eSc.eSe = i;
      localnb.eSc.mediaTagName = parama1.mediaTagName;
      localnb.eSc.eSf = paramLong;
      localnb.eSc.eSg = "";
      com.tencent.mm.sdk.b.a.vgX.m(localnb);
      GMTrace.o(2124800851968L, 15831);
      return;
      j = 1;
      break;
      i = 6;
      break label43;
      if (parama1.type != 5) {
        break label54;
      }
      i = 1;
      break label54;
    }
  }
  
  protected static void a(a parama, En_5b8fbb1e.a parama1, String paramString, au paramau)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    GMTrace.i(2122787586048L, 15816);
    if (parama.hqG == null)
    {
      GMTrace.o(2122787586048L, 15816);
      return;
    }
    if ((s.gm(paramString)) && (!paramString.equals(s.gmD[0])))
    {
      parama.hqG.setVisibility(8);
      GMTrace.o(2122787586048L, 15816);
      return;
    }
    if ((paramau != null) && (!bg.nm(paramau.fwD)))
    {
      if (parama1.wvi) {
        localObject1 = parama1.cci();
      }
      localObject1 = new dr(paramString, 9, (String)localObject1);
      ((dr)localObject1).wFz = paramau.fwD;
      com.tencent.mm.pluginsdk.ui.a.b.g(parama.hqG, paramau.fwD, R.g.aUh);
    }
    for (;;)
    {
      parama.hqG.setVisibility(0);
      parama.hqG.setTag(localObject1);
      be.dr(parama.hqG);
      parama.hqG.setOnClickListener(parama1.wvd.wyW);
      parama.hqG.setOnLongClickListener(parama1.wvd.wyY);
      parama.hqG.setContentDescription(r.fs(paramString) + parama1.vKB.vKW.getString(R.l.cVf));
      if (parama.wvy == null) {
        break label447;
      }
      if ((paramau != null) && (paramau.fwv != null) && (paramau.fwv.contains("watch_msg_source_type")))
      {
        parama1 = (String)bh.q(paramau.fwv, "msgsource").get(".msgsource.watch_msg_source_type");
        try
        {
          i = Integer.valueOf(parama1).intValue();
          if ((i > 0) && (i <= 4))
          {
            parama.wvy.setVisibility(0);
            GMTrace.o(2122787586048L, 15816);
            return;
            if ((paramau != null) && (parama1.txk))
            {
              localObject1 = new dr(paramau.field_bizChatUserId, 1, null);
              com.tencent.mm.ao.n.Jd().a(parama1.jh(paramau.field_bizChatUserId), parama.hqG, parama1.wvd.jQF);
              continue;
            }
            localObject1 = localObject2;
            if (parama1.wvi) {
              localObject1 = parama1.cci();
            }
            localObject1 = new dr(paramString, 1, (String)localObject1);
            p(parama.hqG, paramString);
          }
        }
        catch (Exception parama1)
        {
          for (;;)
          {
            int i = 0;
          }
          parama.wvy.setVisibility(8);
          GMTrace.o(2122787586048L, 15816);
          return;
        }
      }
    }
    parama.wvy.setVisibility(8);
    label447:
    GMTrace.o(2122787586048L, 15816);
  }
  
  protected static void a(a parama, CharSequence paramCharSequence)
  {
    GMTrace.i(2122653368320L, 15815);
    if ((parama == null) || (parama.oGJ == null))
    {
      GMTrace.o(2122653368320L, 15815);
      return;
    }
    if (paramCharSequence == null)
    {
      parama.oGJ.setVisibility(8);
      GMTrace.o(2122653368320L, 15815);
      return;
    }
    parama.oGJ.setText(paramCharSequence);
    parama.oGJ.setVisibility(0);
    GMTrace.o(2122653368320L, 15815);
  }
  
  protected static boolean a(En_5b8fbb1e.a parama, f paramf)
  {
    GMTrace.i(2125203505152L, 15834);
    p.j localj = p.a.tma;
    if ((!com.tencent.mm.pluginsdk.model.app.g.a(parama.vKB.vKW, paramf)) && (localj != null))
    {
      if (!bg.nm(paramf.fdR))
      {
        boolean bool = com.tencent.mm.pluginsdk.model.app.q.aR(parama.vKB.vKW, paramf.fdR);
        w.i("MicroMsg.ChattingItem", "oversea game info and gpdownload url is not empty, jump to google play directy:[%s], jump result: [%b]", new Object[] { paramf.fdR, Boolean.valueOf(bool) });
        if (bool)
        {
          GMTrace.o(2125203505152L, 15834);
          return true;
        }
      }
      if (parama.wqK) {}
      for (int i = 2;; i = 1)
      {
        gk localgk = new gk();
        localgk.eJy.actionCode = 2;
        localgk.eJy.scene = i;
        localgk.eJy.appId = paramf.field_appId;
        localgk.eJy.context = parama.vKB.vKW;
        com.tencent.mm.sdk.b.a.vgX.m(localgk);
        parama = parama.vKB.vKW;
        localj.G(paramf.field_appId, i, i);
        GMTrace.o(2125203505152L, 15834);
        return true;
      }
    }
    GMTrace.o(2125203505152L, 15834);
    return false;
  }
  
  protected static boolean a(cv paramcv, long paramLong)
  {
    GMTrace.i(2126008811520L, 15840);
    if (paramLong > 0L)
    {
      Cursor localCursor;
      int i;
      int j;
      if (paramcv.wzx == -1L)
      {
        paramcv.wzx = 0L;
        localCursor = paramcv.getCursor();
        i = localCursor.getPosition();
        j = localCursor.getCount();
        w.i("MicroMsg.ChattingListAdapter", "curPos %d, curCount %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if (localCursor.moveToLast())
        {
          paramcv.wzC = null;
          paramcv.wzC = cv.a(paramcv.wzC, localCursor);
          if (paramcv.wzC.field_isSend != 1) {
            break label184;
          }
          if ((paramcv.wzC.fwu & 0x4) != 4) {
            paramcv.wzx = paramcv.wzC.field_msgId;
          }
        }
        label145:
        if (j >= 0) {
          break label197;
        }
        if (j > 0) {
          localCursor.moveToPosition(0);
        }
      }
      for (;;)
      {
        if (paramcv.wzx != paramLong) {
          break label235;
        }
        GMTrace.o(2126008811520L, 15840);
        return true;
        label184:
        if (localCursor.moveToPrevious()) {
          break;
        }
        break label145;
        label197:
        if (i >= j)
        {
          if (j > 0) {
            localCursor.moveToPosition(j - 1);
          }
        }
        else {
          localCursor.moveToPosition(i);
        }
      }
    }
    label235:
    GMTrace.o(2126008811520L, 15840);
    return false;
  }
  
  protected static boolean av(au paramau)
  {
    GMTrace.i(15952984932352L, 118859);
    long l = paramau.field_createTime;
    if (System.currentTimeMillis() - l > 120000L) {}
    for (int i = 1; i != 0; i = 0)
    {
      GMTrace.o(15952984932352L, 118859);
      return false;
    }
    i = com.tencent.mm.k.g.ut().getInt("ShowRevokeMsgEntry", 1);
    w.d("MicroMsg.ChattingItem", "[oneliang][isRevokeMsgEnable] enable:%d", new Object[] { Integer.valueOf(i) });
    if (1 == i)
    {
      GMTrace.o(15952984932352L, 118859);
      return true;
    }
    GMTrace.o(15952984932352L, 118859);
    return false;
  }
  
  protected static String b(En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2122384932864L, 15813);
    String str = paramau.field_talker;
    paramau = str;
    if (parama.txk)
    {
      paramau = str;
      if (parama.woz != null) {
        paramau = parama.woz.field_bizChatServId;
      }
    }
    GMTrace.o(2122384932864L, 15813);
    return paramau;
  }
  
  protected static void b(En_5b8fbb1e.a parama, View paramView, Object paramObject)
  {
    GMTrace.i(2123995545600L, 15825);
    paramView.setTag(paramObject);
    paramView.setOnClickListener(parama.wvd.wyW);
    GMTrace.o(2123995545600L, 15825);
  }
  
  protected static void b(En_5b8fbb1e.a parama, f.a parama1, au paramau)
  {
    GMTrace.i(2125069287424L, 15833);
    p.j localj = p.a.tma;
    if (localj != null) {
      if (!parama.wvi) {
        break label79;
      }
    }
    label79:
    for (int i = 2;; i = 1)
    {
      String str = c(parama, paramau);
      parama = parama.vKB.vKW;
      localj.a(parama1.appId, str, parama1.type, i, parama1.mediaTagName, paramau.field_msgSvrId);
      GMTrace.o(2125069287424L, 15833);
      return;
    }
  }
  
  protected static String c(En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2125337722880L, 15835);
    String str = parama.cci();
    parama = str;
    if (s.eb(str)) {
      parama = bc.gP(paramau.field_content);
    }
    GMTrace.o(2125337722880L, 15835);
    return parama;
  }
  
  protected static void c(En_5b8fbb1e.a parama, View paramView, Object paramObject)
  {
    GMTrace.i(2124129763328L, 15826);
    paramView.setTag(paramObject);
    paramView.setOnClickListener(parama.wvd.wzi);
    GMTrace.o(2124129763328L, 15826);
  }
  
  protected static boolean ccs()
  {
    GMTrace.i(2125874593792L, 15839);
    String str = com.tencent.mm.k.g.ut().getValue("ShowSendOK");
    if (bg.nm(str)) {}
    for (int i = 0; 1 == i; i = bg.Sy(str))
    {
      GMTrace.o(2125874593792L, 15839);
      return true;
    }
    GMTrace.o(2125874593792L, 15839);
    return false;
  }
  
  public static int fs(Context paramContext)
  {
    GMTrace.i(2121445408768L, 15806);
    float f = com.tencent.mm.br.a.dZ(paramContext);
    int i;
    if (f == 0.875F) {
      i = com.tencent.mm.br.a.W(paramContext, R.f.aRL);
    }
    for (;;)
    {
      GMTrace.o(2121445408768L, 15806);
      return i;
      if (f == 1.125F) {
        i = com.tencent.mm.br.a.W(paramContext, R.f.aRH);
      } else if (f == 1.25F) {
        i = com.tencent.mm.br.a.W(paramContext, R.f.aRM);
      } else if (f == 1.375F) {
        i = com.tencent.mm.br.a.W(paramContext, R.f.aRF);
      } else if ((f == 1.625F) || (f == 1.875F) || (f == 2.025F)) {
        i = com.tencent.mm.br.a.W(paramContext, R.f.aRG);
      } else {
        i = com.tencent.mm.br.a.W(paramContext, R.f.aRK);
      }
    }
  }
  
  public static int ft(Context paramContext)
  {
    GMTrace.i(2121579626496L, 15807);
    float f = com.tencent.mm.br.a.dZ(paramContext);
    int i;
    if ((f != 0.875F) && (f != 1.125F)) {
      if (f == 1.25F) {
        i = com.tencent.mm.br.a.W(paramContext, R.f.aRE);
      }
    }
    for (;;)
    {
      GMTrace.o(2121579626496L, 15807);
      return i;
      if (f == 1.375F) {
        i = com.tencent.mm.br.a.W(paramContext, R.f.aRC);
      } else if ((f == 1.625F) || (f == 1.875F) || (f == 2.025F)) {
        i = com.tencent.mm.br.a.W(paramContext, R.f.aRG);
      } else {
        i = com.tencent.mm.br.a.W(paramContext, R.f.aRD);
      }
    }
  }
  
  protected static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    GMTrace.i(2124532416512L, 15829);
    if ((paramString == null) || (paramString.length() == 0)) {
      paramString = null;
    }
    while (paramString == null)
    {
      GMTrace.o(2124532416512L, 15829);
      return null;
      paramString = com.tencent.mm.pluginsdk.model.app.g.aP(paramString, true);
      if (paramString == null) {
        paramString = null;
      } else {
        paramString = paramString.field_packageName;
      }
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      GMTrace.o(2124532416512L, 15829);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      w.printErrStackTrace("MicroMsg.ChattingItem", paramContext, "", new Object[0]);
      GMTrace.o(2124532416512L, 15829);
    }
    return null;
  }
  
  public static void p(ImageView paramImageView, String paramString)
  {
    GMTrace.i(2121311191040L, 15805);
    if (bg.nm(paramString))
    {
      paramImageView.setImageResource(R.g.aVS);
      GMTrace.o(2121311191040L, 15805);
      return;
    }
    com.tencent.mm.pluginsdk.ui.a.b.a(paramImageView, paramString);
    GMTrace.o(2121311191040L, 15805);
  }
  
  public static void q(ImageView paramImageView, String paramString)
  {
    GMTrace.i(2121713844224L, 15808);
    if (bg.nm(paramString))
    {
      paramImageView.setImageResource(R.g.aUD);
      GMTrace.o(2121713844224L, 15808);
      return;
    }
    com.tencent.mm.pluginsdk.ui.a.b.n(paramImageView, paramString);
    GMTrace.o(2121713844224L, 15808);
  }
  
  public static void r(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(2125471940608L, 15836);
    cn localcn = new cn();
    localcn.eDQ.eDR = paramEmojiInfo;
    localcn.eDQ.scene = 0;
    com.tencent.mm.sdk.b.a.vgX.m(localcn);
    GMTrace.o(2125471940608L, 15836);
  }
  
  public abstract View a(LayoutInflater paramLayoutInflater, View paramView);
  
  protected String a(En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2122250715136L, 15812);
    String str = parama.wvd.eDs;
    if (!a(parama))
    {
      GMTrace.o(2122250715136L, 15812);
      return str;
    }
    if (parama.wvi)
    {
      parama = bc.gP(paramau.field_content);
      if ((str == null) || (parama == null) || (parama.length() <= 0)) {
        break label89;
      }
    }
    for (;;)
    {
      GMTrace.o(2122250715136L, 15812);
      return parama;
      if (paramau != null) {
        parama = paramau.field_bizChatUserId;
      } else {
        label89:
        parama = str;
      }
    }
  }
  
  protected final void a(En_5b8fbb1e.a parama, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, boolean paramBoolean, long paramLong1, long paramLong2, au paramau)
  {
    GMTrace.i(2124398198784L, 15828);
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString2 == null) || (paramString2.length() == 0)))
    {
      w.e("MicroMsg.ChattingItem", "url, lowUrl both are empty");
      GMTrace.o(2124398198784L, 15828);
      return;
    }
    String str;
    if (am.isMobile(parama.vKB.vKW))
    {
      str = paramString1;
      if (paramString2 != null)
      {
        if (paramString2.length() > 0) {
          break label336;
        }
        str = paramString1;
      }
    }
    for (;;)
    {
      paramString1 = new Intent();
      paramString1.putExtra("msg_id", paramLong1);
      paramString1.putExtra("rawUrl", str);
      paramString1.putExtra("version_name", paramString3);
      paramString1.putExtra("version_code", paramInt);
      paramString1.putExtra("usePlugin", paramBoolean);
      paramString1.putExtra("geta8key_username", parama.cci());
      paramString1.putExtra("KPublisherId", "msg_" + Long.toString(paramLong2));
      paramString1.putExtra("KAppId", paramString4);
      paramString1.putExtra("pre_username", a(parama, paramau));
      paramString1.putExtra("prePublishId", "msg_" + Long.toString(paramLong2));
      if (paramau != null) {
        paramString1.putExtra("preUsername", a(parama, paramau));
      }
      paramString1.putExtra("preChatName", parama.cci());
      paramString1.putExtra("preChatTYPE", t.H(a(parama, paramau), parama.cci()));
      paramString1.putExtra("preMsgIndex", 0);
      d.b(parama.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramString1);
      GMTrace.o(2124398198784L, 15828);
      return;
      if (paramString1 != null)
      {
        str = paramString1;
        if (paramString1.length() > 0) {}
      }
      else
      {
        label336:
        str = paramString2;
      }
    }
  }
  
  public abstract void a(a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString);
  
  public final void a(a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, boolean paramBoolean)
  {
    GMTrace.i(2121848061952L, 15809);
    this.tIv = paramBoolean;
    String str = null;
    if (ccr())
    {
      str = a(parama1, paramau);
      a(parama, parama1, paramau, str);
      a(parama, parama1, str, paramau);
    }
    a(parama, paramInt, parama1, paramau, str);
    GMTrace.o(2121848061952L, 15809);
  }
  
  protected void a(a parama, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2122116497408L, 15811);
    if ((paramString == null) || (parama.oGJ == null) || (paramau == null))
    {
      GMTrace.o(2122116497408L, 15811);
      return;
    }
    com.tencent.mm.af.g localg = null;
    Object localObject = null;
    if ((paramau.field_isSend == 0) && (!bg.nm(paramau.fwD)))
    {
      localg = x.FF().iT(paramau.fwD);
      int i = 1;
      if ((localg != null) && (!bg.nm(localg.field_openId)) && (!bg.nm(localg.field_nickname)))
      {
        paramString = localg.field_nickname;
        i = 0;
        if (i == 0)
        {
          localObject = paramString;
          if (!i.a(localg)) {}
        }
        else
        {
          x.FH().a(new d(parama1.wvd, paramau.fwD));
          x.FH().W(parama1.wvd.eDs, paramau.fwD);
          localObject = paramString;
        }
      }
    }
    for (;;)
    {
      a(parama, (CharSequence)localObject);
      GMTrace.o(2122116497408L, 15811);
      return;
      w.i("MicroMsg.ChattingItem", "fillingUsername:need getKfInfo");
      paramString = (String)localObject;
      break;
      localObject = localg;
      if (a(parama1))
      {
        localObject = localg;
        if (parama1.wDq) {
          if (parama1.wDj) {
            localObject = com.tencent.mm.pluginsdk.ui.d.h.b(parama1.vKB.vKW, parama1.fs(paramau.field_bizChatUserId), parama.oGJ.getTextSize());
          } else {
            localObject = com.tencent.mm.pluginsdk.ui.d.h.b(parama1.vKB.vKW, parama1.fs(paramString), parama.oGJ.getTextSize());
          }
        }
      }
    }
  }
  
  public abstract boolean a(ContextMenu paramContextMenu, View paramView, au paramau);
  
  public abstract boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau);
  
  public abstract boolean a(View paramView, En_5b8fbb1e.a parama, au paramau);
  
  protected boolean a(En_5b8fbb1e.a parama)
  {
    GMTrace.i(2122921803776L, 15817);
    if ((parama.wvi) || (parama.txk))
    {
      GMTrace.o(2122921803776L, 15817);
      return true;
    }
    GMTrace.o(2122921803776L, 15817);
    return false;
  }
  
  public final boolean a(En_5b8fbb1e.a parama, f.a parama1, au paramau)
  {
    GMTrace.i(2124263981056L, 15827);
    if (bg.nm(parama1.gkI))
    {
      GMTrace.o(2124263981056L, 15827);
      return false;
    }
    a.a(a.a.wqm, paramau, parama1.gkP, parama1.gkO);
    String str = paramau.field_imgPath;
    Intent localIntent = new Intent();
    localIntent.putExtra("IsAd", false);
    localIntent.putExtra("KStremVideoUrl", parama1.gkI);
    localIntent.putExtra("KThumUrl", parama1.gkN);
    localIntent.putExtra("KThumbPath", str);
    localIntent.putExtra("KSta_StremVideoAduxInfo", parama1.gkO);
    localIntent.putExtra("KSta_StremVideoPublishId", parama1.gkP);
    localIntent.putExtra("KSta_SourceType", 2);
    if (parama.wvi) {}
    for (int i = a.b.wqv.value;; i = a.b.wqu.value)
    {
      localIntent.putExtra("KSta_Scene", i);
      localIntent.putExtra("KSta_FromUserName", a(parama, paramau));
      localIntent.putExtra("KSta_ChatName", parama.cci());
      localIntent.putExtra("KSta_MsgId", paramau.field_msgSvrId);
      localIntent.putExtra("KSta_SnsStatExtStr", parama1.eTv);
      if (parama.wvi) {
        localIntent.putExtra("KSta_ChatroomMembercount", m.fk(parama.cci()));
      }
      localIntent.putExtra("KMediaId", "fakeid_" + paramau.field_msgId);
      localIntent.putExtra("KMediaVideoTime", parama1.gkJ);
      localIntent.putExtra("StremWebUrl", parama1.gkM);
      localIntent.putExtra("StreamWording", parama1.gkL);
      localIntent.putExtra("KMediaTitle", parama1.title);
      d.b(parama.vKB.vKW, "sns", ".ui.VideoAdPlayerUI", localIntent);
      GMTrace.o(2124263981056L, 15827);
      return true;
    }
  }
  
  public final int ccq()
  {
    GMTrace.i(2121176973312L, 15804);
    int i = this.jHw;
    GMTrace.o(2121176973312L, 15804);
    return i;
  }
  
  protected boolean ccr()
  {
    GMTrace.i(2121982279680L, 15810);
    GMTrace.o(2121982279680L, 15810);
    return true;
  }
  
  public static class a
  {
    public ImageView hqG;
    public TextView jRw;
    public CheckBox lCA;
    public View lFh;
    public ProgressBar nWt;
    public View npf;
    public TextView oGJ;
    public int type;
    public ImageView wsh;
    public View wvA;
    public int wvB;
    public long wvC;
    public ViewStub wvy;
    public View wvz;
    
    public a(int paramInt)
    {
      this(paramInt, (byte)0);
      GMTrace.i(2165200388096L, 16132);
      GMTrace.o(2165200388096L, 16132);
    }
    
    private a(int paramInt, byte paramByte)
    {
      GMTrace.i(2165334605824L, 16133);
      this.type = paramInt;
      this.wvC = 0L;
      GMTrace.o(2165334605824L, 16133);
    }
    
    public static void I(View paramView, int paramInt)
    {
      GMTrace.i(2165737259008L, 16136);
      if (paramView != null)
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
        localLayoutParams.width = paramInt;
        paramView.setLayoutParams(localLayoutParams);
        paramView.requestLayout();
      }
      GMTrace.o(2165737259008L, 16136);
    }
    
    public final void dq(View paramView)
    {
      GMTrace.i(2165468823552L, 16134);
      this.lFh = paramView;
      this.jRw = ((TextView)paramView.findViewById(R.h.boA));
      this.hqG = ((ImageView)paramView.findViewById(R.h.bmT));
      this.wvz = paramView.findViewById(R.h.bnH);
      this.wvA = paramView.findViewById(R.h.bne);
      this.wsh = ((ImageView)paramView.findViewById(R.h.bow));
      this.wvy = ((ViewStub)paramView.findViewById(R.h.bos));
      GMTrace.o(2165468823552L, 16134);
    }
    
    public final void lY(boolean paramBoolean)
    {
      GMTrace.i(2165603041280L, 16135);
      if (paramBoolean) {}
      for (int i = 0;; i = 8)
      {
        if ((this.lCA != null) && (this.lCA.getVisibility() != i)) {
          this.lCA.setVisibility(i);
        }
        if ((this.npf != null) && (this.npf.getVisibility() != i)) {
          this.npf.setVisibility(i);
        }
        GMTrace.o(2165603041280L, 16135);
        return;
      }
    }
  }
  
  public static abstract class b
    extends ah
  {
    public b(int paramInt)
    {
      super();
      GMTrace.i(2254857830400L, 16800);
      GMTrace.o(2254857830400L, 16800);
    }
  }
  
  public static abstract class c
    extends ah
  {
    public c(int paramInt)
    {
      super();
      GMTrace.i(2279822327808L, 16986);
      GMTrace.o(2279822327808L, 16986);
    }
    
    protected final String a(En_5b8fbb1e.a parama, au paramau)
    {
      GMTrace.i(2280090763264L, 16988);
      parama = parama.wvd.gtf;
      GMTrace.o(2280090763264L, 16988);
      return parama;
    }
    
    protected final boolean a(En_5b8fbb1e.a parama)
    {
      GMTrace.i(2279956545536L, 16987);
      GMTrace.o(2279956545536L, 16987);
      return false;
    }
  }
  
  private static final class d
    implements h.a
  {
    private String rUS;
    public cv wvd;
    
    protected d(cv paramcv, String paramString)
    {
      GMTrace.i(2260226539520L, 16840);
      this.rUS = paramString;
      this.wvd = paramcv;
      GMTrace.o(2260226539520L, 16840);
    }
    
    public final String Fy()
    {
      GMTrace.i(2260494974976L, 16842);
      String str = this.rUS;
      GMTrace.o(2260494974976L, 16842);
      return str;
    }
    
    public final void c(LinkedList<btz> paramLinkedList)
    {
      int k = 0;
      GMTrace.i(2260360757248L, 16841);
      x.FH().b(this);
      w.d("MicroMsg.ChattingItem", "onKFSceneEnd.");
      int i;
      if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
      {
        w.i("MicroMsg.ChattingItem", "onKFSceneEnd, workers size : %d. callbackid=%s", new Object[] { Integer.valueOf(paramLinkedList.size()), this.rUS });
        if (this.wvd != null)
        {
          i = k;
          if (paramLinkedList != null)
          {
            if (paramLinkedList.size() != 0) {
              break label114;
            }
            i = k;
          }
          if (i != 0) {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(2264118853632L, 16869);
                ah.d.this.wvd.notifyDataSetChanged();
                GMTrace.o(2264118853632L, 16869);
              }
            });
          }
        }
      }
      GMTrace.o(2260360757248L, 16841);
      return;
      label114:
      int j = 0;
      for (;;)
      {
        i = k;
        if (j >= paramLinkedList.size()) {
          break;
        }
        btz localbtz = (btz)paramLinkedList.get(j);
        if ((localbtz != null) && (!bg.nm(localbtz.vcF)) && (localbtz.vcF.equals(this.rUS)))
        {
          w.i("MicroMsg.ChattingItem", "needCallback find match kfopenid");
          if (!bg.nm(localbtz.uBf))
          {
            w.i("MicroMsg.ChattingItem", "needCallback: true");
            i = 1;
            break;
          }
        }
        j += 1;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */