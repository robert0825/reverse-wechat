package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.oj;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.pluginsdk.ui.applet.r;
import com.tencent.mm.pluginsdk.ui.applet.r.a;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.s;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

public class SnsAdNativeLandingTestUI
  extends MMActivity
{
  private int duration;
  private com.tencent.mm.sdk.platformtools.ae ghS;
  private double oTK;
  private int pIq;
  private VideoSightView pXM;
  SnsAdNativeLandingPagesVideoPlayerLoadingBar pXN;
  private int videoHeight;
  private int videoWidth;
  
  public SnsAdNativeLandingTestUI()
  {
    GMTrace.i(8629528821760L, 64295);
    this.oTK = 0.0D;
    this.duration = 0;
    this.ghS = new com.tencent.mm.sdk.platformtools.ae();
    GMTrace.o(8629528821760L, 64295);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8629797257216L, 64297);
    int i = i.g.pfr;
    GMTrace.o(8629797257216L, 64297);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8629663039488L, 64296);
    super.onCreate(paramBundle);
    this.vKB.bXF();
    getWindow().setFlags(1024, 1024);
    ((Button)findViewById(i.f.pcA)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8504035246080L, 63360);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("Select_Conv_Type", 259);
        paramAnonymousView.putExtra("select_is_ret", true);
        d.a(SnsAdNativeLandingTestUI.this, ".ui.transmit.SelectConversationUI", paramAnonymousView, 0, new MMActivity.a()
        {
          public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, final Intent paramAnonymous2Intent)
          {
            GMTrace.i(8613959565312L, 64179);
            if (paramAnonymous2Int2 == -1)
            {
              if (paramAnonymous2Intent == null) {}
              for (paramAnonymous2Intent = null; (paramAnonymous2Intent == null) || (paramAnonymous2Intent.length() == 0); paramAnonymous2Intent = paramAnonymous2Intent.getStringExtra("Select_Conv_User"))
              {
                w.e("MicroMsg.Sns.SnsAdNativieLandingTestUI", "mmOnActivityResult fail, toUser is null");
                GMTrace.o(8613959565312L, 64179);
                return;
              }
              final SnsAdNativeLandingTestUI localSnsAdNativeLandingTestUI = SnsAdNativeLandingTestUI.this;
              r.a.txX.a(((MMActivity)localSnsAdNativeLandingTestUI).vKB, "test title", "http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150", "test desc", localSnsAdNativeLandingTestUI.getResources().getString(i.j.cUs), new o.a()
              {
                public final void a(boolean paramAnonymous3Boolean, String paramAnonymous3String, int paramAnonymous3Int)
                {
                  GMTrace.i(8516785930240L, 63455);
                  if (paramAnonymous3Boolean)
                  {
                    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
                    localWXMediaMessage.title = "test title";
                    localWXMediaMessage.description = "test desc";
                    Object localObject1 = new WXWebpageObject();
                    ((WXWebpageObject)localObject1).canvasPageXml = "<xml></xml>";
                    ((WXWebpageObject)localObject1).webpageUrl = "http://www.baidu.com/";
                    localWXMediaMessage.mediaObject = ((WXMediaMessage.IMediaObject)localObject1);
                    localObject1 = Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages";
                    Object localObject2 = "adId" + "_image_" + aa.RP("http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150");
                    localObject1 = (String)localObject1 + "/" + (String)localObject2;
                    if (FileOp.aZ((String)localObject1)) {}
                    for (localObject1 = BackwardSupportUtil.b.c((String)localObject1, 1.0F);; localObject1 = null)
                    {
                      if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
                      {
                        w.i("MicroMsg.Sns.SnsAdNativieLandingTestUI", "thumb image is not null");
                        localObject2 = new ByteArrayOutputStream();
                        ((Bitmap)localObject1).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject2);
                        localWXMediaMessage.thumbData = ((ByteArrayOutputStream)localObject2).toByteArray();
                      }
                      localObject1 = new oj();
                      ((oj)localObject1).eTm.eLU = localWXMediaMessage;
                      ((oj)localObject1).eTm.toUser = paramAnonymous2Intent;
                      ((oj)localObject1).eTm.eTn = 49;
                      ((oj)localObject1).eTm.eTo = "";
                      ((oj)localObject1).eTm.eTp = "";
                      a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
                      if (!TextUtils.isEmpty(paramAnonymous3String))
                      {
                        localObject1 = new ol();
                        ((ol)localObject1).eTx.eTy = paramAnonymous2Intent;
                        ((ol)localObject1).eTx.content = paramAnonymous3String;
                        ((ol)localObject1).eTx.type = s.go(paramAnonymous2Intent);
                        ((ol)localObject1).eTx.flags = 0;
                        a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
                      }
                      h.bm(localSnsAdNativeLandingTestUI, localSnsAdNativeLandingTestUI.getString(i.j.cUy));
                      GMTrace.o(8516785930240L, 63455);
                      return;
                    }
                  }
                  GMTrace.o(8516785930240L, 63455);
                }
              });
            }
            GMTrace.o(8613959565312L, 64179);
          }
        });
        GMTrace.o(8504035246080L, 63360);
      }
    });
    paramBundle = (ViewGroup)findViewById(i.f.pcz);
    Object localObject2 = (LayoutInflater)this.vKB.vKW.getSystemService("layout_inflater");
    Object localObject1 = (WindowManager)this.vKB.vKW.getSystemService("window");
    int i = ((WindowManager)localObject1).getDefaultDisplay().getWidth();
    int j = ((WindowManager)localObject1).getDefaultDisplay().getHeight();
    localObject1 = Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages";
    String str1 = "adId" + "_image_" + aa.RP("http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150");
    String str2 = "adId" + "_stream_" + aa.RP("http://wxsnsdy.tc.qq.com/105/20210/snsdyvideodownload?filekey=30280201010421301f0201690402534804105d999cf2831eae6ca6e65b177800230f0204009297fd0400&amp;bizid=1023&amp;hy=SH&amp;fileparam=302c020101042530230204136ffd9302045719f85d02024ef202031e8d7f02030f42400204045a320a0201000400");
    localObject2 = ((LayoutInflater)localObject2).inflate(i.g.pfm, null);
    ((View)localObject2).setMinimumHeight(j);
    Object localObject3 = (ViewGroup)((View)localObject2).findViewById(i.f.pcl);
    this.pXM = new VideoSightView(this.vKB.vKW);
    this.pXM.ci(false);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
    ((ViewGroup)localObject3).addView(this.pXM, 0, localLayoutParams);
    localObject3 = new RelativeLayout.LayoutParams(-1, -2);
    ((RelativeLayout.LayoutParams)localObject3).addRule(12);
    ((RelativeLayout.LayoutParams)localObject3).bottomMargin = BackwardSupportUtil.b.a(this.vKB.vKW, this.vKB.vKW.getResources().getDimension(i.d.oXn));
    this.pXN = new SnsAdNativeLandingPagesVideoPlayerLoadingBar(this.vKB.vKW);
    this.pXN.setVisibility(0);
    this.pXM.hw(true);
    ((ViewGroup)localObject2).addView(this.pXN, (ViewGroup.LayoutParams)localObject3);
    this.pXN.oSQ = new com.tencent.mm.plugin.sight.decode.ui.b()
    {
      public final void Xw()
      {
        GMTrace.i(8659190939648L, 64516);
        GMTrace.o(8659190939648L, 64516);
      }
      
      public final void iM(int paramAnonymousInt)
      {
        GMTrace.i(8659325157376L, 64517);
        w.i("MicroMsg.Sns.SnsAdNativieLandingTestUI", "onSeek time " + paramAnonymousInt);
        SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this, paramAnonymousInt);
        SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).o(paramAnonymousInt);
        GMTrace.o(8659325157376L, 64517);
      }
    };
    this.pXN.d(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8554501111808L, 63736);
        if (SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).isPlaying())
        {
          SnsAdNativeLandingTestUI.b(SnsAdNativeLandingTestUI.this);
          GMTrace.o(8554501111808L, 63736);
          return;
        }
        SnsAdNativeLandingTestUI.c(SnsAdNativeLandingTestUI.this);
        GMTrace.o(8554501111808L, 63736);
      }
    });
    this.pXN.cp(this.pXM.isPlaying());
    this.pXN.setVisibility(0);
    this.pXN.seek(0);
    this.pXM.oTm = new f.a()
    {
      public final void Xq()
      {
        GMTrace.i(8492358303744L, 63273);
        if (SnsAdNativeLandingTestUI.this.pXN.eIC) {
          SnsAdNativeLandingTestUI.c(SnsAdNativeLandingTestUI.this);
        }
        GMTrace.o(8492358303744L, 63273);
      }
      
      public final int bM(final int paramAnonymousInt1, final int paramAnonymousInt2)
      {
        GMTrace.i(8492760956928L, 63276);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8717441433600L, 64950);
            w.i("MicroMsg.Sns.SnsAdNativieLandingTestUI", "play time " + paramAnonymousInt1 + " video time " + paramAnonymousInt2);
            if (paramAnonymousInt2 > 0)
            {
              SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this, paramAnonymousInt2);
              SnsAdNativeLandingTestUI.b(SnsAdNativeLandingTestUI.this, paramAnonymousInt2);
            }
            if (SnsAdNativeLandingTestUI.this.pXN.oSX != paramAnonymousInt2) {
              SnsAdNativeLandingTestUI.this.pXN.tY(paramAnonymousInt2);
            }
            SnsAdNativeLandingTestUI.this.pXN.seek(paramAnonymousInt1);
            GMTrace.o(8717441433600L, 64950);
          }
        });
        GMTrace.o(8492760956928L, 63276);
        return 0;
      }
      
      public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(8492895174656L, 63277);
        SnsAdNativeLandingTestUI.c(SnsAdNativeLandingTestUI.this, paramAnonymousInt1);
        SnsAdNativeLandingTestUI.d(SnsAdNativeLandingTestUI.this, paramAnonymousInt2);
        GMTrace.o(8492895174656L, 63277);
      }
      
      public final void onCompletion()
      {
        GMTrace.i(8492626739200L, 63275);
        GMTrace.o(8492626739200L, 63275);
      }
      
      public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(8492492521472L, 63274);
        SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).stop();
        GMTrace.o(8492492521472L, 63274);
      }
    };
    this.pXM.pJS = false;
    this.pXM.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8535307976704L, 63593);
        if ((!"".equals(SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).oTg.oRS)) && (SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).oTg.oRS != null))
        {
          if (SnsAdNativeLandingTestUI.this.pXN.getVisibility() == 0)
          {
            SnsAdNativeLandingTestUI.this.pXN.setVisibility(4);
            GMTrace.o(8535307976704L, 63593);
            return;
          }
          SnsAdNativeLandingTestUI.this.pXN.setVisibility(0);
        }
        GMTrace.o(8535307976704L, 63593);
      }
    });
    paramBundle.addView((View)localObject2, new LinearLayout.LayoutParams(i, j));
    this.pXM.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8694892855296L, 64782);
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        if ((SnsAdNativeLandingTestUI.this.vKB.vKW instanceof MMActivity))
        {
          ((MMActivity)SnsAdNativeLandingTestUI.this.vKB.vKW).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
          SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).tW(localDisplayMetrics.widthPixels);
        }
        SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).requestLayout();
        SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).postInvalidate();
        GMTrace.o(8694892855296L, 64782);
      }
    });
    new a((String)localObject1, str1, com.tencent.mm.plugin.sns.model.ae.aDa(), new SnsAdNativeLandingTestUI.a.a()
    {
      public final void Ij(String paramAnonymousString)
      {
        GMTrace.i(8614362218496L, 64182);
        GMTrace.o(8614362218496L, 64182);
      }
      
      public final void Ik(String paramAnonymousString)
      {
        GMTrace.i(8614496436224L, 64183);
        SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).G(BitmapFactory.decodeFile(paramAnonymousString));
        GMTrace.o(8614496436224L, 64183);
      }
      
      public final void bR(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(8614228000768L, 64181);
        GMTrace.o(8614228000768L, 64181);
      }
    }).execute(new String[] { "http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150" });
    new a((String)localObject1, str2, com.tencent.mm.plugin.sns.model.ae.aDa(), new SnsAdNativeLandingTestUI.a.a()
    {
      public final void Ij(String paramAnonymousString)
      {
        GMTrace.i(8676639244288L, 64646);
        w.e("MicroMsg.Sns.SnsAdNativieLandingTestUI", paramAnonymousString);
        GMTrace.o(8676639244288L, 64646);
      }
      
      public final void Ik(String paramAnonymousString)
      {
        GMTrace.i(8676773462016L, 64647);
        SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).setVideoPath(paramAnonymousString);
        SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).ci(true);
        if (SnsAdNativeLandingTestUI.this.pXN.eIC)
        {
          SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).o(SnsAdNativeLandingTestUI.d(SnsAdNativeLandingTestUI.this));
          SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).start();
        }
        GMTrace.o(8676773462016L, 64647);
      }
      
      public final void bR(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(8676505026560L, 64645);
        if (SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).isPlaying())
        {
          GMTrace.o(8676505026560L, 64645);
          return;
        }
        SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).ci(false);
        if (!paramAnonymousString.equals(SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).oTg.oRS)) {
          SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).setVideoPath(paramAnonymousString);
        }
        if (SnsAdNativeLandingTestUI.this.pXN.eIC)
        {
          SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).o(SnsAdNativeLandingTestUI.d(SnsAdNativeLandingTestUI.this));
          SnsAdNativeLandingTestUI.a(SnsAdNativeLandingTestUI.this).start();
        }
        GMTrace.o(8676505026560L, 64645);
      }
    }, 409600).execute(new String[] { "http://wxsnsdy.tc.qq.com/105/20210/snsdyvideodownload?filekey=30280201010421301f0201690402534804105d999cf2831eae6ca6e65b177800230f0204009297fd0400&amp;bizid=1023&amp;hy=SH&amp;fileparam=302c020101042530230204136ffd9302045719f85d02024ef202031e8d7f02030f42400204045a320a0201000400" });
    GMTrace.o(8629663039488L, 64296);
  }
  
  private static final class a
    extends AsyncTask<String, Void, Void>
  {
    private static Set<String> pJj;
    private static byte[] pJk;
    final String euR;
    final String filePath;
    final com.tencent.mm.sdk.platformtools.ae handler;
    final String pJl;
    final String pJm;
    final String pJn;
    final int pJp;
    final a pXS;
    
    static
    {
      GMTrace.i(8571680980992L, 63864);
      pJj = new HashSet();
      pJk = new byte[0];
      GMTrace.o(8571680980992L, 63864);
    }
    
    public a(String paramString1, String paramString2, com.tencent.mm.sdk.platformtools.ae paramae, a parama)
    {
      this(paramString1, paramString2, paramae, parama, 0);
      GMTrace.i(8571144110080L, 63860);
      GMTrace.o(8571144110080L, 63860);
    }
    
    public a(String paramString1, String paramString2, final com.tencent.mm.sdk.platformtools.ae paramae, final a parama, int paramInt)
    {
      GMTrace.i(8571278327808L, 63861);
      FileOp.la(paramString1);
      this.pJn = paramString1;
      this.euR = paramString2;
      this.filePath = (paramString1 + "/" + paramString2);
      this.pJm = ("temp_" + paramString2);
      this.pJl = (paramString1 + "/" + this.pJm);
      this.handler = paramae;
      this.pJp = paramInt;
      this.pXS = new a()
      {
        public final void Ij(final String paramAnonymousString)
        {
          GMTrace.i(8716501909504L, 64943);
          paramae.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8593155817472L, 64024);
              SnsAdNativeLandingTestUI.a.1.this.pXT.Ij(paramAnonymousString);
              GMTrace.o(8593155817472L, 64024);
            }
          });
          GMTrace.o(8716501909504L, 64943);
        }
        
        public final void Ik(final String paramAnonymousString)
        {
          GMTrace.i(8716636127232L, 64944);
          paramae.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8591679422464L, 64013);
              SnsAdNativeLandingTestUI.a.1.this.pXT.Ik(paramAnonymousString);
              GMTrace.o(8591679422464L, 64013);
            }
          });
          GMTrace.o(8716636127232L, 64944);
        }
        
        public final void bR(final String paramAnonymousString, final int paramAnonymousInt)
        {
          GMTrace.i(8716367691776L, 64942);
          paramae.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8751130083328L, 65201);
              SnsAdNativeLandingTestUI.a.1.this.pXT.bR(paramAnonymousString, paramAnonymousInt);
              GMTrace.o(8751130083328L, 65201);
            }
          });
          GMTrace.o(8716367691776L, 64942);
        }
      };
      GMTrace.o(8571278327808L, 63861);
    }
    
    /* Error */
    private Void y(String... paramVarArgs)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 6
      //   3: iconst_0
      //   4: istore_3
      //   5: ldc2_w 120
      //   8: ldc 122
      //   10: invokestatic 46	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   13: getstatic 55	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJk	[B
      //   16: astore 5
      //   18: aload 5
      //   20: monitorenter
      //   21: getstatic 53	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJj	Ljava/util/Set;
      //   24: aload_1
      //   25: iconst_0
      //   26: aaload
      //   27: invokeinterface 128 2 0
      //   32: ifeq +16 -> 48
      //   35: aload 5
      //   37: monitorexit
      //   38: ldc2_w 120
      //   41: ldc 122
      //   43: invokestatic 58	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   46: aconst_null
      //   47: areturn
      //   48: getstatic 53	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJj	Ljava/util/Set;
      //   51: aload_1
      //   52: iconst_0
      //   53: aaload
      //   54: invokeinterface 131 2 0
      //   59: pop
      //   60: aload 5
      //   62: monitorexit
      //   63: aload_0
      //   64: getfield 95	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:filePath	Ljava/lang/String;
      //   67: invokestatic 134	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
      //   70: ifeq +61 -> 131
      //   73: aload_0
      //   74: getfield 113	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pXS	Lcom/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a$a;
      //   77: aload_0
      //   78: getfield 95	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:filePath	Ljava/lang/String;
      //   81: invokeinterface 137 2 0
      //   86: getstatic 55	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJk	[B
      //   89: astore 5
      //   91: aload 5
      //   93: monitorenter
      //   94: getstatic 53	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJj	Ljava/util/Set;
      //   97: aload_1
      //   98: iconst_0
      //   99: aaload
      //   100: invokeinterface 140 2 0
      //   105: pop
      //   106: aload 5
      //   108: monitorexit
      //   109: ldc2_w 120
      //   112: ldc 122
      //   114: invokestatic 58	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   117: aconst_null
      //   118: areturn
      //   119: astore_1
      //   120: aload 5
      //   122: monitorexit
      //   123: aload_1
      //   124: athrow
      //   125: astore_1
      //   126: aload 5
      //   128: monitorexit
      //   129: aload_1
      //   130: athrow
      //   131: aload_0
      //   132: getfield 104	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJl	Ljava/lang/String;
      //   135: invokestatic 134	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
      //   138: ifeq +11 -> 149
      //   141: aload_0
      //   142: getfield 104	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJl	Ljava/lang/String;
      //   145: invokestatic 143	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
      //   148: pop
      //   149: new 145	java/net/URL
      //   152: dup
      //   153: aload_1
      //   154: iconst_0
      //   155: aaload
      //   156: invokespecial 146	java/net/URL:<init>	(Ljava/lang/String;)V
      //   159: invokevirtual 150	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   162: checkcast 152	java/net/HttpURLConnection
      //   165: astore 5
      //   167: aload 5
      //   169: invokevirtual 155	java/net/HttpURLConnection:connect	()V
      //   172: aload 5
      //   174: invokevirtual 159	java/net/HttpURLConnection:getResponseCode	()I
      //   177: sipush 200
      //   180: if_icmpeq +94 -> 274
      //   183: aload_0
      //   184: getfield 113	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pXS	Lcom/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a$a;
      //   187: new 82	java/lang/StringBuilder
      //   190: dup
      //   191: ldc -95
      //   193: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   196: aload 5
      //   198: invokevirtual 159	java/net/HttpURLConnection:getResponseCode	()I
      //   201: invokevirtual 164	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   204: ldc -90
      //   206: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   209: aload 5
      //   211: invokevirtual 169	java/net/HttpURLConnection:getResponseMessage	()Ljava/lang/String;
      //   214: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   217: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   220: invokeinterface 172 2 0
      //   225: aload 5
      //   227: ifnull +8 -> 235
      //   230: aload 5
      //   232: invokevirtual 175	java/net/HttpURLConnection:disconnect	()V
      //   235: getstatic 55	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJk	[B
      //   238: astore 5
      //   240: aload 5
      //   242: monitorenter
      //   243: getstatic 53	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJj	Ljava/util/Set;
      //   246: aload_1
      //   247: iconst_0
      //   248: aaload
      //   249: invokeinterface 140 2 0
      //   254: pop
      //   255: aload 5
      //   257: monitorexit
      //   258: ldc2_w 120
      //   261: ldc 122
      //   263: invokestatic 58	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   266: aconst_null
      //   267: areturn
      //   268: astore_1
      //   269: aload 5
      //   271: monitorexit
      //   272: aload_1
      //   273: athrow
      //   274: aload 5
      //   276: invokevirtual 178	java/net/HttpURLConnection:getContentLength	()I
      //   279: pop
      //   280: aload 5
      //   282: invokevirtual 182	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
      //   285: astore 8
      //   287: new 184	java/io/FileOutputStream
      //   290: dup
      //   291: aload_0
      //   292: getfield 104	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJl	Ljava/lang/String;
      //   295: invokespecial 185	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
      //   298: astore 7
      //   300: sipush 4096
      //   303: newarray <illegal type>
      //   305: astore 6
      //   307: iconst_0
      //   308: istore_2
      //   309: aload 8
      //   311: aload 6
      //   313: invokevirtual 191	java/io/InputStream:read	([B)I
      //   316: istore 4
      //   318: iload 4
      //   320: iconst_m1
      //   321: if_icmpeq +67 -> 388
      //   324: aload 7
      //   326: aload 6
      //   328: iconst_0
      //   329: iload 4
      //   331: invokevirtual 197	java/io/OutputStream:write	([BII)V
      //   334: iload_2
      //   335: iload 4
      //   337: iadd
      //   338: istore 4
      //   340: iload 4
      //   342: istore_2
      //   343: aload_0
      //   344: getfield 108	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJp	I
      //   347: ifeq -38 -> 309
      //   350: iload 4
      //   352: istore_2
      //   353: iload 4
      //   355: iload_3
      //   356: isub
      //   357: aload_0
      //   358: getfield 108	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJp	I
      //   361: if_icmplt -52 -> 309
      //   364: aload_0
      //   365: getfield 113	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pXS	Lcom/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a$a;
      //   368: aload_0
      //   369: getfield 104	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJl	Ljava/lang/String;
      //   372: iload 4
      //   374: invokeinterface 201 3 0
      //   379: iload 4
      //   381: istore_3
      //   382: iload 4
      //   384: istore_2
      //   385: goto -76 -> 309
      //   388: aload_0
      //   389: getfield 104	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJl	Ljava/lang/String;
      //   392: aload_0
      //   393: getfield 95	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:filePath	Ljava/lang/String;
      //   396: invokestatic 205	com/tencent/mm/modelsfs/FileOp:al	(Ljava/lang/String;Ljava/lang/String;)Z
      //   399: pop
      //   400: aload_0
      //   401: getfield 113	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pXS	Lcom/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a$a;
      //   404: aload_0
      //   405: getfield 95	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:filePath	Ljava/lang/String;
      //   408: invokeinterface 137 2 0
      //   413: aload 7
      //   415: invokevirtual 208	java/io/OutputStream:close	()V
      //   418: aload 8
      //   420: ifnull +8 -> 428
      //   423: aload 8
      //   425: invokevirtual 209	java/io/InputStream:close	()V
      //   428: aload 5
      //   430: ifnull +8 -> 438
      //   433: aload 5
      //   435: invokevirtual 175	java/net/HttpURLConnection:disconnect	()V
      //   438: getstatic 55	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJk	[B
      //   441: astore 5
      //   443: aload 5
      //   445: monitorenter
      //   446: getstatic 53	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJj	Ljava/util/Set;
      //   449: aload_1
      //   450: iconst_0
      //   451: aaload
      //   452: invokeinterface 140 2 0
      //   457: pop
      //   458: aload 5
      //   460: monitorexit
      //   461: ldc2_w 120
      //   464: ldc 122
      //   466: invokestatic 58	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   469: aconst_null
      //   470: areturn
      //   471: astore_1
      //   472: aload 5
      //   474: monitorexit
      //   475: aload_1
      //   476: athrow
      //   477: astore 6
      //   479: aconst_null
      //   480: astore 5
      //   482: aconst_null
      //   483: astore 7
      //   485: aconst_null
      //   486: astore 8
      //   488: aload_0
      //   489: getfield 113	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pXS	Lcom/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a$a;
      //   492: aload 6
      //   494: invokevirtual 212	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   497: invokeinterface 172 2 0
      //   502: aload 7
      //   504: ifnull +8 -> 512
      //   507: aload 7
      //   509: invokevirtual 208	java/io/OutputStream:close	()V
      //   512: aload 8
      //   514: ifnull +8 -> 522
      //   517: aload 8
      //   519: invokevirtual 209	java/io/InputStream:close	()V
      //   522: aload 5
      //   524: ifnull +8 -> 532
      //   527: aload 5
      //   529: invokevirtual 175	java/net/HttpURLConnection:disconnect	()V
      //   532: getstatic 55	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJk	[B
      //   535: astore 5
      //   537: aload 5
      //   539: monitorenter
      //   540: getstatic 53	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJj	Ljava/util/Set;
      //   543: aload_1
      //   544: iconst_0
      //   545: aaload
      //   546: invokeinterface 140 2 0
      //   551: pop
      //   552: aload 5
      //   554: monitorexit
      //   555: ldc2_w 120
      //   558: ldc 122
      //   560: invokestatic 58	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   563: aconst_null
      //   564: areturn
      //   565: astore_1
      //   566: aload 5
      //   568: monitorexit
      //   569: aload_1
      //   570: athrow
      //   571: astore 5
      //   573: aconst_null
      //   574: astore 7
      //   576: aconst_null
      //   577: astore 8
      //   579: aload 7
      //   581: ifnull +8 -> 589
      //   584: aload 7
      //   586: invokevirtual 208	java/io/OutputStream:close	()V
      //   589: aload 8
      //   591: ifnull +8 -> 599
      //   594: aload 8
      //   596: invokevirtual 209	java/io/InputStream:close	()V
      //   599: aload 6
      //   601: ifnull +8 -> 609
      //   604: aload 6
      //   606: invokevirtual 175	java/net/HttpURLConnection:disconnect	()V
      //   609: getstatic 55	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJk	[B
      //   612: astore 6
      //   614: aload 6
      //   616: monitorenter
      //   617: getstatic 53	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:pJj	Ljava/util/Set;
      //   620: aload_1
      //   621: iconst_0
      //   622: aaload
      //   623: invokeinterface 140 2 0
      //   628: pop
      //   629: aload 6
      //   631: monitorexit
      //   632: aload 5
      //   634: athrow
      //   635: astore_1
      //   636: aload 6
      //   638: monitorexit
      //   639: aload_1
      //   640: athrow
      //   641: astore 7
      //   643: goto -44 -> 599
      //   646: astore 9
      //   648: aconst_null
      //   649: astore 7
      //   651: aconst_null
      //   652: astore 8
      //   654: aload 5
      //   656: astore 6
      //   658: aload 9
      //   660: astore 5
      //   662: goto -83 -> 579
      //   665: astore 9
      //   667: aconst_null
      //   668: astore 7
      //   670: aload 5
      //   672: astore 6
      //   674: aload 9
      //   676: astore 5
      //   678: goto -99 -> 579
      //   681: astore 9
      //   683: aload 5
      //   685: astore 6
      //   687: aload 9
      //   689: astore 5
      //   691: goto -112 -> 579
      //   694: astore 9
      //   696: aload 5
      //   698: astore 6
      //   700: aload 9
      //   702: astore 5
      //   704: goto -125 -> 579
      //   707: astore 6
      //   709: goto -187 -> 522
      //   712: astore 6
      //   714: aconst_null
      //   715: astore 7
      //   717: aconst_null
      //   718: astore 8
      //   720: goto -232 -> 488
      //   723: astore 6
      //   725: aconst_null
      //   726: astore 7
      //   728: goto -240 -> 488
      //   731: astore 6
      //   733: goto -245 -> 488
      //   736: astore 6
      //   738: goto -310 -> 428
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	741	0	this	a
      //   0	741	1	paramVarArgs	String[]
      //   308	77	2	i	int
      //   4	378	3	j	int
      //   316	67	4	k	int
      //   16	551	5	localObject1	Object
      //   571	84	5	localObject2	Object
      //   660	43	5	localObject3	Object
      //   1	326	6	arrayOfByte	byte[]
      //   477	128	6	localException1	Exception
      //   707	1	6	localIOException1	java.io.IOException
      //   712	1	6	localException2	Exception
      //   723	1	6	localException3	Exception
      //   731	1	6	localException4	Exception
      //   736	1	6	localIOException2	java.io.IOException
      //   298	287	7	localFileOutputStream	java.io.FileOutputStream
      //   641	1	7	localIOException3	java.io.IOException
      //   649	78	7	localObject5	Object
      //   285	434	8	localInputStream	java.io.InputStream
      //   646	13	9	localObject6	Object
      //   665	10	9	localObject7	Object
      //   681	7	9	localObject8	Object
      //   694	7	9	localObject9	Object
      // Exception table:
      //   from	to	target	type
      //   21	38	119	finally
      //   48	63	119	finally
      //   120	123	119	finally
      //   94	109	125	finally
      //   126	129	125	finally
      //   243	258	268	finally
      //   269	272	268	finally
      //   446	461	471	finally
      //   472	475	471	finally
      //   63	86	477	java/lang/Exception
      //   131	149	477	java/lang/Exception
      //   149	167	477	java/lang/Exception
      //   540	555	565	finally
      //   566	569	565	finally
      //   63	86	571	finally
      //   131	149	571	finally
      //   149	167	571	finally
      //   617	632	635	finally
      //   636	639	635	finally
      //   584	589	641	java/io/IOException
      //   594	599	641	java/io/IOException
      //   167	225	646	finally
      //   274	287	646	finally
      //   287	300	665	finally
      //   300	307	681	finally
      //   309	318	681	finally
      //   324	334	681	finally
      //   343	350	681	finally
      //   353	379	681	finally
      //   388	413	681	finally
      //   488	502	694	finally
      //   507	512	707	java/io/IOException
      //   517	522	707	java/io/IOException
      //   167	225	712	java/lang/Exception
      //   274	287	712	java/lang/Exception
      //   287	300	723	java/lang/Exception
      //   300	307	731	java/lang/Exception
      //   309	318	731	java/lang/Exception
      //   324	334	731	java/lang/Exception
      //   343	350	731	java/lang/Exception
      //   353	379	731	java/lang/Exception
      //   388	413	731	java/lang/Exception
      //   413	418	736	java/io/IOException
      //   423	428	736	java/io/IOException
    }
    
    static abstract interface a
    {
      public abstract void Ij(String paramString);
      
      public abstract void Ik(String paramString);
      
      public abstract void bR(String paramString, int paramInt);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsAdNativeLandingTestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */