package com.tencent.mm.plugin.emoji.ui.fts;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.c.i;
import com.tencent.mm.g.a.cq;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class FTSEmojiDetailPageUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private String designerName;
  private int eDi;
  private String eEa;
  private String eHV;
  private String eOR;
  private String gRm;
  private int glE;
  private EmojiInfo iZN;
  private ProgressBar iZc;
  private com.tencent.mm.ui.tools.l iok;
  private String kkC;
  private com.tencent.mm.plugin.emoji.model.c.a kkv;
  private String krA;
  private String krB;
  private String krC;
  private com.tencent.mm.sdk.b.c krD;
  private i krE;
  private p.d krF;
  private MMAnimateView krp;
  private Button krq;
  private Button krr;
  private TextView krs;
  private ImageView krt;
  private View kru;
  private boolean krv;
  private boolean krw;
  private String krx;
  private String kry;
  private String krz;
  private int scene;
  private int type;
  
  public FTSEmojiDetailPageUI()
  {
    GMTrace.i(11428371103744L, 85148);
    this.krD = new com.tencent.mm.sdk.b.c() {};
    this.kkv = new com.tencent.mm.plugin.emoji.model.c.a()
    {
      public final void h(EmojiInfo paramAnonymousEmojiInfo)
      {
        GMTrace.i(16557635796992L, 123364);
        if ((paramAnonymousEmojiInfo != null) && (FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this) != null) && (FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this).GS().equals(paramAnonymousEmojiInfo.GS())))
        {
          w.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "emojiServiceCallback onDownload %s", new Object[] { FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this).GS() });
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(11431458111488L, 85171);
              FTSEmojiDetailPageUI.d(FTSEmojiDetailPageUI.this);
              GMTrace.o(11431458111488L, 85171);
            }
          });
          GMTrace.o(16557635796992L, 123364);
          return;
        }
        w.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "somethings error.");
        GMTrace.o(16557635796992L, 123364);
      }
    };
    this.krE = new i()
    {
      public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(16555622531072L, 123349);
        w.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "imageLoaderListener onImageLoadComplete %s", new Object[] { paramAnonymousString });
        if ((paramAnonymousBitmap != null) && (paramAnonymousVarArgs != null) && (paramAnonymousVarArgs.length > 0) && (paramAnonymousVarArgs[0] != null) && ((paramAnonymousVarArgs[0] instanceof String)) && (paramAnonymousString.equals(FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this).field_encrypturl)))
        {
          paramAnonymousString = new File(paramAnonymousVarArgs[0].toString());
          if (paramAnonymousString.exists())
          {
            FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this).field_md5 = com.tencent.mm.a.g.h(paramAnonymousString);
            paramAnonymousBitmap = FTSEmojiDetailPageUI.this;
            at.AR();
            FTSEmojiDetailPageUI.a(paramAnonymousBitmap, EmojiLogic.G(com.tencent.mm.y.c.zb(), "", FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this).field_md5));
            FileOp.o(paramAnonymousString.getAbsolutePath(), FTSEmojiDetailPageUI.e(FTSEmojiDetailPageUI.this));
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(16555890966528L, 123351);
                FTSEmojiDetailPageUI.d(FTSEmojiDetailPageUI.this);
                GMTrace.o(16555890966528L, 123351);
              }
            });
          }
        }
        GMTrace.o(16555622531072L, 123349);
      }
    };
    this.krF = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(16556562055168L, 123356);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(16556562055168L, 123356);
          return;
          FTSEmojiDetailPageUI.g(FTSEmojiDetailPageUI.this);
          GMTrace.o(16556562055168L, 123356);
          return;
          FTSEmojiDetailPageUI.h(FTSEmojiDetailPageUI.this);
        }
      }
    };
    GMTrace.o(11428371103744L, 85148);
  }
  
  private void asS()
  {
    GMTrace.i(11429042192384L, 85153);
    EmojiInfo localEmojiInfo2 = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(this.iZN.GS());
    EmojiInfo localEmojiInfo1 = localEmojiInfo2;
    if (localEmojiInfo2 == null) {
      localEmojiInfo1 = this.iZN;
    }
    if (localEmojiInfo1.field_catalog == EmojiGroupInfo.vCn)
    {
      this.krq.setEnabled(false);
      this.krq.setText(R.l.cRL);
      GMTrace.o(11429042192384L, 85153);
      return;
    }
    this.krq.setText(R.l.dov);
    if (com.tencent.mm.a.e.aZ(this.eOR))
    {
      this.krq.setEnabled(true);
      GMTrace.o(11429042192384L, 85153);
      return;
    }
    this.krq.setEnabled(false);
    GMTrace.o(11429042192384L, 85153);
  }
  
  private boolean asT()
  {
    GMTrace.i(17972022214656L, 133902);
    if ((!bg.nm(this.krC)) && (this.eDi == 1))
    {
      GMTrace.o(17972022214656L, 133902);
      return true;
    }
    GMTrace.o(17972022214656L, 133902);
    return false;
  }
  
  private void dU(boolean paramBoolean)
  {
    GMTrace.i(11428907974656L, 85152);
    if (paramBoolean) {
      sq(this.iZN.getName());
    }
    Object localObject1;
    switch (this.type)
    {
    default: 
      if (FileOp.aZ(this.eOR))
      {
        this.iZc.setVisibility(8);
        this.krp.setVisibility(0);
        localObject1 = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(this.iZN.GS());
        if ((localObject1 != null) && ((((EmojiInfo)localObject1).field_reserved4 & EmojiInfo.vCJ) == EmojiInfo.vCJ))
        {
          w.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "file exist: decrypt");
          this.krp.h(((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a((EmojiInfo)localObject1), "");
          label156:
          asS();
          localObject1 = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(this.iZN.GS());
          if (localObject1 != null) {
            break label706;
          }
          localObject1 = this.iZN;
        }
      }
      break;
    }
    label706:
    for (;;)
    {
      if ((((EmojiInfo)localObject1).field_catalog == EmojiInfo.vCu) || (bg.nm(((EmojiInfo)localObject1).field_groupId)) || ((!bg.nm(((EmojiInfo)localObject1).field_groupId)) && (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vS(((EmojiInfo)localObject1).field_groupId))) || (this.type == 4)) {
        this.krr.setEnabled(true);
      }
      for (;;)
      {
        if (this.krv) {
          this.krq.setVisibility(8);
        }
        GMTrace.o(11428907974656L, 85152);
        return;
        com.tencent.mm.ao.n.Jd().a(this.krx, this.krt);
        this.krs.setText(this.kry);
        this.eOR = this.iZN.bUU();
        break;
        com.tencent.mm.ao.n.Jd().a(this.krB, this.krt);
        this.krs.setText(this.designerName);
        this.eOR = this.iZN.bUU();
        break;
        this.krt.setVisibility(8);
        if (!bg.nm(this.krA))
        {
          this.krs.setText(this.krA);
          break;
        }
        this.krs.setText(R.l.dWt);
        break;
        w.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "file exist: no decrypt");
        this.krp.cz(this.eOR, null);
        break label156;
        localObject1 = this.iZN.field_groupId;
        at.wS().a(423, this);
        localObject1 = new com.tencent.mm.plugin.emoji.f.g((String)localObject1, (byte)0);
        at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
        continue;
        if (paramBoolean) {
          if (this.type == 4)
          {
            localObject1 = new File(getCacheDir(), com.tencent.mm.a.g.n(this.iZN.field_encrypturl.getBytes()));
            Object localObject2;
            if (((File)localObject1).exists())
            {
              this.iZN.field_md5 = com.tencent.mm.a.g.h((File)localObject1);
              at.AR();
              localObject2 = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", this.iZN.field_md5);
              if (!FileOp.aZ((String)localObject2)) {
                FileOp.o(((File)localObject1).getAbsolutePath(), (String)localObject2);
              }
              this.eOR = ((String)localObject2);
              dU(false);
            }
            else
            {
              localObject2 = new com.tencent.mm.ao.a.a.c.a();
              ((com.tencent.mm.ao.a.a.c.a)localObject2).gKC = true;
              ((com.tencent.mm.ao.a.a.c.a)localObject2).gKE = ((File)localObject1).getAbsolutePath();
              ((com.tencent.mm.ao.a.a.c.a)localObject2).gLe = new Object[] { ((File)localObject1).getAbsolutePath() };
              localObject1 = ((com.tencent.mm.ao.a.a.c.a)localObject2).Jn();
              com.tencent.mm.plugin.emoji.model.h.aqJ().a(this.iZN.field_encrypturl, null, (com.tencent.mm.ao.a.a.c)localObject1, this.krE);
            }
          }
          else
          {
            this.krp.setVisibility(8);
            this.iZc.setVisibility(0);
            this.krq.setText(R.l.dov);
            this.krr.setText(R.l.dSm);
            this.krq.setEnabled(false);
            this.krr.setEnabled(false);
            com.tencent.mm.plugin.emoji.model.h.arf().g(this.iZN);
          }
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(11429444845568L, 85156);
    if ((paramk instanceof com.tencent.mm.plugin.emoji.f.g))
    {
      at.wS().b(423, this);
      paramString = (com.tencent.mm.plugin.emoji.f.g)paramk;
      if ((paramString != null) && (!bg.nm(paramString.klt)) && (this.iZN != null) && (!bg.nm(this.iZN.field_groupId)) && (this.iZN.field_groupId.equalsIgnoreCase(paramString.klt)))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.krr.setEnabled(true);
          GMTrace.o(11429444845568L, 85156);
          return;
        }
        this.krr.setEnabled(false);
        GMTrace.o(11429444845568L, 85156);
        return;
      }
      w.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "no the same product ID");
    }
    GMTrace.o(11429444845568L, 85156);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11429176410112L, 85154);
    int i = R.i.cxJ;
    GMTrace.o(11429176410112L, 85154);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11428773756928L, 85151);
    if ((paramInt1 == 0) && (paramInt2 == -1))
    {
      Object localObject = paramIntent.getStringExtra("Select_Conv_User");
      String str1 = paramIntent.getStringExtra("custom_send_text");
      paramIntent = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(this.iZN.GS());
      String str2;
      if (paramIntent == null)
      {
        at.AR();
        str2 = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", this.iZN.GS());
        if (com.tencent.mm.a.e.aZ(str2))
        {
          if (!o.RH(str2)) {
            break label282;
          }
          paramInt1 = EmojiInfo.vCw;
          paramIntent = new EmojiInfo();
          paramIntent.field_md5 = this.iZN.GS();
          paramIntent.field_catalog = EmojiInfo.vCo;
          paramIntent.field_type = paramInt1;
          paramIntent.field_size = com.tencent.mm.a.e.aY(str2);
          paramIntent.field_temp = 1;
          if (!bg.nm(this.iZN.field_activityid)) {
            paramIntent.field_activityid = this.iZN.field_activityid;
          }
          paramIntent.field_designerID = this.iZN.field_designerID;
          paramIntent.field_thumbUrl = this.iZN.field_thumbUrl;
          paramIntent = com.tencent.mm.plugin.emoji.model.h.arl().kjy.n(paramIntent);
        }
      }
      for (;;)
      {
        localObject = bg.g(bg.aq((String)localObject, "").split(",")).iterator();
        while (((Iterator)localObject).hasNext())
        {
          str2 = (String)((Iterator)localObject).next();
          if (paramIntent != null)
          {
            com.tencent.mm.plugin.emoji.model.h.arh().a(str2, paramIntent, null);
            if (!bg.nm(str1)) {
              com.tencent.mm.plugin.messenger.a.d.aOe().cR(str1, str2);
            }
          }
        }
        label282:
        paramInt1 = EmojiInfo.vCv;
        break;
        paramIntent.field_designerID = this.iZN.field_designerID;
        paramIntent.field_thumbUrl = this.iZN.field_thumbUrl;
      }
      com.tencent.mm.ui.snackbar.a.e(this, this.vKB.vKW.getString(R.l.dwg));
    }
    GMTrace.o(11428773756928L, 85151);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11428505321472L, 85149);
    super.onCreate(paramBundle);
    this.krq = ((Button)findViewById(R.h.bvF));
    this.krr = ((Button)findViewById(R.h.bwb));
    this.krp = ((MMAnimateView)findViewById(R.h.bvU));
    this.iZc = ((ProgressBar)findViewById(R.h.bKF));
    this.krs = ((TextView)findViewById(R.h.bwe));
    this.krt = ((ImageView)findViewById(R.h.bwd));
    this.kru = findViewById(R.h.bottom_bar);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11428236886016L, 85147);
        FTSEmojiDetailPageUI.this.finish();
        GMTrace.o(11428236886016L, 85147);
        return false;
      }
    });
    this.krq.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11430921240576L, 85167);
        FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this, FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this).GS(), FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this).field_designerID, FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this).field_thumbUrl, FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this).field_activityid);
        GMTrace.o(11430921240576L, 85167);
      }
    });
    this.krr.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11427968450560L, 85145);
        FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this, FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this).GS(), FTSEmojiDetailPageUI.a(FTSEmojiDetailPageUI.this).field_activityid);
        GMTrace.o(11427968450560L, 85145);
      }
    });
    this.kru.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11430652805120L, 85165);
        FTSEmojiDetailPageUI.b(FTSEmojiDetailPageUI.this);
        GMTrace.o(11430652805120L, 85165);
      }
    });
    a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16555354095616L, 123347);
        FTSEmojiDetailPageUI.c(FTSEmojiDetailPageUI.this);
        GMTrace.o(16555354095616L, 123347);
        return true;
      }
    });
    this.type = getIntent().getIntExtra("extra_type", 0);
    this.scene = getIntent().getIntExtra("extra_scence", 0);
    this.iZN = new EmojiInfo();
    this.iZN.field_designerID = getIntent().getStringExtra("id");
    this.iZN.field_name = getIntent().getStringExtra("extra_emoji_name");
    this.iZN.field_aeskey = getIntent().getStringExtra("extra_aeskey");
    this.iZN.field_encrypturl = getIntent().getStringExtra("extra_encrypt_url");
    this.iZN.field_thumbUrl = getIntent().getStringExtra("extra_thumb_url");
    this.iZN.field_md5 = getIntent().getStringExtra("extra_md5");
    this.iZN.field_groupId = getIntent().getStringExtra("extra_product_id");
    this.eEa = this.iZN.field_groupId;
    this.kry = getIntent().getStringExtra("extra_product_name");
    this.krx = getIntent().getStringExtra("productUrl");
    this.krz = getIntent().getStringExtra("extra_article_url");
    this.krA = getIntent().getStringExtra("extra_article_name");
    this.eHV = this.iZN.field_designerID;
    this.designerName = getIntent().getStringExtra("name");
    this.krB = getIntent().getStringExtra("headurl");
    this.krC = getIntent().getStringExtra("weapp_user_name");
    this.glE = getIntent().getIntExtra("weapp_version", 0);
    this.eDi = getIntent().getIntExtra("source_type", 0);
    this.gRm = getIntent().getStringExtra("searchID");
    this.kkC = getIntent().getStringExtra("docID");
    this.krv = getIntent().getBooleanExtra("disableAddSticker", false);
    this.krw = getIntent().getBooleanExtra("needSavePhotosAlbum", false);
    paramBundle = getIntent().getStringExtra("activityId");
    if (!bg.nm(paramBundle)) {
      this.iZN.field_activityid = paramBundle;
    }
    com.tencent.mm.sdk.b.a.vgX.b(this.krD);
    com.tencent.mm.plugin.emoji.model.h.arf().kki = this.kkv;
    com.tencent.mm.az.k.f(this.scene, this.gRm, this.kkC);
    dU(true);
    w.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "localPath=%s", new Object[] { this.eOR });
    com.tencent.mm.az.k.f(this.scene, this.gRm, this.kkC);
    GMTrace.o(11428505321472L, 85149);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11429310627840L, 85155);
    com.tencent.mm.sdk.b.a.vgX.c(this.krD);
    com.tencent.mm.plugin.emoji.model.h.arf().kki = null;
    super.onDestroy();
    GMTrace.o(11429310627840L, 85155);
  }
  
  protected void onResume()
  {
    GMTrace.i(11428639539200L, 85150);
    super.onResume();
    asS();
    GMTrace.o(11428639539200L, 85150);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\fts\FTSEmojiDetailPageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */