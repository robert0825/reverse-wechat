package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.br.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.pluginsdk.model.app.ab;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.ui.chat.l.b;
import com.tencent.mm.pluginsdk.ui.emoji.PreViewEmojiView;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import java.io.IOException;

public class AppMsgEmojiDownloadUI
  extends MMActivity
  implements com.tencent.mm.ad.e, j.a
{
  private String appName;
  private String eAE;
  private long eDr;
  private String eIy;
  private String eQH;
  private au eRz;
  private String eSd;
  private String gix;
  private ProgressBar jeL;
  private ab kmW;
  private com.tencent.mm.ad.f kmX;
  private TextView kmY;
  private String kmZ;
  private PreViewEmojiView kna;
  
  public AppMsgEmojiDownloadUI()
  {
    GMTrace.i(11394279800832L, 84894);
    GMTrace.o(11394279800832L, 84894);
  }
  
  private static void a(AppMsgEmojiDownloadUI paramAppMsgEmojiDownloadUI, TextView paramTextView, Bitmap paramBitmap)
  {
    GMTrace.i(11395621978112L, 84904);
    paramBitmap = new BitmapDrawable(paramBitmap);
    int i = (int)paramAppMsgEmojiDownloadUI.getResources().getDimension(R.f.aQo);
    paramBitmap.setBounds(0, 0, i, i);
    paramTextView.setCompoundDrawables(paramBitmap, null, null, null);
    GMTrace.o(11395621978112L, 84904);
  }
  
  private static boolean l(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(11395487760384L, 84903);
    try
    {
      com.tencent.mm.sdk.platformtools.d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, paramString, true);
      GMTrace.o(11395487760384L, 84903);
      return true;
    }
    catch (IOException paramString)
    {
      GMTrace.o(11395487760384L, 84903);
    }
    return false;
  }
  
  private void mI(int paramInt)
  {
    GMTrace.i(11395353542656L, 84902);
    this.jeL.setProgress(paramInt);
    if (paramInt >= 100)
    {
      at.AR();
      localObject1 = com.tencent.mm.y.c.zb();
      localObject2 = an.afP().Op(this.eAE);
      if (localObject2 != null) {
        break label109;
      }
      w.e("MicroMsg.emoji.AppMsgEmojiDownloadUI", "saveImageAndPreview fail, info is null, attachid = " + this.eAE + ", msgContent = " + this.eQH);
    }
    label109:
    byte[] arrayOfByte;
    String str;
    for (;;)
    {
      an.afP().j(this);
      at.wS().b(221, this);
      GMTrace.o(11395353542656L, 84902);
      return;
      paramInt = com.tencent.mm.a.e.aY(((b)localObject2).field_fileFullPath);
      arrayOfByte = com.tencent.mm.a.e.c(((b)localObject2).field_fileFullPath, 0, paramInt);
      str = com.tencent.mm.a.g.n(arrayOfByte);
      if (!bg.nm(str))
      {
        if ((str == null) || (this.gix == null) || (str.equalsIgnoreCase(this.gix))) {
          break;
        }
        w.e("MicroMsg.emoji.AppMsgEmojiDownloadUI", "md5 not match!! emoticonmd5 is=" + this.gix + ", gen md5 is=" + str);
        w.e("MicroMsg.emoji.AppMsgEmojiDownloadUI", "fileFullPath = " + ((b)localObject2).field_fileFullPath + ", fileLength = " + paramInt + ", bufLength = " + arrayOfByte.length + ", buf = " + arrayOfByte);
        Toast.makeText(this, getString(R.l.dnk), 0).show();
        finish();
      }
    }
    com.tencent.mm.a.e.g((String)localObject1, this.kmZ, str);
    ((b)localObject2).field_fileFullPath = ((String)localObject1 + str);
    an.afP().a(((b)localObject2).field_msgInfoId, (com.tencent.mm.sdk.e.c)localObject2);
    Object localObject2 = com.tencent.mm.ao.n.IZ().a(this.eIy, 1.0F, true);
    if (localObject2 != null) {
      l((String)localObject1 + str + "_thumb", (Bitmap)localObject2);
    }
    if (o.bi(arrayOfByte)) {}
    for (Object localObject1 = h.arl().kjy.a(str, "", EmojiInfo.vCo, EmojiInfo.vCy, paramInt, this.eSd, "");; localObject1 = h.arl().kjy.a(str, "", EmojiInfo.vCo, EmojiInfo.vCz, paramInt, this.eSd, ""))
    {
      this.jeL.setVisibility(8);
      this.kmY.setVisibility(8);
      if (localObject1 == null) {
        break;
      }
      this.kna.cz(((EmojiInfo)localObject1).bUU(), null);
      this.kna.resume();
      break;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(11394682454016L, 84897);
    this.kna = ((PreViewEmojiView)findViewById(R.h.bsQ));
    Object localObject1 = com.tencent.mm.ao.n.IZ().a(this.eIy, 1.0F, true);
    this.kna.setImageBitmap((Bitmap)localObject1);
    sq("");
    this.kmY = ((TextView)findViewById(R.h.bvh));
    localObject1 = (TextView)findViewById(R.h.beS);
    Object localObject2 = com.tencent.mm.pluginsdk.model.app.g.aP(this.eSd, true);
    this.appName = com.tencent.mm.pluginsdk.model.app.g.a(this.vKB.vKW, (com.tencent.mm.pluginsdk.model.app.f)localObject2, null);
    int i;
    if ((this.eSd != null) && (this.eSd.length() > 0))
    {
      localObject2 = this.appName;
      if ((localObject2 == null) || (((String)localObject2).trim().length() == 0) || (((String)localObject2).equals("weixinfile")) || (((String)localObject2).equals("invalid_appname")))
      {
        i = 0;
        if (i == 0) {
          break label334;
        }
        ((TextView)localObject1).setText(getString(R.l.dhv, new Object[] { this.appName }));
        ((TextView)localObject1).setVisibility(0);
        localObject2 = this.eSd;
        l.b localb = new l.b();
        localb.appId = ((String)localObject2);
        localb.eRB = "message";
        ((View)localObject1).setTag(localb);
        ((View)localObject1).setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.l(this));
        localObject2 = com.tencent.mm.pluginsdk.model.app.g.b(this.eSd, 2, a.getDensity(this));
        if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled())) {
          break label316;
        }
        a(this, (TextView)localObject1, (Bitmap)localObject2);
      }
    }
    for (;;)
    {
      this.jeL = ((ProgressBar)findViewById(R.h.bvN));
      this.jeL.setMax(100);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11393877147648L, 84891);
          AppMsgEmojiDownloadUI.this.finish();
          GMTrace.o(11393877147648L, 84891);
          return true;
        }
      });
      GMTrace.o(11394682454016L, 84897);
      return;
      i = 1;
      break;
      label316:
      a(this, (TextView)localObject1, BitmapFactory.decodeResource(getResources(), R.g.aYz));
      continue;
      label334:
      ((TextView)localObject1).setVisibility(8);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11394816671744L, 84898);
    if (paramk.getType() != 221)
    {
      GMTrace.o(11394816671744L, 84898);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      mI(this.jeL.getMax());
      GMTrace.o(11394816671744L, 84898);
      return;
    }
    Toast.makeText(this, R.l.dnk, 0).show();
    this.jeL.setVisibility(8);
    this.kmY.setVisibility(8);
    w.e("MicroMsg.emoji.AppMsgEmojiDownloadUI", "onSceneEnd, download fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
    GMTrace.o(11394816671744L, 84898);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(11395219324928L, 84901);
    paramString = an.afP().Op(this.eAE);
    if (paramString == null)
    {
      w.e("MicroMsg.emoji.AppMsgEmojiDownloadUI", "updateProgress fail");
      GMTrace.o(11395219324928L, 84901);
      return;
    }
    long l1 = paramString.field_totalLen;
    long l2 = paramString.field_offset;
    this.kmY.setText(getString(R.l.dnm) + " " + getString(R.l.dnj, new Object[] { bg.aF(l2), bg.aF(l1) }));
    int i = (int)(paramString.field_offset * 100L / paramString.field_totalLen);
    w.v("MicroMsg.emoji.AppMsgEmojiDownloadUI", "attach progress:" + i + " offset:" + l2 + " totallen:" + l1);
    mI(i);
    GMTrace.o(11395219324928L, 84901);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11394414018560L, 84895);
    int i = R.i.cpl;
    GMTrace.o(11394414018560L, 84895);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 1;
    GMTrace.i(11394548236288L, 84896);
    super.onCreate(paramBundle);
    this.kmZ = ("da_" + bg.Pv());
    this.eDr = getIntent().getLongExtra("msgid", -1L);
    if (this.eDr == -1L) {
      i = 0;
    }
    while (i == 0)
    {
      finish();
      GMTrace.o(11394548236288L, 84896);
      return;
      at.AR();
      this.eRz = com.tencent.mm.y.c.yM().cM(this.eDr);
      if ((this.eRz == null) || (this.eRz.field_msgId == 0L) || (this.eRz.field_content == null))
      {
        i = 0;
      }
      else
      {
        this.eQH = this.eRz.field_content;
        paramBundle = f.a.eS(this.eQH);
        if (paramBundle == null)
        {
          i = 0;
        }
        else
        {
          this.gix = paramBundle.gix;
          this.eAE = paramBundle.eAE;
          this.eSd = paramBundle.appId;
          paramBundle = com.tencent.mm.pluginsdk.model.app.g.aP(this.eSd, true);
          this.appName = com.tencent.mm.pluginsdk.model.app.g.a(this.vKB.vKW, paramBundle, null);
          this.eIy = this.eRz.field_imgPath;
        }
      }
    }
    an.afP().c(this);
    MP();
    this.kmX = new com.tencent.mm.ad.f()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, k paramAnonymousk)
      {
        GMTrace.i(11390253268992L, 84864);
        if (paramAnonymousInt2 == 0) {}
        for (float f = 0.0F;; f = paramAnonymousInt1 * 100.0F / paramAnonymousInt2)
        {
          AppMsgEmojiDownloadUI.a(AppMsgEmojiDownloadUI.this, (int)f);
          GMTrace.o(11390253268992L, 84864);
          return;
        }
      }
    };
    if (an.afP().Op(this.eAE) == null)
    {
      long l = this.eDr;
      paramBundle = this.eQH;
      StringBuilder localStringBuilder = new StringBuilder();
      at.AR();
      com.tencent.mm.pluginsdk.model.app.l.b(l, paramBundle, com.tencent.mm.y.c.zb() + this.kmZ);
    }
    this.kmW = new ab(this.eAE, this.kmX, 8);
    at.wS().a(this.kmW, 0);
    GMTrace.o(11394548236288L, 84896);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11395756195840L, 84905);
    super.onDestroy();
    at.wS().c(this.kmW);
    an.afP().j(this);
    GMTrace.o(11395756195840L, 84905);
  }
  
  protected void onPause()
  {
    GMTrace.i(11394950889472L, 84899);
    super.onPause();
    at.wS().b(221, this);
    GMTrace.o(11394950889472L, 84899);
  }
  
  protected void onResume()
  {
    GMTrace.i(11395085107200L, 84900);
    super.onResume();
    at.wS().a(221, this);
    GMTrace.o(11395085107200L, 84900);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\AppMsgEmojiDownloadUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */