package com.tencent.mm.plugin.emoji.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.f.f;
import com.tencent.mm.protocal.c.ed;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.tools.a.b.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.LinkedList;

public class EmojiAddCustomDialogUI
  extends MMBaseActivity
  implements com.tencent.mm.ad.e
{
  private int gRb;
  private ProgressDialog kgz;
  private String koc;
  private String kod;
  private EmojiInfo koe;
  private i kof;
  private i kog;
  private Context mContext;
  private ae mHandler;
  
  public EmojiAddCustomDialogUI()
  {
    GMTrace.i(11396561502208L, 84911);
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11405419872256L, 84977);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11405419872256L, 84977);
          return;
          EmojiAddCustomDialogUI.a(EmojiAddCustomDialogUI.this, EmojiAddCustomDialogUI.this.getString(R.l.dpt));
        }
      }
    };
    GMTrace.o(11396561502208L, 84911);
  }
  
  private void asl()
  {
    GMTrace.i(11397098373120L, 84915);
    w.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd error.");
    ase();
    com.tencent.mm.ui.base.h.bm(this.mContext, ab.getContext().getString(R.l.dnG));
    com.tencent.mm.plugin.report.service.g.ork.i(10431, new Object[] { Integer.valueOf(this.gRb), this.koe.GS(), this.koe.field_designerID, this.koe.field_groupId, Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(this.koe.field_size), this.kod, this.koe.field_activityid });
    finish();
    GMTrace.o(11397098373120L, 84915);
  }
  
  private void asm()
  {
    GMTrace.i(11397232590848L, 84916);
    w.d("MicroMsg.emoji.EmojiAddCustomDialogUI", "dealSaveSuccess");
    int i;
    if (this.koe.field_catalog != EmojiInfo.vCu)
    {
      this.koe.field_catalog = EmojiInfo.vCu;
      i = com.tencent.mm.plugin.emoji.model.h.arl().kjy.bVb();
      if (i >= com.tencent.mm.plugin.emoji.e.n.aqT()) {
        break label339;
      }
      i = com.tencent.mm.plugin.emoji.e.n.aqT();
    }
    for (;;)
    {
      this.koe.field_reserved3 = i;
      com.tencent.mm.plugin.emoji.model.h.arl().kjy.p(this.koe);
      com.tencent.mm.plugin.report.service.g.ork.i(10431, new Object[] { Integer.valueOf(this.gRb), this.koe.GS(), this.koe.field_designerID, this.koe.field_groupId, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(this.koe.field_size), this.kod, this.koe.field_activityid });
      com.tencent.mm.plugin.emoji.e.e.aqw().c(this.koe, false);
      Object localObject = this.koe.bUU() + "_cover";
      if ((!bg.nm(this.koe.field_thumbUrl)) && (!com.tencent.mm.a.e.aZ((String)localObject)))
      {
        c.a locala = new c.a();
        locala.gKE = ((String)localObject);
        locala.gKC = true;
        locala.gKA = false;
        localObject = locala.Jn();
        com.tencent.mm.ao.n.Jd().a(this.koe.field_thumbUrl, null, (com.tencent.mm.ao.a.a.c)localObject);
      }
      localObject = com.tencent.mm.plugin.emoji.model.h.arl().kjz;
      if (!com.tencent.mm.storage.emotion.a.bUC()) {
        com.tencent.mm.plugin.emoji.model.h.arl().kjz.bUD();
      }
      ase();
      com.tencent.mm.ui.base.h.bm(this.mContext, ab.getContext().getString(R.l.cRL));
      finish();
      GMTrace.o(11397232590848L, 84916);
      return;
      label339:
      i += 1;
    }
  }
  
  private void asn()
  {
    GMTrace.i(11397501026304L, 84918);
    this.kof = com.tencent.mm.ui.base.h.a(this.mContext, R.l.dpJ, R.l.cSG, R.l.doM, R.l.cSk, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(11464073019392L, 85414);
        paramAnonymousDialogInterface = new Intent();
        com.tencent.mm.plugin.report.service.g.ork.i(11596, new Object[] { Integer.valueOf(3) });
        paramAnonymousDialogInterface.setClass(EmojiAddCustomDialogUI.f(EmojiAddCustomDialogUI.this), EmojiCustomUI.class);
        EmojiAddCustomDialogUI.this.startActivity(paramAnonymousDialogInterface);
        GMTrace.o(11464073019392L, 85414);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(11363275505664L, 84663);
        EmojiAddCustomDialogUI.this.finish();
        GMTrace.o(11363275505664L, 84663);
      }
    });
    if (this.kof != null) {
      this.kof.setOnDismissListener(new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(11392534970368L, 84881);
          EmojiAddCustomDialogUI.this.finish();
          GMTrace.o(11392534970368L, 84881);
        }
      });
    }
    GMTrace.o(11397501026304L, 84918);
  }
  
  private static void i(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(11397366808576L, 84917);
    w.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji start.do NetSceneBackupEmojiOperate ");
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramEmojiInfo.GS());
    paramEmojiInfo = new com.tencent.mm.plugin.emoji.f.c(1, localArrayList);
    at.wS().a(paramEmojiInfo, 0);
    GMTrace.o(11397366808576L, 84917);
  }
  
  private void wr(String paramString)
  {
    GMTrace.i(11397635244032L, 84919);
    this.kog = com.tencent.mm.ui.base.h.b(this, paramString, "", true);
    this.kog.setOnDismissListener(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11402735517696L, 84957);
        EmojiAddCustomDialogUI.this.finish();
        GMTrace.o(11402735517696L, 84957);
      }
    });
    GMTrace.o(11397635244032L, 84919);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11396964155392L, 84914);
    int i = paramk.getType();
    if (i == 698)
    {
      if (paramInt2 == 65102)
      {
        w.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd error over size.");
        ase();
        asn();
        com.tencent.mm.plugin.report.service.g.ork.i(10431, new Object[] { Integer.valueOf(this.gRb), this.koe.GS(), this.koe.field_designerID, this.koe.field_groupId, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(this.koe.field_size), this.kod, this.koe.field_activityid });
        GMTrace.o(11396964155392L, 84914);
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        w.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd ok.");
        paramString = (ed)((com.tencent.mm.plugin.emoji.f.c)paramk).fUa.gtD.gtK;
        if ((paramString != null) && (paramString.tSL != null) && (paramString.tSL.size() > 0))
        {
          w.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "upload size is %d", new Object[] { Integer.valueOf(paramString.tSL.size()) });
          paramString.tSL.get(0);
          paramString = new f(this.koe);
          at.wS().a(paramString, 0);
          w.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "start upload emoji");
          GMTrace.o(11396964155392L, 84914);
          return;
        }
        asm();
        GMTrace.o(11396964155392L, 84914);
        return;
      }
      asl();
      GMTrace.o(11396964155392L, 84914);
      return;
    }
    if (i == 423)
    {
      paramString = (com.tencent.mm.plugin.emoji.f.g)paramk;
      if ((paramString != null) && (!bg.nm(paramString.klt)) && (this.koe != null) && (!bg.nm(this.koe.field_groupId)) && (this.koe.field_groupId.equalsIgnoreCase(paramString.klt)))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          i(this.koe);
          GMTrace.o(11396964155392L, 84914);
          return;
        }
        if (paramInt2 == 4)
        {
          ase();
          wr(getString(R.l.dnJ));
          GMTrace.o(11396964155392L, 84914);
          return;
        }
        if (paramInt2 == 8)
        {
          ase();
          wr(getString(R.l.dnI));
          GMTrace.o(11396964155392L, 84914);
          return;
        }
        if (paramInt2 == 9)
        {
          ase();
          wr(getString(R.l.dnH));
          GMTrace.o(11396964155392L, 84914);
          return;
        }
        if (paramInt2 == -2)
        {
          ase();
          wr(getString(R.l.dnK));
          GMTrace.o(11396964155392L, 84914);
          return;
        }
        ase();
        wr(getString(R.l.dnG));
        GMTrace.o(11396964155392L, 84914);
        return;
      }
      w.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "no the same product ID");
      GMTrace.o(11396964155392L, 84914);
      return;
    }
    if (i == 703)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        asm();
        GMTrace.o(11396964155392L, 84914);
        return;
      }
      asl();
    }
    GMTrace.o(11396964155392L, 84914);
  }
  
  protected final void ase()
  {
    GMTrace.i(11397769461760L, 84920);
    if (this.mHandler != null) {
      this.mHandler.removeMessages(1001);
    }
    if ((this.kgz != null) && (this.kgz.isShowing())) {
      this.kgz.dismiss();
    }
    GMTrace.o(11397769461760L, 84920);
  }
  
  protected void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(11396695719936L, 84912);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setStatusBarColor(0);
    }
    this.mContext = this;
    this.koc = getIntent().getStringExtra("extra_id");
    this.gRb = getIntent().getIntExtra("extra_scence", -1);
    this.kod = getIntent().getStringExtra("extra_username");
    if (bg.nm(this.koc))
    {
      w.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "md5 is null.");
      finish();
    }
    this.koe = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(this.koc);
    at.wS().a(698, this);
    at.wS().a(423, this);
    at.wS().a(703, this);
    this.mHandler.sendEmptyMessageDelayed(1001, 300L);
    Object localObject = this.mContext;
    paramBundle = this.koe;
    if (localObject == null)
    {
      w.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. context is null");
      GMTrace.o(11396695719936L, 84912);
      return;
    }
    if (paramBundle == null)
    {
      w.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. emoji is null");
      GMTrace.o(11396695719936L, 84912);
      return;
    }
    localObject = com.tencent.mm.ui.tools.a.b.Xa(paramBundle.bUU());
    ((com.tencent.mm.ui.tools.a.b)localObject).mSize = com.tencent.mm.k.b.tZ();
    ((com.tencent.mm.ui.tools.a.b)localObject).DZ(com.tencent.mm.k.b.ua()).a(new b.a()
    {
      public final void a(com.tencent.mm.ui.tools.a.b paramAnonymousb)
      {
        GMTrace.i(11464341454848L, 85416);
        if (com.tencent.mm.plugin.emoji.model.h.arl().kjy.kM(false) >= com.tencent.mm.plugin.emoji.e.n.aqT())
        {
          w.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. over max size.");
          EmojiAddCustomDialogUI.this.ase();
          EmojiAddCustomDialogUI.a(EmojiAddCustomDialogUI.this);
          com.tencent.mm.plugin.report.service.g.ork.i(10431, new Object[] { Integer.valueOf(EmojiAddCustomDialogUI.b(EmojiAddCustomDialogUI.this)), EmojiAddCustomDialogUI.c(EmojiAddCustomDialogUI.this).GS(), EmojiAddCustomDialogUI.c(EmojiAddCustomDialogUI.this).field_designerID, EmojiAddCustomDialogUI.c(EmojiAddCustomDialogUI.this).field_groupId, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(EmojiAddCustomDialogUI.c(EmojiAddCustomDialogUI.this).field_size), EmojiAddCustomDialogUI.d(EmojiAddCustomDialogUI.this), EmojiAddCustomDialogUI.c(EmojiAddCustomDialogUI.this).field_activityid });
          GMTrace.o(11464341454848L, 85416);
          return;
        }
        if ((paramBundle.field_catalog == EmojiInfo.vCu) || (bg.nm(paramBundle.field_groupId)) || ((!bg.nm(paramBundle.field_groupId)) && (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vS(paramBundle.field_groupId))))
        {
          EmojiAddCustomDialogUI.j(paramBundle);
          GMTrace.o(11464341454848L, 85416);
          return;
        }
        EmojiAddCustomDialogUI.k(paramBundle);
        GMTrace.o(11464341454848L, 85416);
      }
      
      public final void aso()
      {
        GMTrace.i(11464475672576L, 85417);
        EmojiAddCustomDialogUI.this.ase();
        EmojiAddCustomDialogUI.e(EmojiAddCustomDialogUI.this);
        com.tencent.mm.plugin.report.service.g.ork.i(10431, new Object[] { Integer.valueOf(EmojiAddCustomDialogUI.b(EmojiAddCustomDialogUI.this)), EmojiAddCustomDialogUI.c(EmojiAddCustomDialogUI.this).GS(), EmojiAddCustomDialogUI.c(EmojiAddCustomDialogUI.this).field_designerID, EmojiAddCustomDialogUI.c(EmojiAddCustomDialogUI.this).field_groupId, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(EmojiAddCustomDialogUI.c(EmojiAddCustomDialogUI.this).field_size), EmojiAddCustomDialogUI.d(EmojiAddCustomDialogUI.this), EmojiAddCustomDialogUI.c(EmojiAddCustomDialogUI.this).field_activityid });
        GMTrace.o(11464475672576L, 85417);
      }
    });
    GMTrace.o(11396695719936L, 84912);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11396829937664L, 84913);
    at.wS().b(698, this);
    at.wS().b(423, this);
    at.wS().b(703, this);
    super.onDestroy();
    GMTrace.o(11396829937664L, 84913);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\EmojiAddCustomDialogUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */