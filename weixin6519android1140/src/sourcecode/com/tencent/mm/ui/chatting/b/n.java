package com.tencent.mm.ui.chatting.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.BitmapFactory.Options;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.h.a;
import com.tencent.mm.ao.k;
import com.tencent.mm.ao.m;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.k.b;
import com.tencent.mm.l.a;
import com.tencent.mm.network.ab;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.ay.a;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.chatting.ChatFooterCustom;
import com.tencent.mm.ui.chatting.ah.a;
import com.tencent.mm.ui.chatting.bt;
import com.tencent.mm.ui.chatting.cv;
import com.tencent.mm.ui.chatting.dd;
import com.tencent.mm.ui.chatting.dq;
import com.tencent.mm.ui.chatting.ed;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.DrawedCallBackLinearLayout.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class n
  implements h.a
{
  public i mUb;
  e wCq;
  public v wCs;
  public h wtd;
  
  public n(h paramh, e parame, v paramv)
  {
    GMTrace.i(19199980208128L, 143051);
    this.wtd = paramh;
    this.wCq = parame;
    this.wCs = paramv;
    GMTrace.o(19199980208128L, 143051);
  }
  
  public final void a(long paramLong, int paramInt1, int paramInt2)
  {
    GMTrace.i(19200382861312L, 143054);
    cv localcv = this.wtd.cdn();
    if ((!localcv.wzy.containsKey(Long.valueOf(paramLong))) || (!localcv.wzz.containsKey(Long.valueOf(paramLong))))
    {
      w.d("MicroMsg.ChattingListAdapter", "msg not display, " + paramLong);
      GMTrace.o(19200382861312L, 143054);
      return;
    }
    ah.a locala = (ah.a)((View)localcv.wzy.get(Long.valueOf(paramLong))).getTag();
    if (((Integer)localcv.wzz.get(Long.valueOf(paramLong))).intValue() == 1) {}
    for (boolean bool = true;; bool = false)
    {
      localcv.ac(3, bool);
      bt.a(locala, paramInt1, paramInt2);
      GMTrace.o(19200382861312L, 143054);
      return;
    }
  }
  
  public final void a(long paramLong, boolean paramBoolean)
  {
    GMTrace.i(19200517079040L, 143055);
    Object localObject = this.wtd.cdn();
    if ((!((cv)localObject).wzy.containsKey(Long.valueOf(paramLong))) || (!((cv)localObject).wzz.containsKey(Long.valueOf(paramLong))))
    {
      w.d("MicroMsg.ChattingListAdapter", "msg not display, " + paramLong);
      GMTrace.o(19200517079040L, 143055);
      return;
    }
    ah.a locala = (ah.a)((View)((cv)localObject).wzy.get(Long.valueOf(paramLong))).getTag();
    if (((Integer)((cv)localObject).wzz.get(Long.valueOf(paramLong))).intValue() == 1) {}
    for (boolean bool = true;; bool = false)
    {
      if (((bt)((cv)localObject).ac(3, bool) != null) && (paramBoolean == true))
      {
        localObject = (dq)locala;
        ((dq)localObject).nWt.setVisibility(4);
        ((dq)localObject).wFs.setVisibility(4);
        ((dq)localObject).wFu.setVisibility(4);
      }
      GMTrace.o(19200517079040L, 143055);
      return;
    }
  }
  
  public final boolean aP(au paramau)
  {
    GMTrace.i(19200248643584L, 143053);
    if (!paramau.bTC())
    {
      GMTrace.o(19200248643584L, 143053);
      return false;
    }
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.u.fo(this.wtd.cdg().vKB.vKW);
      GMTrace.o(19200248643584L, 143053);
      return true;
    }
    if (!this.wtd.ccY().field_username.equals("medianote"))
    {
      at.AR();
      com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.e(paramau.field_talker, paramau.field_msgSvrId));
    }
    ed.aH(paramau);
    this.wtd.me(true);
    GMTrace.o(19200248643584L, 143053);
    return true;
  }
  
  public final void w(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(19200114425856L, 143052);
    if ((paramString == null) || (paramString.equals("")) || (!com.tencent.mm.a.e.aZ(paramString)))
    {
      w.d("MicroMsg.ChattingUI.SendImgImp", " doSendImage : filePath is null or empty");
      GMTrace.o(19200114425856L, 143052);
      return;
    }
    if ((this.wtd.cdl() != null) && (!this.wtd.cdl().isEnable()))
    {
      ActionBarActivity localActionBarActivity = this.wtd.cdg().vKB.vKW;
      if (this.wtd.cdl().vCe.Ux("").equalsIgnoreCase("@t.qq.com")) {}
      for (paramString = this.wtd.cdg().Bg(R.l.dxi);; paramString = this.wtd.cdg().e(R.l.dxg, new Object[] { a.eh(this.wtd.cdl().name) }))
      {
        com.tencent.mm.ui.base.h.b(localActionBarActivity, paramString, this.wtd.cdg().Bg(R.l.cUG), true);
        GMTrace.o(19200114425856L, 143052);
        return;
      }
    }
    if (c.W(this.wtd.ccY()))
    {
      GMTrace.o(19200114425856L, 143052);
      return;
    }
    paramString = new k(4, this.wtd.cdk(), this.wtd.cci(), paramString, paramInt1, null, paramInt2, "", "", true, R.g.aVk);
    at.wS().a(paramString, 0);
    this.wtd.me(true);
    GMTrace.o(19200114425856L, 143052);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */