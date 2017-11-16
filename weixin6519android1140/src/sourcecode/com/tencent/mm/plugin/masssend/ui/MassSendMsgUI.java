package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.c.a;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.network.ab;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.chat.AppPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.protocal.c.anf;
import com.tencent.mm.protocal.c.anq;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MassSendMsgUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private static String mUa;
  private String filePath;
  private com.tencent.mm.ui.base.r hsU;
  private TextView mTZ;
  private ChatFooter mTr;
  private String mTt;
  private List<String> mTu;
  private boolean mTv;
  private i mUb;
  private b mUc;
  private AppPanel.a mUd;
  private TextView mrw;
  
  static
  {
    GMTrace.i(11224762810368L, 83631);
    mUa = "";
    GMTrace.o(11224762810368L, 83631);
  }
  
  public MassSendMsgUI()
  {
    GMTrace.i(11220602060800L, 83600);
    this.hsU = null;
    this.mTv = false;
    this.mUd = new AppPanel.a()
    {
      public final void aNL()
      {
        GMTrace.i(11225299681280L, 83635);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.dIu), 0).show();
        GMTrace.o(11225299681280L, 83635);
      }
      
      public final void aNM()
      {
        GMTrace.i(11225433899008L, 83636);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.dIi), 0).show();
        GMTrace.o(11225433899008L, 83636);
      }
      
      public final void aNN()
      {
        GMTrace.i(11225568116736L, 83637);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.dIs), 0).show();
        GMTrace.o(11225568116736L, 83637);
      }
      
      public final void aNO()
      {
        GMTrace.i(11225702334464L, 83638);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.dIo), 0).show();
        GMTrace.o(11225702334464L, 83638);
      }
      
      public final void aNP()
      {
        GMTrace.i(11225836552192L, 83639);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.dIi), 0).show();
        GMTrace.o(11225836552192L, 83639);
      }
      
      public final void aNQ()
      {
        GMTrace.i(11226239205376L, 83642);
        com.tencent.mm.plugin.masssend.a.hnH.aq(MassSendMsgUI.this);
        GMTrace.o(11226239205376L, 83642);
      }
      
      public final void aNR()
      {
        GMTrace.i(11226373423104L, 83643);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.dIi), 0).show();
        GMTrace.o(11226373423104L, 83643);
      }
      
      public final void aNS()
      {
        GMTrace.i(11226507640832L, 83644);
        GMTrace.o(11226507640832L, 83644);
      }
      
      public final void aNT()
      {
        GMTrace.i(11226641858560L, 83645);
        Intent localIntent = new Intent();
        localIntent.putExtra("preceding_scence", 13);
        com.tencent.mm.bj.d.b(MassSendMsgUI.this, "emoji", ".ui.v2.EmojiStoreV2UI", localIntent);
        GMTrace.o(11226641858560L, 83645);
      }
      
      public final void aNU()
      {
        GMTrace.i(11226910294016L, 83647);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.dIp), 0).show();
        GMTrace.o(11226910294016L, 83647);
      }
      
      public final void aNV()
      {
        GMTrace.i(11227044511744L, 83648);
        GMTrace.o(11227044511744L, 83648);
      }
      
      public final void aNW()
      {
        GMTrace.i(11227178729472L, 83649);
        GMTrace.o(11227178729472L, 83649);
      }
      
      public final void aNX()
      {
        GMTrace.i(11227312947200L, 83650);
        GMTrace.o(11227312947200L, 83650);
      }
      
      public final void b(com.tencent.mm.pluginsdk.model.app.f paramAnonymousf)
      {
        GMTrace.i(11226104987648L, 83641);
        GMTrace.o(11226104987648L, 83641);
      }
      
      public final void qm(int paramAnonymousInt)
      {
        GMTrace.i(11225970769920L, 83640);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(11225970769920L, 83640);
          return;
          com.tencent.mm.pluginsdk.ui.tools.k.a(MassSendMsgUI.this, 1, 1, 0, 3, false, null);
          GMTrace.o(11225970769920L, 83640);
          return;
          File localFile = new File(com.tencent.mm.compatible.util.e.fRZ);
          if ((!localFile.exists()) && (!localFile.mkdir()))
          {
            Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.dhy), 1).show();
            GMTrace.o(11225970769920L, 83640);
            return;
          }
          boolean bool = com.tencent.mm.pluginsdk.h.a.a(MassSendMsgUI.this.vKB.vKW, "android.permission.CAMERA", 16, "", "");
          w.i("MicroMsg.MassSendMsgUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), MassSendMsgUI.this.vKB.vKW });
          if (!bool)
          {
            GMTrace.o(11225970769920L, 83640);
            return;
          }
          MassSendMsgUI.c(MassSendMsgUI.this);
        }
      }
      
      public final void qn(int paramAnonymousInt)
      {
        GMTrace.i(11226776076288L, 83646);
        MassSendMsgUI.d(MassSendMsgUI.this);
        GMTrace.o(11226776076288L, 83646);
      }
    };
    GMTrace.o(11220602060800L, 83600);
  }
  
  public static void BQ(String paramString)
  {
    GMTrace.i(11221004713984L, 83603);
    mUa = paramString;
    GMTrace.o(11221004713984L, 83603);
  }
  
  private static void BR(String paramString)
  {
    GMTrace.i(11223017979904L, 83618);
    long l = com.tencent.mm.a.e.aY(paramString);
    int i = bg.e((Integer)g.a((int)(l / 1024L), new int[] { 512, 1024, 2048, 5120, 8192, 10240, 15360, 20480 }, 247, 255));
    g.ork.a(106L, i, 1L, false);
    g.ork.a(106L, 246L, 1L, false);
    w.d("MicroMsg.MassSendMsgUI", "report video size res : " + i + " hadCompress : true fileLen : " + l / 1024L + "K");
    GMTrace.o(11223017979904L, 83618);
  }
  
  private void N(final Intent paramIntent)
  {
    GMTrace.i(11222078455808L, 83611);
    Object localObject = paramIntent.getStringExtra("VideoRecorder_FileName");
    int i = paramIntent.getIntExtra("VideoRecorder_VideoLength", 0);
    paramIntent = new com.tencent.mm.plugin.masssend.a.a();
    paramIntent.mTa = this.mTt;
    paramIntent.mTb = this.mTu.size();
    paramIntent.filename = ((String)localObject);
    paramIntent.mTc = i;
    paramIntent.msgType = 43;
    paramIntent = new com.tencent.mm.plugin.masssend.a.f(paramIntent, this.mTv);
    at.wS().a(paramIntent, 0);
    localObject = this.vKB.vKW;
    getString(R.l.cUG);
    this.hsU = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.dXH), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11234426486784L, 83703);
        at.wS().c(paramIntent);
        GMTrace.o(11234426486784L, 83703);
      }
    });
    GMTrace.o(11222078455808L, 83611);
  }
  
  private void O(final Intent paramIntent)
  {
    GMTrace.i(11222212673536L, 83612);
    Object localObject = paramIntent.getStringExtra("CropImage_OutputPath");
    if (localObject == null)
    {
      GMTrace.o(11222212673536L, 83612);
      return;
    }
    if (q.a((String)localObject, null, paramIntent.getBooleanExtra("CropImage_Compress_Img", true))) {}
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.plugin.masssend.a.h.aNB();
      paramIntent = com.tencent.mm.plugin.masssend.a.b.h((String)localObject, this.mTt, this.mTu.size(), i);
      if (paramIntent != null) {
        break;
      }
      GMTrace.o(11222212673536L, 83612);
      return;
    }
    paramIntent = new com.tencent.mm.plugin.masssend.a.f(paramIntent, this.mTv, i);
    at.wS().a(paramIntent, 0);
    localObject = this.vKB.vKW;
    getString(R.l.cUG);
    this.hsU = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.dXH), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11249593090048L, 83816);
        at.wS().c(paramIntent);
        GMTrace.o(11249593090048L, 83816);
      }
    });
    GMTrace.o(11222212673536L, 83612);
  }
  
  private void P(final Intent paramIntent)
  {
    GMTrace.i(11222481108992L, 83614);
    if (!ab.bv(this))
    {
      com.tencent.mm.ui.base.h.a(this, R.l.egp, R.l.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11228923559936L, 83662);
          MassSendMsgUI.b(MassSendMsgUI.this, paramIntent);
          GMTrace.o(11228923559936L, 83662);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11218857230336L, 83587);
          GMTrace.o(11218857230336L, 83587);
        }
      });
      GMTrace.o(11222481108992L, 83614);
      return;
    }
    Q(paramIntent);
    GMTrace.o(11222481108992L, 83614);
  }
  
  private void Q(Intent paramIntent)
  {
    GMTrace.i(11222615326720L, 83615);
    final com.tencent.mm.modelvideo.c localc = new com.tencent.mm.modelvideo.c();
    getString(R.l.cUG);
    this.hsU = com.tencent.mm.ui.base.h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11228118253568L, 83656);
        localc.hab = null;
        GMTrace.o(11228118253568L, 83656);
      }
    });
    localc.a(this, paramIntent, new c.a()
    {
      public final void a(int paramAnonymousInt1, final String paramAnonymousString1, final String paramAnonymousString2, final int paramAnonymousInt2)
      {
        GMTrace.i(11229863084032L, 83669);
        w.d("MicroMsg.MassSendMsgUI", "onImportFinish, ret: %s, fileName: %s, importPath: %s", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousString1, paramAnonymousString2 });
        if ((paramAnonymousInt1 < 0) && (paramAnonymousInt1 != -50002))
        {
          Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.egn), 0).show();
          if (MassSendMsgUI.e(MassSendMsgUI.this) != null)
          {
            MassSendMsgUI.e(MassSendMsgUI.this).dismiss();
            MassSendMsgUI.f(MassSendMsgUI.this);
            GMTrace.o(11229863084032L, 83669);
          }
        }
        else
        {
          com.tencent.mm.sdk.f.e.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(11227581382656L, 83652);
              if (MassSendMsgUI.a(MassSendMsgUI.this, paramAnonymousString1, paramAnonymousString2))
              {
                af.t(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(11240063631360L, 83745);
                    MassSendMsgUI.a(MassSendMsgUI.this, MassSendMsgUI.5.1.this.kWv, MassSendMsgUI.5.1.this.ikz);
                    GMTrace.o(11240063631360L, 83745);
                  }
                });
                GMTrace.o(11227581382656L, 83652);
                return;
              }
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(11237513494528L, 83726);
                  Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.ego), 0).show();
                  if (MassSendMsgUI.e(MassSendMsgUI.this) != null)
                  {
                    MassSendMsgUI.e(MassSendMsgUI.this).dismiss();
                    MassSendMsgUI.f(MassSendMsgUI.this);
                  }
                  GMTrace.o(11237513494528L, 83726);
                }
              });
              GMTrace.o(11227581382656L, 83652);
            }
          }, "MassSend_Remux");
        }
        GMTrace.o(11229863084032L, 83669);
      }
    });
    GMTrace.o(11222615326720L, 83615);
  }
  
  private void ahJ()
  {
    GMTrace.i(11221810020352L, 83609);
    if (!com.tencent.mm.pluginsdk.ui.tools.k.c(this, com.tencent.mm.compatible.util.e.fRZ, "microMsg." + System.currentTimeMillis() + ".jpg", 2)) {
      Toast.makeText(this, getString(R.l.dWY), 1).show();
    }
    GMTrace.o(11221810020352L, 83609);
  }
  
  private boolean cQ(String paramString1, String paramString2)
  {
    GMTrace.i(11222749544448L, 83616);
    boolean bool = am.is2G(this);
    if (bool)
    {
      i = 10485760;
      label25:
      if (!bool) {
        break label155;
      }
    }
    label155:
    for (double d = 60000.0D;; d = 300000.0D)
    {
      i = SightVideoJNI.shouldRemuxing(paramString2, 660, 500, i, d, 1000000);
      w.i("MicroMsg.MassSendMsgUI", "check remuxing, ret %d", new Object[] { Integer.valueOf(i) });
      switch (i)
      {
      default: 
        GMTrace.o(11222749544448L, 83616);
        return false;
        i = 20971520;
        break label25;
      }
    }
    com.tencent.mm.modelvideo.o.Nh();
    BR(s.mk(paramString1));
    GMTrace.o(11222749544448L, 83616);
    return true;
    GMTrace.o(11222749544448L, 83616);
    return false;
    com.tencent.mm.modelvideo.o.Nh();
    String str = s.mk(paramString1);
    MediaMetadataRetriever localMediaMetadataRetriever = new MediaMetadataRetriever();
    localMediaMetadataRetriever.setDataSource(paramString2);
    w.i("MicroMsg.MassSendMsgUI", "start remux, targetPath: %s", new Object[] { str });
    int k = bg.getInt(localMediaMetadataRetriever.extractMetadata(18), 0);
    int m = bg.getInt(localMediaMetadataRetriever.extractMetadata(19), 0);
    int n = 0;
    int i = m;
    int j = k;
    int i1;
    int i2;
    if (n < 3)
    {
      if ((j % 2 != 0) || (i % 2 != 0))
      {
        GMTrace.o(11222749544448L, 83616);
        return false;
      }
      if (j >= i)
      {
        i1 = j;
        i2 = i;
        if (j > 640)
        {
          i1 = j;
          i2 = i;
          if (i <= 480) {}
        }
      }
      else
      {
        if (j > i) {
          break label442;
        }
        i1 = j;
        i2 = i;
        if (j > 480)
        {
          if (i > 640) {
            break label442;
          }
          i2 = i;
          i1 = j;
        }
      }
    }
    for (;;)
    {
      localMediaMetadataRetriever.release();
      i = SightVideoJNI.remuxing(paramString2, str, i1, i2, com.tencent.mm.plugin.sight.base.b.oRE, com.tencent.mm.plugin.sight.base.b.oRD, 8, 2, 25.0F, com.tencent.mm.plugin.sight.base.b.oRF, null, 0, false);
      if (i < 0)
      {
        w.w("MicroMsg.MassSendMsgUI", "remuxing video error");
        GMTrace.o(11222749544448L, 83616);
        return false;
        label442:
        j /= 2;
        i /= 2;
        n += 1;
        break;
      }
      BR(str);
      com.tencent.mm.modelvideo.o.Nh();
      paramString1 = s.ml(paramString1);
      if (!FileOp.aZ(paramString1)) {
        w.i("MicroMsg.MassSendMsgUI", "thumb not exist create one, thumbPath: %s", new Object[] { paramString1 });
      }
      try
      {
        paramString2 = ThumbnailUtils.createVideoThumbnail(str, 1);
        if (paramString2 != null) {
          com.tencent.mm.sdk.platformtools.d.a(paramString2, 60, Bitmap.CompressFormat.JPEG, paramString1, true);
        }
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.MassSendMsgUI", paramString1, "", new Object[0]);
          w.e("MicroMsg.MassSendMsgUI", "create thumb error: %s", new Object[] { paramString1.getMessage() });
        }
      }
      w.i("MicroMsg.MassSendMsgUI", "do remux, targetPath: %s, outputWidth: %s, outputHeight: %s, retDuration: %s", new Object[] { str, Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i) });
      GMTrace.o(11222749544448L, 83616);
      return true;
      i1 = k;
      i2 = m;
    }
  }
  
  protected final void MP()
  {
    boolean bool = false;
    GMTrace.i(11221541584896L, 83607);
    oM(R.l.cBm);
    this.mTZ = ((TextView)findViewById(R.h.bMs));
    this.mrw = ((TextView)findViewById(R.h.bMr));
    TextView localTextView = this.mTZ;
    int j = (int)this.mTZ.getTextSize();
    if (this.mTu == null) {}
    for (Object localObject = new SpannableString("");; localObject = com.tencent.mm.pluginsdk.ui.d.h.c(this, ((StringBuilder)localObject).toString(), j))
    {
      localTextView.setText((CharSequence)localObject);
      this.mrw.setText(getResources().getQuantityString(R.j.cIt, this.mTu.size(), new Object[] { Integer.valueOf(this.mTu.size()) }));
      this.mTr = ((ChatFooter)findViewById(R.h.bPu));
      ((MassSendLayout)findViewById(R.h.bMw)).iBW = this.mTr.tzw;
      this.mTr.zx(R.h.bMw);
      this.mUc = new b(this, this.mTr, this.mTt, this.mTu, this.mTv);
      this.mTr.tzC = this.mUc;
      localObject = new d(this);
      this.mTr.b((com.tencent.mm.pluginsdk.ui.chat.f)localObject);
      localObject = this.mTr;
      at.AR();
      j = ((Integer)com.tencent.mm.y.c.xh().get(18, Integer.valueOf(-1))).intValue();
      int i = j;
      if (j == -1) {
        i = 1;
      }
      ((ChatFooter)localObject).V(i, true);
      this.mTr.Pt("masssendapp");
      this.mTr.bMy();
      at.AR();
      if (((Boolean)com.tencent.mm.y.c.xh().get(66832, Boolean.valueOf(false))).booleanValue())
      {
        this.mTr.bMw();
        this.mTr.bMt();
      }
      this.mTr.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(11238855671808L, 83736);
          GMTrace.o(11238855671808L, 83736);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(11238587236352L, 83734);
          GMTrace.o(11238587236352L, 83734);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(11238721454080L, 83735);
          paramAnonymousCharSequence = String.valueOf(paramAnonymousCharSequence);
          final String str = paramAnonymousCharSequence.substring(paramAnonymousInt1, paramAnonymousInt1 + paramAnonymousInt3);
          if (((MassSendMsgUI.a(MassSendMsgUI.this) == null) || (!MassSendMsgUI.a(MassSendMsgUI.this).isShowing())) && (com.tencent.mm.sdk.platformtools.o.RF(str)))
          {
            Bitmap localBitmap = com.tencent.mm.sdk.platformtools.d.e(str, 300, 300, false);
            if (localBitmap == null)
            {
              w.e("MicroMsg.MassSendMsgUI", "showAlert fail, bmp is null");
              GMTrace.o(11238721454080L, 83735);
              return;
            }
            ImageView localImageView = new ImageView(MassSendMsgUI.this);
            localImageView.setImageBitmap(localBitmap);
            paramAnonymousInt2 = MassSendMsgUI.this.getResources().getDimensionPixelSize(R.f.aQq);
            localImageView.setPadding(paramAnonymousInt2, paramAnonymousInt2, paramAnonymousInt2, paramAnonymousInt2);
            MassSendMsgUI.a(MassSendMsgUI.this, com.tencent.mm.ui.base.h.a(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.dhq), localImageView, MassSendMsgUI.this.getString(R.l.cTM), MassSendMsgUI.this.getString(R.l.cSk), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(11236439752704L, 83718);
                paramAnonymous2DialogInterface = new Intent();
                paramAnonymous2DialogInterface.putExtra("CropImage_OutputPath", str);
                MassSendMsgUI.a(MassSendMsgUI.this, paramAnonymous2DialogInterface);
                GMTrace.o(11236439752704L, 83718);
              }
            }, null));
            paramAnonymousCharSequence = paramAnonymousCharSequence.substring(0, paramAnonymousInt1) + paramAnonymousCharSequence.substring(paramAnonymousInt1 + paramAnonymousInt3);
            MassSendMsgUI.b(MassSendMsgUI.this).p(paramAnonymousCharSequence, -1, false);
            MassSendMsgUI.BS(paramAnonymousCharSequence);
          }
          GMTrace.o(11238721454080L, 83735);
        }
      });
      this.mTr.bMs();
      this.mTr.bMk();
      this.mTr.bMr();
      this.mTr.bMn();
      this.mTr.bMq();
      this.mTr.ko(true);
      this.mTr.a(this.mUd);
      localObject = this.mTr;
      com.tencent.mm.bj.d.bNA();
      if ((com.tencent.mm.ap.b.Js()) || ((q.zP() & 0x2000000) != 0)) {
        bool = true;
      }
      ((ChatFooter)localObject).kp(bool);
      this.mTr.bMm();
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11230668390400L, 83675);
          MassSendMsgUI.this.finish();
          GMTrace.o(11230668390400L, 83675);
          return true;
        }
      });
      GMTrace.o(11221541584896L, 83607);
      return;
      localObject = new StringBuilder();
      i = 0;
      if (i < this.mTu.size())
      {
        String str = com.tencent.mm.y.r.fs((String)this.mTu.get(i));
        if (i == this.mTu.size() - 1) {
          ((StringBuilder)localObject).append(str);
        }
        for (;;)
        {
          i += 1;
          break;
          ((StringBuilder)localObject).append(str + ",  ");
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(11222883762176L, 83617);
    w.i("MicroMsg.MassSendMsgUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.hsU != null)
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    if (this.mUc != null)
    {
      b localb = this.mUc;
      if (localb.hsU != null)
      {
        localb.hsU.dismiss();
        localb.hsU = null;
      }
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      mUa = "";
      paramString = new Intent(this, MassSendHistoryUI.class);
      paramString.addFlags(67108864);
      startActivity(paramString);
      finish();
      GMTrace.o(11222883762176L, 83617);
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -24))
    {
      w.e("MicroMsg.MassSendMsgUI", "onSceneEnd, masssend err spam");
      Toast.makeText(this, R.l.dIm, 0).show();
      GMTrace.o(11222883762176L, 83617);
      return;
    }
    if ((paramInt1 == 2) || (paramInt1 == 1) || (paramInt1 == 3)) {
      this.mTr.p(mUa, -1, true);
    }
    com.tencent.mm.plugin.masssend.a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString);
    switch (paramInt2)
    {
    default: 
      Toast.makeText(this, R.l.dXF, 0).show();
      GMTrace.o(11222883762176L, 83617);
      return;
    case -71: 
      paramInt1 = ((anq)((com.tencent.mm.plugin.masssend.a.f)paramk).fUa.gtD.gtK).uCK;
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dIt, new Object[] { Integer.valueOf(paramInt1) }), getString(R.l.cUG), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11228655124480L, 83660);
          MassSendMsgUI.this.finish();
          GMTrace.o(11228655124480L, 83660);
        }
      });
      GMTrace.o(11222883762176L, 83617);
      return;
    }
    Toast.makeText(this, R.l.dIl, 0).show();
    GMTrace.o(11222883762176L, 83617);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11221407367168L, 83606);
    int i = R.i.cBm;
    GMTrace.o(11221407367168L, 83606);
    return i;
  }
  
  protected void onActivityResult(final int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(11222346891264L, 83613);
    w.i("MicroMsg.MassSendMsgUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(11222346891264L, 83613);
      return;
    }
    final Object localObject;
    switch (paramInt1)
    {
    case 3: 
    default: 
      w.e("MicroMsg.MassSendMsgUI", "onActivityResult: not found this requestCode");
      GMTrace.o(11222346891264L, 83613);
      return;
    case 1: 
      if (paramIntent == null)
      {
        GMTrace.o(11222346891264L, 83613);
        return;
      }
      if (paramIntent.getBooleanExtra("is_video", false))
      {
        paramIntent = paramIntent.getStringExtra("video_full_path");
        localObject = new Intent();
        ((Intent)localObject).setData(Uri.parse("file://" + paramIntent));
        P((Intent)localObject);
        GMTrace.o(11222346891264L, 83613);
        return;
      }
      localObject = new Intent();
      ((Intent)localObject).putExtra("CropImageMode", 4);
      ((Intent)localObject).putExtra("CropImage_Filter", true);
      m localm = com.tencent.mm.plugin.masssend.a.hnH;
      at.AR();
      localm.a(this, paramIntent, (Intent)localObject, com.tencent.mm.y.c.yU(), 4, null);
      GMTrace.o(11222346891264L, 83613);
      return;
    case 2: 
      localObject = getApplicationContext();
      at.AR();
      this.filePath = com.tencent.mm.pluginsdk.ui.tools.k.b((Context)localObject, paramIntent, com.tencent.mm.y.c.yU());
      if (this.filePath == null)
      {
        GMTrace.o(11222346891264L, 83613);
        return;
      }
      paramIntent = new Intent();
      paramIntent.putExtra("CropImageMode", 4);
      paramIntent.putExtra("CropImage_Filter", true);
      paramIntent.putExtra("CropImage_ImgPath", this.filePath);
      com.tencent.mm.plugin.masssend.a.hnH.a(this.vKB.vKW, paramIntent, 4);
      GMTrace.o(11222346891264L, 83613);
      return;
    case 4: 
      O(paramIntent);
      GMTrace.o(11222346891264L, 83613);
      return;
    case 8: 
      paramIntent = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
      if (paramIntent != null)
      {
        if (paramIntent.mWF)
        {
          localObject = paramIntent.mWN;
          if (!bg.nm((String)localObject)) {
            try
            {
              boolean bool = paramIntent.mWG;
              w.i("MicroMsg.MassSendMsgUI", "doSendChattingImage, path: %s", new Object[] { localObject });
              com.tencent.mm.plugin.masssend.a.h.aNB();
              paramIntent = com.tencent.mm.plugin.masssend.a.b.h((String)localObject, this.mTt, this.mTu.size(), 0);
              if (paramIntent == null)
              {
                GMTrace.o(11222346891264L, 83613);
                return;
              }
              paramIntent = new com.tencent.mm.plugin.masssend.a.f(paramIntent, this.mTv, 0);
              at.wS().a(paramIntent, 0);
              localObject = this.vKB.vKW;
              getString(R.l.cUG);
              this.hsU = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.dXH), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymousDialogInterface)
                {
                  GMTrace.i(11225031245824L, 83633);
                  at.wS().c(paramIntent);
                  GMTrace.o(11225031245824L, 83633);
                }
              });
              GMTrace.o(11222346891264L, 83613);
              return;
            }
            catch (Exception paramIntent)
            {
              w.e("MicroMsg.MassSendMsgUI", "doSendChattingImage error: %s", new Object[] { paramIntent.getMessage() });
            }
          }
          GMTrace.o(11222346891264L, 83613);
          return;
        }
        w.i("MicroMsg.MassSendMsgUI", "video path %s thumb path ", new Object[] { paramIntent.mWH, paramIntent.mWI });
        com.tencent.mm.modelvideo.o.Nh();
        localObject = s.mk(paramIntent.mWJ);
        if (!paramIntent.mWH.equals(localObject))
        {
          w.i("MicroMsg.MassSendMsgUI", "filepath not videopath and move it %s %s", new Object[] { paramIntent.mWH, localObject });
          FileOp.al(paramIntent.mWH, (String)localObject);
        }
        localObject = paramIntent.mWJ;
        paramInt1 = paramIntent.mWL;
        paramIntent = new com.tencent.mm.modelvideo.c();
        getString(R.l.cUG);
        this.hsU = com.tencent.mm.ui.base.h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(11234158051328L, 83701);
            paramIntent.hab = null;
            GMTrace.o(11234158051328L, 83701);
          }
        });
        com.tencent.mm.sdk.f.e.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11229594648576L, 83667);
            VideoTransPara localVideoTransPara = com.tencent.mm.modelcontrol.d.Gv().Gw();
            anf localanf = new anf();
            localanf.uBZ = true;
            if (com.tencent.mm.plugin.mmsight.model.l.a(localObject, localVideoTransPara, localanf, new com.tencent.mm.plugin.mmsight.model.d()
            {
              public final boolean aNY()
              {
                GMTrace.i(11242076897280L, 83760);
                GMTrace.o(11242076897280L, 83760);
                return false;
              }
            })) {
              com.tencent.mm.plugin.mmsight.model.l.b(localObject, localVideoTransPara, localanf, new com.tencent.mm.plugin.mmsight.model.d()
              {
                public final boolean aNY()
                {
                  GMTrace.i(11232279003136L, 83687);
                  GMTrace.o(11232279003136L, 83687);
                  return false;
                }
              });
            }
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(11219125665792L, 83589);
                MassSendMsgUI.a(MassSendMsgUI.this, MassSendMsgUI.15.this.lhu, MassSendMsgUI.15.this.ikz);
                GMTrace.o(11219125665792L, 83589);
              }
            });
            GMTrace.o(11229594648576L, 83667);
          }
        }, "MassSend_Remux");
      }
      GMTrace.o(11222346891264L, 83613);
      return;
    case 7: 
      if (paramIntent != null)
      {
        if (paramIntent.getBooleanExtra("from_record", false))
        {
          N(paramIntent);
          GMTrace.o(11222346891264L, 83613);
          return;
        }
        P(paramIntent);
        GMTrace.o(11222346891264L, 83613);
        return;
      }
      break;
    case 5: 
      N(paramIntent);
      GMTrace.o(11222346891264L, 83613);
      return;
    case 6: 
      P(paramIntent);
      GMTrace.o(11222346891264L, 83613);
      return;
    }
    GMTrace.o(11222346891264L, 83613);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11220736278528L, 83601);
    super.onCreate(paramBundle);
    at.wS().a(193, this);
    this.mTv = getIntent().getBooleanExtra("mass_send_again", false);
    this.mTt = getIntent().getStringExtra("mass_send_contact_list");
    paramBundle = this.mTt;
    this.mTu = new ArrayList();
    if ((paramBundle == null) || (paramBundle.equals(""))) {}
    for (;;)
    {
      MP();
      GMTrace.o(11220736278528L, 83601);
      return;
      paramBundle = paramBundle.split(";");
      if ((paramBundle != null) && (paramBundle.length > 0)) {
        this.mTu = bg.g(paramBundle);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11221138931712L, 83604);
    at.wS().b(193, this);
    super.onDestroy();
    if (this.mTr != null) {
      this.mTr.destroy();
    }
    GMTrace.o(11221138931712L, 83604);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11221675802624L, 83608);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0) && (this.mTr.bMz()))
    {
      this.mTr.bMB();
      GMTrace.o(11221675802624L, 83608);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11221675802624L, 83608);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(11221273149440L, 83605);
    this.mTr.azl();
    this.mTr.onPause();
    super.onPause();
    GMTrace.o(11221273149440L, 83605);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(11221944238080L, 83610);
    w.i("MicroMsg.MassSendMsgUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11221944238080L, 83610);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        ahJ();
        GMTrace.o(11221944238080L, 83610);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dNn), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11237781929984L, 83728);
          MassSendMsgUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(11237781929984L, 83728);
        }
      }, null);
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(11220870496256L, 83602);
    super.onResume();
    if (this.mTr != null)
    {
      this.mTr.p(mUa, -1, true);
      this.mTr.a(this.vKB.vKW, this);
    }
    GMTrace.o(11220870496256L, 83602);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\masssend\ui\MassSendMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */