package com.tencent.mm.plugin.sns.ui;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnDragListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.Exif.a;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.g.a.qe;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.report.service.f;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.KeyboardLinearLayout;
import com.tencent.mm.ui.KeyboardLinearLayout.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ab;
import com.tencent.mm.ui.j.a.a;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(17)
public class En_c4f742e5
  extends MMActivity
  implements LocationWidget.a
{
  private String desc;
  private SnsAdClick eRV;
  private SnsUploadConfigView pOS;
  private RangeWidget pRA;
  private SnsUploadSayFooter pRB;
  private KeyboardLinearLayout pRC;
  private boolean pRD;
  private int pRE;
  private boolean pRF;
  private long pRG;
  private z pRH;
  private String pRI;
  private String pRJ;
  private ArrayList<String> pRK;
  private int pRL;
  private int pRM;
  private boolean pRN;
  private boolean pRO;
  private boolean pRP;
  private String pRQ;
  private FrameLayout pRR;
  private long pRS;
  private SnsEditText pRw;
  private LinearLayout pRx;
  private AtContactWidget pRy;
  private LocationWidget pRz;
  
  public En_c4f742e5()
  {
    GMTrace.i(8754082873344L, 65223);
    this.pRD = false;
    this.pRE = 0;
    this.pRF = false;
    this.pRG = 0L;
    this.pRH = null;
    this.pRI = "";
    this.pRJ = "";
    this.pRL = 0;
    this.pRM = 0;
    this.pRN = false;
    this.pRO = false;
    this.pRP = false;
    this.eRV = null;
    this.pRQ = null;
    this.pRR = null;
    this.pRS = 0L;
    GMTrace.o(8754082873344L, 65223);
  }
  
  public final void bnp()
  {
    GMTrace.i(8754753961984L, 65228);
    if (this.pRH.bmT())
    {
      lf(true);
      GMTrace.o(8754753961984L, 65228);
      return;
    }
    lf(false);
    GMTrace.o(8754753961984L, 65228);
  }
  
  public final ArrayList<Exif.a> bnq()
  {
    GMTrace.i(8755559268352L, 65234);
    if ((this.pRH instanceof ah))
    {
      ah localah = (ah)this.pRH;
      Object localObject1 = localah.pVj.pVu;
      ArrayList localArrayList = new ArrayList();
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (String)((Iterator)localObject1).next();
        localObject2 = (Exif.a)localah.pVl.get(localObject2);
        if (localObject2 != null) {
          localArrayList.add(localObject2);
        }
      }
      GMTrace.o(8755559268352L, 65234);
      return localArrayList;
    }
    GMTrace.o(8755559268352L, 65234);
    return null;
  }
  
  public final boolean bnr()
  {
    GMTrace.i(8755693486080L, 65235);
    boolean bool = this.pRD;
    GMTrace.o(8755693486080L, 65235);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8755425050624L, 65233);
    int i = i.g.pgE;
    GMTrace.o(8755425050624L, 65233);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8755290832896L, 65232);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.pRw != null) {
      this.pRw.clearFocus();
    }
    if (paramInt2 != -1)
    {
      GMTrace.o(8755290832896L, 65232);
      return;
    }
    if (this.pRH.a(paramInt1, paramIntent)) {
      bnp();
    }
    switch (paramInt1)
    {
    case 7: 
    case 9: 
    default: 
    case 5: 
      do
      {
        GMTrace.o(8755290832896L, 65232);
        return;
        if (paramIntent == null)
        {
          GMTrace.o(8755290832896L, 65232);
          return;
        }
        this.pRA.a(paramInt1, paramInt2, paramIntent, this.pRy);
        paramInt2 = paramIntent.getIntExtra("Ktag_range_index", 0);
      } while (paramInt2 < 2);
      this.pRI = paramIntent.getStringExtra("Klabel_name_list");
      this.pRJ = paramIntent.getStringExtra("Kother_user_name_list");
      if (bg.nm(this.pRI)) {
        break;
      }
    }
    for (paramIntent = Arrays.asList(this.pRI.split(","));; paramIntent = null)
    {
      if (!bg.nm(this.pRJ)) {}
      for (Object localObject1 = Arrays.asList(this.pRJ.split(","));; localObject1 = null)
      {
        this.pRK = new ArrayList();
        this.pRL = 0;
        HashSet localHashSet;
        label274:
        Object localObject2;
        if ((paramIntent != null) && (paramIntent.size() > 0))
        {
          Iterator localIterator = paramIntent.iterator();
          localHashSet = new HashSet();
          if (localIterator.hasNext())
          {
            localObject2 = (String)localIterator.next();
            localObject2 = com.tencent.mm.plugin.label.a.a.aJP().AY(com.tencent.mm.plugin.label.a.a.aJP().AV((String)localObject2));
            if ((localObject2 == null) || (((List)localObject2).size() == 0)) {
              w.e("MicroMsg.SnsUploadUI", "dz: getContactNamesFromLabelsAndOtherUserName,namelist get bu label is null");
            }
          }
          else
          {
            this.pRK = new ArrayList(localHashSet);
          }
        }
        else
        {
          if (paramIntent == null) {
            break label470;
          }
          paramIntent = paramIntent.iterator();
          paramInt1 = 0;
          label365:
          if (!paramIntent.hasNext()) {
            break label465;
          }
          if (bg.nm((String)paramIntent.next())) {
            break label701;
          }
          paramInt1 += 1;
        }
        label465:
        label470:
        label701:
        for (;;)
        {
          break label365;
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            String str = (String)((Iterator)localObject2).next();
            localHashSet.add(str);
            this.pRL += 1;
            w.d("MicroMsg.SnsUploadUI", "dz:name : %s", new Object[] { str });
          }
          break label274;
          this.pRL = paramInt1;
          this.pRM = 0;
          if ((localObject1 != null) && (((List)localObject1).size() > 0))
          {
            paramIntent = ((List)localObject1).iterator();
            while (paramIntent.hasNext())
            {
              localObject1 = (String)paramIntent.next();
              if (!this.pRK.contains(localObject1))
              {
                this.pRK.add(localObject1);
                this.pRM += 1;
              }
            }
          }
          if (paramInt2 == 2)
          {
            this.pRN = false;
            GMTrace.o(8755290832896L, 65232);
            return;
          }
          this.pRN = true;
          GMTrace.o(8755290832896L, 65232);
          return;
          if (paramIntent == null)
          {
            GMTrace.o(8755290832896L, 65232);
            return;
          }
          this.pRy.U(paramIntent);
          GMTrace.o(8755290832896L, 65232);
          return;
          if (paramIntent == null)
          {
            GMTrace.o(8755290832896L, 65232);
            return;
          }
          boolean bool = paramIntent.getBooleanExtra("bind_facebook_succ", false);
          paramIntent = this.pOS;
          if (bool)
          {
            paramIntent.qje = true;
            paramIntent.ie(true);
          }
          GMTrace.o(8755290832896L, 65232);
          return;
          if (paramIntent == null)
          {
            GMTrace.o(8755290832896L, 65232);
            return;
          }
          this.pRz.U(paramIntent);
          break;
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = true;
    GMTrace.i(8754485526528L, 65226);
    com.tencent.mm.pluginsdk.e.g(this);
    super.onCreate(paramBundle);
    sq("");
    getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    this.pRF = getIntent().getBooleanExtra("KSnsPostManu", false);
    this.pRG = getIntent().getLongExtra("KTouchCameraTime", 0L);
    this.pRE = getIntent().getIntExtra("Ksnsupload_type", 0);
    this.eRV = ((SnsAdClick)getIntent().getParcelableExtra("KsnsAdTag"));
    this.pRD = getIntent().getBooleanExtra("Kis_take_photo", false);
    this.pRO = getIntent().getBooleanExtra("need_result", false);
    this.pRP = getIntent().getBooleanExtra("K_go_to_SnsTimeLineUI", false);
    this.pRQ = getIntent().getStringExtra("Ksnsupload_canvas_info");
    this.pRw = ((SnsEditText)findViewById(i.f.pcS));
    this.pRw.setTextSize(1, ab.dZ(this.vKB.vKW) * this.pRw.getTextSize() / com.tencent.mm.br.a.getDensity(this.vKB.vKW));
    Object localObject2;
    if (!bg.nm(getIntent().getStringExtra("Kdescription")))
    {
      this.pRw.setText(getIntent().getStringExtra("Kdescription"));
      if (this.pRE == 8)
      {
        localObject1 = getIntent().getStringExtra("Kdescription");
        this.pRw.setText((CharSequence)localObject1);
        this.pRw.setEnabled(false);
      }
      this.pRC = ((KeyboardLinearLayout)findViewById(i.f.bZf));
      this.pRB = ((SnsUploadSayFooter)findViewById(i.f.bZp));
      localObject1 = this.pRB;
      localObject2 = this.pRw;
      ((SnsUploadSayFooter)localObject1).qfz = ((MMEditText)localObject2);
      ((MMEditText)localObject2).setOnClickListener(new SnsUploadSayFooter.1((SnsUploadSayFooter)localObject1));
      ((MMEditText)localObject2).setOnEditorActionListener(new SnsUploadSayFooter.2((SnsUploadSayFooter)localObject1));
      this.pRB.setVisibility(8);
      this.pRR = ((FrameLayout)findViewById(i.f.pbL));
      this.pRR.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20058571014144L, 149448);
          DisplayMetrics localDisplayMetrics = new DisplayMetrics();
          En_c4f742e5.this.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
          com.tencent.mm.plugin.sns.model.ae.biS();
          r.dc(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
          GMTrace.o(20058571014144L, 149448);
        }
      });
      this.pRw.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20058839449600L, 149450);
          En_c4f742e5.i(En_c4f742e5.this);
          GMTrace.o(20058839449600L, 149450);
        }
      });
      this.pRw.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          GMTrace.i(20059107885056L, 149452);
          En_c4f742e5.i(En_c4f742e5.this);
          GMTrace.o(20059107885056L, 149452);
          return false;
        }
      });
      localObject1 = (WrapScollview)findViewById(i.f.pbS);
      ((WrapScollview)localObject1).hqF = this.pRw;
      ((WrapScollview)localObject1).qkS = false;
      this.pOS = ((SnsUploadConfigView)findViewById(i.f.paj));
      localObject1 = this.pOS;
      ((SnsUploadConfigView)localObject1).qjj.tYz = -1000.0F;
      ((SnsUploadConfigView)localObject1).qjj.tYy = -1000.0F;
      if (!((SnsUploadConfigView)localObject1).qeP)
      {
        com.tencent.mm.kernel.h.xz();
        i = bg.e((Integer)com.tencent.mm.kernel.h.xy().xh().get(68404, null));
        if ((i & 0x2) == 0) {
          break label1239;
        }
        bool1 = true;
        label540:
        ((SnsUploadConfigView)localObject1).qje = bool1;
        if ((i & 0x8) == 0) {
          break label1244;
        }
        bool1 = true;
        label555:
        ((SnsUploadConfigView)localObject1).qjf = bool1;
        if (!com.tencent.mm.ap.b.Jw()) {
          ((SnsUploadConfigView)localObject1).qjf = false;
        }
        if (!com.tencent.mm.y.q.Ad()) {
          ((SnsUploadConfigView)localObject1).qje = false;
        }
      }
      ((SnsUploadConfigView)localObject1).ie(false);
      ((SnsUploadConfigView)localObject1).bpL();
      ((SnsUploadConfigView)localObject1).bpM();
      if (((SnsUploadConfigView)localObject1).qjf) {
        ((SnsUploadConfigView)localObject1).qjk.a((a.a)localObject1);
      }
      if (this.pRE != 0)
      {
        localObject1 = this.pOS;
        ((SnsUploadConfigView)localObject1).qja.setVisibility(8);
        ((SnsUploadConfigView)localObject1).qjb.setVisibility(8);
        ((SnsUploadConfigView)localObject1).qjc.setVisibility(8);
      }
      if (this.pRE == 9) {
        this.pOS.qjc.setVisibility(0);
      }
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(15965869834240L, 118955);
          if (En_c4f742e5.j(En_c4f742e5.this) == 9)
          {
            En_c4f742e5.this.setResult(0, new Intent());
            En_c4f742e5.this.finish();
          }
          for (;;)
          {
            GMTrace.o(15965869834240L, 118955);
            return true;
            com.tencent.mm.ui.base.h.a(En_c4f742e5.this, i.j.ple, 0, i.j.cRM, i.j.cSk, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(20061926457344L, 149473);
                if (En_c4f742e5.h(En_c4f742e5.this) != null) {
                  En_c4f742e5.h(En_c4f742e5.this).gZ(10);
                }
                En_c4f742e5.this.setResult(0, new Intent());
                En_c4f742e5.this.finish();
                GMTrace.o(20061926457344L, 149473);
              }
            }, null, i.c.aMJ);
          }
        }
      });
      a(0, getString(i.j.cUs), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(20060986933248L, 149466);
          if (En_c4f742e5.this.isFinishing())
          {
            GMTrace.o(20060986933248L, 149466);
            return false;
          }
          if (System.currentTimeMillis() - En_c4f742e5.k(En_c4f742e5.this) < 500L)
          {
            GMTrace.o(20060986933248L, 149466);
            return false;
          }
          En_c4f742e5.a(En_c4f742e5.this, System.currentTimeMillis());
          f.tp(22);
          paramAnonymousMenuItem = c.d(En_c4f742e5.a(En_c4f742e5.this)).Ea(com.tencent.mm.k.b.tW());
          paramAnonymousMenuItem.xkl = true;
          paramAnonymousMenuItem.a(new c.a()
          {
            public final void acJ()
            {
              GMTrace.i(20062194892800L, 149475);
              GMTrace.o(20062194892800L, 149475);
            }
            
            public final void ack()
            {
              GMTrace.i(20062329110528L, 149476);
              com.tencent.mm.ui.base.h.h(En_c4f742e5.this, i.j.plg, i.j.plh);
              GMTrace.o(20062329110528L, 149476);
            }
            
            public final void sT(String paramAnonymous2String)
            {
              GMTrace.i(20062060675072L, 149474);
              int i = En_c4f742e5.l(En_c4f742e5.this).bpO();
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xy().xh().set(68404, Integer.valueOf(i));
              En_c4f742e5.a(En_c4f742e5.this, En_c4f742e5.a(En_c4f742e5.this).getText().toString());
              i = En_c4f742e5.a(En_c4f742e5.this).qax;
              int j = En_c4f742e5.l(En_c4f742e5.this).bpN();
              int k = En_c4f742e5.l(En_c4f742e5.this).bpO();
              En_c4f742e5.m(En_c4f742e5.this);
              if (En_c4f742e5.n(En_c4f742e5.this)) {
                En_c4f742e5.this.setResult(-1, new Intent());
              }
              if ((En_c4f742e5.f(En_c4f742e5.this) instanceof ah))
              {
                paramAnonymous2String = (ah)En_c4f742e5.f(En_c4f742e5.this);
                localObject = En_c4f742e5.o(En_c4f742e5.this);
                amc localamc = new amc();
                localamc.tYz = ((LocationWidget)localObject).pTN;
                localamc.tYy = ((LocationWidget)localObject).nvC;
                localamc.aFG = ((LocationWidget)localObject).aFG;
                localamc.pTO = ((LocationWidget)localObject).pTO;
                paramAnonymous2String.pVp = localamc;
              }
              if ((En_c4f742e5.f(En_c4f742e5.this) instanceof ae)) {
                En_c4f742e5.a(En_c4f742e5.this).setText("");
              }
              paramAnonymous2String = new PInt();
              En_c4f742e5.f(En_c4f742e5.this).a(j, k, En_c4f742e5.l(En_c4f742e5.this).qjk.xms, En_c4f742e5.p(En_c4f742e5.this), En_c4f742e5.q(En_c4f742e5.this).bmH(), En_c4f742e5.o(En_c4f742e5.this).bnF(), i, En_c4f742e5.r(En_c4f742e5.this), En_c4f742e5.s(En_c4f742e5.this), paramAnonymous2String, En_c4f742e5.t(En_c4f742e5.this), En_c4f742e5.u(En_c4f742e5.this), En_c4f742e5.v(En_c4f742e5.this));
              Object localObject = g.ork;
              long l1 = En_c4f742e5.w(En_c4f742e5.this);
              long l2 = bg.Pu();
              if (En_c4f742e5.x(En_c4f742e5.this))
              {
                i = 0;
                ((g)localObject).i(13303, new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(paramAnonymous2String.value) });
                l1 = En_c4f742e5.w(En_c4f742e5.this);
                l2 = bg.Pu();
                if (!En_c4f742e5.x(En_c4f742e5.this)) {
                  break label784;
                }
                i = 0;
                label526:
                w.d("MicroMsg.SnsUploadUI", "reprot timelinePostAction(13303), %d, %d, %d, %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(paramAnonymous2String.value) });
                g.ork.A(10910, "1");
                if (!bg.nm(En_c4f742e5.y(En_c4f742e5.this)))
                {
                  if (!En_c4f742e5.r(En_c4f742e5.this)) {
                    break label789;
                  }
                  g.ork.i(11455, new Object[] { "", En_c4f742e5.y(En_c4f742e5.this), Integer.valueOf(-1), Integer.valueOf(-1) });
                }
              }
              for (;;)
              {
                if (En_c4f742e5.h(En_c4f742e5.this) != null) {
                  En_c4f742e5.h(En_c4f742e5.this).gZ(9);
                }
                if (En_c4f742e5.z(En_c4f742e5.this))
                {
                  paramAnonymous2String = new Intent(En_c4f742e5.this, En_424b8e16.class);
                  paramAnonymous2String.putExtra("sns_resume_state", false);
                  paramAnonymous2String.putExtra("sns_timeline_NeedFirstLoadint", true);
                  paramAnonymous2String.addFlags(67108864);
                  En_c4f742e5.this.startActivity(paramAnonymous2String);
                }
                paramAnonymous2String = new qe();
                com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2String);
                GMTrace.o(20062060675072L, 149474);
                return;
                i = 1;
                break;
                label784:
                i = 1;
                break label526;
                label789:
                g.ork.i(11455, new Object[] { En_c4f742e5.y(En_c4f742e5.this), "", Integer.valueOf(-1), Integer.valueOf(-1) });
              }
            }
          });
          GMTrace.o(20060986933248L, 149466);
          return false;
        }
      }, p.b.vLG);
      findViewById(i.f.pev).setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(20058705231872L, 149449);
          w.d("MicroMsg.SnsUploadUI", "upload_content onTouch");
          if (En_c4f742e5.b(En_c4f742e5.this))
          {
            GMTrace.o(20058705231872L, 149449);
            return true;
          }
          GMTrace.o(20058705231872L, 149449);
          return false;
        }
      });
      this.pRy = ((AtContactWidget)findViewById(i.f.oZW));
      this.pRy.pOS = this.pOS;
      this.pRz = ((LocationWidget)findViewById(i.f.pbp));
      this.pRz.pTP = this;
      switch (this.pRE)
      {
      default: 
        label864:
        this.pRA.pOS = this.pOS;
        aLo();
        w.d("MicroMsg.SnsUploadUI", "share type %d, isManuSnsPost:%b", new Object[] { Integer.valueOf(this.pRE), Boolean.valueOf(this.pRF) });
        switch (this.pRE)
        {
        }
        break;
      }
    }
    for (;;)
    {
      this.pRH.G(paramBundle);
      if (!(this.pRH instanceof a)) {
        break label1766;
      }
      paramBundle = findViewById(i.f.pcR);
      localObject2 = findViewById(i.f.pcY);
      localObject1 = (DynamicGridView)findViewById(i.f.pdM);
      ((DynamicGridView)localObject1).setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(20060718497792L, 149464);
          boolean bool = En_c4f742e5.b(En_c4f742e5.this);
          GMTrace.o(20060718497792L, 149464);
          return bool;
        }
      });
      paramBundle = ((a)this.pRH).a(paramBundle, findViewById(i.f.pan), (DynamicGridView)localObject1, (View)localObject2);
      ((DynamicGridView)localObject1).setVisibility(0);
      localObject1 = (RelativeLayout.LayoutParams)this.pRz.getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject1).addRule(3, i.f.pdM);
      this.pRz.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      label1113:
      if ((this.pRH instanceof aa))
      {
        localObject1 = (LinearLayout.LayoutParams)paramBundle.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject1).width = -1;
        paramBundle.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      }
      bnp();
      this.pRC.vJe = new KeyboardLinearLayout.a()
      {
        public final void oD(int paramAnonymousInt)
        {
          GMTrace.i(20061658021888L, 149471);
          if (paramAnonymousInt == -3)
          {
            w.d("MicroMsg.SnsUploadUI", "KEYBOARD_STATE_SHOW");
            new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(20058973667328L, 149451);
                SnsUploadSayFooter localSnsUploadSayFooter = En_c4f742e5.c(En_c4f742e5.this);
                localSnsUploadSayFooter.setVisibility(0);
                if (localSnsUploadSayFooter.mQM != null) {
                  localSnsUploadSayFooter.mQM.setImageResource(i.e.oYy);
                }
                En_c4f742e5.c(En_c4f742e5.this).postInvalidate();
                En_c4f742e5.d(En_c4f742e5.this).postInvalidate();
                GMTrace.o(20058973667328L, 149451);
              }
            }, 100L);
            GMTrace.o(20061658021888L, 149471);
            return;
          }
          new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(20055215570944L, 149423);
              SnsUploadSayFooter localSnsUploadSayFooter = En_c4f742e5.c(En_c4f742e5.this);
              if (!localSnsUploadSayFooter.bpP()) {
                localSnsUploadSayFooter.setVisibility(8);
              }
              En_c4f742e5.c(En_c4f742e5.this).postInvalidate();
              En_c4f742e5.e(En_c4f742e5.this).postInvalidate();
              GMTrace.o(20055215570944L, 149423);
            }
          }, 200L);
          w.d("MicroMsg.SnsUploadUI", "KEYBOARD_STATE_HIDE");
          GMTrace.o(20061658021888L, 149471);
        }
      };
      if (this.pRE == 0)
      {
        if ((this.pRH instanceof ah)) {
          break label1833;
        }
        w.e("MicroMsg.SnsUploadUI", "!(widget instanceof PicWidget)");
      }
      label1188:
      com.tencent.mm.pluginsdk.e.h(this);
      GMTrace.o(8754485526528L, 65226);
      return;
      if ((this.pRw == null) || (paramBundle == null)) {
        break;
      }
      localObject1 = paramBundle.getString("contentdesc");
      if (localObject1 == null) {
        break;
      }
      this.pRw.setText((CharSequence)localObject1);
      break;
      label1239:
      bool1 = false;
      break label540;
      label1244:
      bool1 = false;
      break label555;
      this.pRA = ((RangeWidget)findViewById(i.f.pbD));
      findViewById(i.f.pbE).setVisibility(8);
      break label864;
      this.pRA = ((RangeWidget)findViewById(i.f.pbD));
      findViewById(i.f.pbE).setVisibility(8);
      break label864;
      this.pRA = ((RangeWidget)findViewById(i.f.pbD));
      findViewById(i.f.pbE).setVisibility(8);
      this.pRy.setVisibility(8);
      break label864;
      this.pRH = new ah(this);
      this.pRw.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(8319620087808L, 61986);
          GMTrace.o(8319620087808L, 61986);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(8319351652352L, 61984);
          GMTrace.o(8319351652352L, 61984);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(8319485870080L, 61985);
          if (En_c4f742e5.a(En_c4f742e5.this).getText().toString().trim().length() > 10)
          {
            paramAnonymousCharSequence = En_c4f742e5.this.findViewById(i.f.pcY);
            if (paramAnonymousCharSequence != null) {
              paramAnonymousCharSequence.setVisibility(8);
            }
          }
          GMTrace.o(8319485870080L, 61985);
        }
      });
      continue;
      this.pRH = new ad(this);
      continue;
      this.pRH = new aa(this);
      this.pRA.pWb = true;
      continue;
      this.pRH = new ac(this);
      this.pRA.pWb = true;
      continue;
      this.pRH = new ai(this, 9);
      this.pRA.pWb = true;
      continue;
      this.pRH = new ai(this, 12);
      this.pRA.pWb = true;
      continue;
      this.pRH = new p(this);
      this.pRA.pWb = true;
      continue;
      this.pRH = new n(this);
      this.pRA.pWb = true;
      continue;
      this.pRH = new q(this);
      this.pRA.pWb = true;
      continue;
      this.pRH = new o(this);
      this.pRA.pWb = true;
      continue;
      this.pRH = new ai(this, 14);
      this.pRA.pWb = true;
      continue;
      this.pRH = new ai(this, 13);
      this.pRA.pWb = true;
    }
    com.tencent.mm.kernel.h.xz();
    Object localObject1 = bg.aq((String)com.tencent.mm.kernel.h.xy().xh().get(68408, ""), "");
    com.tencent.mm.kernel.h.xz();
    int i = bg.a((Integer)com.tencent.mm.kernel.h.xy().xh().get(7489, Integer.valueOf(0)), 0);
    if (!bg.nm((String)localObject1)) {}
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.pRH = new ae(this, bool1);
      this.pRw.qax = i;
      this.pRw.append((CharSequence)localObject1);
      this.pRw.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(20059510538240L, 149455);
          GMTrace.o(20059510538240L, 149455);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(20059242102784L, 149453);
          GMTrace.o(20059242102784L, 149453);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(20059376320512L, 149454);
          if (En_c4f742e5.a(En_c4f742e5.this).getText().toString().trim().length() > 0)
          {
            En_c4f742e5.this.lf(true);
            GMTrace.o(20059376320512L, 149454);
            return;
          }
          En_c4f742e5.this.lf(false);
          GMTrace.o(20059376320512L, 149454);
        }
      });
      break;
      this.pRH = new be(this);
      this.pRA.pWb = true;
      break;
      label1766:
      paramBundle = this.pRH.bmU();
      this.pRx = ((LinearLayout)findViewById(i.f.peD));
      this.pRx.setVisibility(0);
      this.pRx.setClipChildren(false);
      if (paramBundle != null)
      {
        this.pRx.addView(paramBundle);
        break label1113;
      }
      this.pRx.setVisibility(8);
      break label1113;
      label1833:
      if (Build.VERSION.SDK_INT < 11)
      {
        w.d("MicroMsg.SnsUploadUI", "sdk not support dragdrop event");
        break label1188;
      }
      new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20063402852352L, 149484);
          View.OnDragListener local1 = new View.OnDragListener()
          {
            public final boolean onDrag(View paramAnonymous2View, DragEvent paramAnonymous2DragEvent)
            {
              GMTrace.i(20053604958208L, 149411);
              int i = paramAnonymous2DragEvent.getAction();
              boolean bool;
              switch (i)
              {
              default: 
                w.e("MicroMsg.SnsUploadUI", "Unknown action type received by OnDragListener.");
                bool = false;
              }
              for (;;)
              {
                GMTrace.o(20053604958208L, 149411);
                return bool;
                w.i("MicroMsg.SnsUploadUI", "ACTION: [%s]", new Object[] { Integer.valueOf(i) });
                bool = true;
                continue;
                w.i("MicroMsg.SnsUploadUI", "ACTION_DROP");
                paramAnonymous2View = paramAnonymous2DragEvent.getClipData();
                if (paramAnonymous2View != null)
                {
                  int j = paramAnonymous2View.getItemCount();
                  paramAnonymous2DragEvent = new ArrayList();
                  i = 0;
                  if (i < j)
                  {
                    Object localObject = paramAnonymous2View.getItemAt(i);
                    if (localObject == null) {
                      w.e("MicroMsg.SnsUploadUI", "item == null");
                    }
                    for (;;)
                    {
                      i += 1;
                      break;
                      if (((ClipData.Item)localObject).getIntent() != null)
                      {
                        En_c4f742e5.this.startActivity(((ClipData.Item)localObject).getIntent());
                      }
                      else if (((ClipData.Item)localObject).getUri() != null)
                      {
                        localObject = new l(En_c4f742e5.this.vKB.vKW, ((ClipData.Item)localObject).getUri());
                        if ((((l)localObject).fileType != 0) && (((l)localObject).filePath != null)) {}
                        switch (((l)localObject).fileType)
                        {
                        default: 
                          break;
                        case 3: 
                          paramAnonymous2DragEvent.add(((l)localObject).filePath);
                          continue;
                          w.e("MicroMsg.SnsUploadUI", "get file path failed");
                        }
                      }
                    }
                  }
                  if (paramAnonymous2DragEvent.size() < 0)
                  {
                    w.e("MicroMsg.SnsUploadUI", "no image file available");
                    GMTrace.o(20053604958208L, 149411);
                    return true;
                  }
                  ((ah)En_c4f742e5.f(En_c4f742e5.this)).c(paramAnonymous2DragEvent, 0, false);
                  bool = true;
                }
                else
                {
                  bool = true;
                }
              }
            }
          };
          if (En_c4f742e5.g(En_c4f742e5.this) != null) {
            En_c4f742e5.g(En_c4f742e5.this).setOnDragListener(local1);
          }
          GMTrace.o(20063402852352L, 149484);
        }
      }.run();
      break label1188;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8755156615168L, 65231);
    super.onDestroy();
    if (this.pRH != null) {
      this.pRH.bmV();
    }
    if (this.pRz != null) {
      this.pRz.stop();
    }
    if (this.pRB != null)
    {
      SnsUploadSayFooter localSnsUploadSayFooter = this.pRB;
      if (localSnsUploadSayFooter.mQP != null)
      {
        localSnsUploadSayFooter.mQP.oI();
        localSnsUploadSayFooter.mQP.destroy();
      }
    }
    GMTrace.o(8755156615168L, 65231);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(8754619744256L, 65227);
    if (paramKeyEvent.getKeyCode() == 4)
    {
      paramKeyEvent = this.pRB;
      if ((paramKeyEvent.bpP()) || (paramKeyEvent.getVisibility() == 0)) {}
      for (paramInt = 1; paramInt != 0; paramInt = 0)
      {
        this.pRB.bpQ();
        GMTrace.o(8754619744256L, 65227);
        return true;
      }
      if (this.pRE == 9)
      {
        setResult(0, new Intent());
        finish();
        GMTrace.o(8754619744256L, 65227);
        return true;
      }
      com.tencent.mm.ui.base.h.a(this, i.j.ple, 0, i.j.cRM, i.j.cSk, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20060315844608L, 149461);
          if (En_c4f742e5.h(En_c4f742e5.this) != null) {
            En_c4f742e5.h(En_c4f742e5.this).gZ(10);
          }
          En_c4f742e5.this.setResult(0, new Intent());
          En_c4f742e5.this.finish();
          GMTrace.o(20060315844608L, 149461);
        }
      }, null, i.c.aMJ);
      GMTrace.o(8754619744256L, 65227);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(8754619744256L, 65227);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(8754888179712L, 65229);
    if (this.pRE == 9)
    {
      String str = this.pRw.getText().toString().trim();
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().set(68408, str);
      if (bg.nm(str)) {
        break label100;
      }
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().set(7489, Integer.valueOf(this.pRw.qax));
    }
    for (;;)
    {
      super.aLo();
      super.onPause();
      GMTrace.o(8754888179712L, 65229);
      return;
      label100:
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().set(7489, Integer.valueOf(0));
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(8755827703808L, 65236);
    w.i("MicroMsg.SnsUploadUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(8755827703808L, 65236);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        this.pRz.bnB();
        GMTrace.o(8755827703808L, 65236);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(i.j.dNq), getString(i.j.dNu), getString(i.j.dFX), getString(i.j.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(15994458210304L, 119168);
          En_c4f742e5.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(15994458210304L, 119168);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20060584280064L, 149463);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(20060584280064L, 149463);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(8755022397440L, 65230);
    super.onResume();
    this.pRB.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20060852715520L, 149465);
        j.g(En_c4f742e5.this);
        GMTrace.o(20060852715520L, 149465);
      }
    });
    if ((this.pRH != null) && ((this.pRH instanceof ad)))
    {
      ad localad = (ad)this.pRH;
      if ((localad.pUb != null) && (!bg.nm(localad.videoPath))) {
        localad.pUb.ar(localad.videoPath, false);
      }
    }
    GMTrace.o(8755022397440L, 65230);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    GMTrace.i(8754217091072L, 65224);
    if (this.pRw != null) {
      paramBundle.putString("contentdesc", this.pRw.getText().toString());
    }
    paramBundle.getString("contentdesc");
    this.pRH.H(paramBundle);
    super.onSaveInstanceState(paramBundle);
    GMTrace.o(8754217091072L, 65224);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\En_c4f742e5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */