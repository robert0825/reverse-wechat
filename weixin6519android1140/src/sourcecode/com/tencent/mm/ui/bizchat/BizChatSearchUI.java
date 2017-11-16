package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.af.a.j;
import com.tencent.mm.af.a.l;
import com.tencent.mm.af.x;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.fts.d.d.b;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.pluginsdk.ui.tools.p.a;
import com.tencent.mm.protocal.c.awq;
import com.tencent.mm.protocal.c.hc;
import com.tencent.mm.protocal.c.hd;
import com.tencent.mm.protocal.c.he;
import com.tencent.mm.protocal.c.hf;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class BizChatSearchUI
  extends MMActivity
  implements p.a, BizChatSearchListView.a
{
  String juZ;
  com.tencent.mm.pluginsdk.ui.tools.p jus;
  private AbsListView.OnScrollListener lUB;
  private int scene;
  private String wpn;
  private c wpo;
  BizChatSearchListView wpp;
  TextView wpq;
  private a wpr;
  
  public BizChatSearchUI()
  {
    GMTrace.i(3002182139904L, 22368);
    this.lUB = new AbsListView.OnScrollListener()
    {
      boolean jug;
      
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2998826696704L, 22343);
        if (paramAnonymousInt1 + paramAnonymousInt2 == paramAnonymousInt3)
        {
          this.jug = true;
          GMTrace.o(2998826696704L, 22343);
          return;
        }
        this.jug = false;
        GMTrace.o(2998826696704L, 22343);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(2998692478976L, 22342);
        if ((paramAnonymousInt == 0) && (this.jug) && (BizChatSearchUI.a(BizChatSearchUI.this).wpG))
        {
          paramAnonymousAbsListView = BizChatSearchUI.a(BizChatSearchUI.this);
          if ((paramAnonymousAbsListView.cbv()) && (!paramAnonymousAbsListView.wpI))
          {
            paramAnonymousAbsListView.wpI = true;
            l locall = new l(paramAnonymousAbsListView.juZ, paramAnonymousAbsListView.jQT, paramAnonymousAbsListView.wpM);
            at.wS().a(locall, 0);
            paramAnonymousAbsListView.cbx();
          }
        }
        GMTrace.o(2998692478976L, 22342);
      }
    };
    GMTrace.o(3002182139904L, 22368);
  }
  
  public final void Cy(int paramInt)
  {
    GMTrace.i(3004463841280L, 22385);
    c localc;
    if (this.wpo != null) {
      localc = this.wpo;
    }
    switch (paramInt)
    {
    default: 
      localc.k(false, false);
      GMTrace.o(3004463841280L, 22385);
      return;
    case 1: 
      localc.k(true, false);
      GMTrace.o(3004463841280L, 22385);
      return;
    }
    localc.k(false, true);
    GMTrace.o(3004463841280L, 22385);
  }
  
  protected final void MP()
  {
    GMTrace.i(3002584793088L, 22371);
    if (bg.nm(this.juZ))
    {
      this.juZ = getIntent().getStringExtra("enterprise_biz_name");
      this.scene = getIntent().getIntExtra("biz_chat_search_scene", 1);
      this.wpn = getIntent().getStringExtra("biz_chat_search_text");
      if (bg.nm(this.juZ)) {
        finish();
      }
    }
    this.wpp = ((BizChatSearchListView)findViewById(R.h.bht));
    this.wpq = ((TextView)findViewById(R.h.bRh));
    this.wpr = new a(this.vKB.vKW, this.juZ, this.scene);
    if (a.a(this.wpr))
    {
      this.wpo = new c();
      BizChatSearchListView localBizChatSearchListView = this.wpp;
      c localc = this.wpo;
      View localView = View.inflate(this.vKB.vKW, R.i.cAM, null);
      localc.jui = localView.findViewById(R.h.bKG);
      localc.juj = localView.findViewById(R.h.bKB);
      localc.juk = localView.findViewById(R.h.bKI);
      localc.jui.setVisibility(8);
      localc.juj.setVisibility(8);
      localc.juk.setVisibility(8);
      localBizChatSearchListView.addFooterView(localView);
      Cy(0);
    }
    this.wpp.setAdapter(this.wpr);
    this.wpp.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(2971312062464L, 22138);
        paramAnonymousView = BizChatSearchUI.a(BizChatSearchUI.this).Cz(paramAnonymousInt);
        paramAnonymousAdapterView = BizChatSearchUI.this;
        if ((paramAnonymousView.jHw == BizChatSearchUI.g.wpQ) || (paramAnonymousView.jHw == BizChatSearchUI.g.wpR)) {
          if ((paramAnonymousView.data instanceof com.tencent.mm.af.a.c))
          {
            paramAnonymousView = (com.tencent.mm.af.a.c)paramAnonymousView.data;
            if (paramAnonymousView == null) {
              break label637;
            }
            paramAnonymousLong = paramAnonymousView.field_bizChatLocalId;
          }
        }
        for (;;)
        {
          if ((bg.nm(paramAnonymousAdapterView.juZ)) || (paramAnonymousLong < 0L))
          {
            GMTrace.o(2971312062464L, 22138);
            return;
            if ((paramAnonymousView.data instanceof hc))
            {
              Object localObject = ((hc)paramAnonymousView.data).tVX;
              String str = paramAnonymousAdapterView.juZ;
              boolean bool = true;
              paramAnonymousView = new j();
              paramAnonymousView.field_userId = ((hf)localObject).tVV;
              paramAnonymousView.field_userName = ((hf)localObject).jBs;
              paramAnonymousView.field_brandUserName = str;
              paramAnonymousView.field_headImageUrl = ((hf)localObject).tVP;
              paramAnonymousView.field_profileUrl = ((hf)localObject).tWd;
              paramAnonymousView.field_UserVersion = ((hf)localObject).ver;
              paramAnonymousView.field_addMemberUrl = ((hf)localObject).tVT;
              if (!x.FK().b(paramAnonymousView)) {
                bool = x.FK().a(paramAnonymousView);
              }
              if (!bool)
              {
                paramAnonymousLong = -1L;
                continue;
              }
              localObject = new com.tencent.mm.af.a.c();
              ((com.tencent.mm.af.a.c)localObject).field_bizChatServId = paramAnonymousView.field_userId;
              ((com.tencent.mm.af.a.c)localObject).field_brandUserName = paramAnonymousView.field_brandUserName;
              ((com.tencent.mm.af.a.c)localObject).field_chatName = paramAnonymousView.field_userName;
              ((com.tencent.mm.af.a.c)localObject).field_chatType = 1;
              paramAnonymousView = com.tencent.mm.af.a.e.e((com.tencent.mm.af.a.c)localObject);
              if (paramAnonymousView == null)
              {
                paramAnonymousLong = -1L;
                continue;
              }
              localObject = x.FJ().ab(paramAnonymousView.field_bizChatLocalId);
              ((com.tencent.mm.af.a.a)localObject).field_bizChatId = paramAnonymousView.field_bizChatLocalId;
              ((com.tencent.mm.af.a.a)localObject).field_unReadCount = 0;
              if (bg.nm(((com.tencent.mm.af.a.a)localObject).field_brandUserName))
              {
                ((com.tencent.mm.af.a.a)localObject).field_brandUserName = paramAnonymousView.field_brandUserName;
                ((com.tencent.mm.af.a.a)localObject).field_lastMsgTime = System.currentTimeMillis();
                ((com.tencent.mm.af.a.a)localObject).field_flag = ((com.tencent.mm.af.a.a)localObject).field_lastMsgTime;
              }
              if (!x.FJ().b((com.tencent.mm.af.a.a)localObject)) {
                x.FJ().a((com.tencent.mm.af.a.a)localObject);
              }
              paramAnonymousLong = paramAnonymousView.field_bizChatLocalId;
            }
          }
          else
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("Chat_User", paramAnonymousAdapterView.juZ);
            paramAnonymousView.putExtra("key_biz_chat_id", paramAnonymousLong);
            paramAnonymousView.putExtra("finish_direct", true);
            paramAnonymousView.putExtra("key_need_send_video", false);
            paramAnonymousView.putExtra("key_is_biz_chat", true);
            d.a(paramAnonymousAdapterView.vKB.vKW, ".ui.chatting.En_5b8fbb1e", paramAnonymousView);
            GMTrace.o(2971312062464L, 22138);
            return;
            if (paramAnonymousView.jHw == BizChatSearchUI.g.wpS)
            {
              if (((Integer)paramAnonymousView.data).intValue() == BizChatSearchUI.g.wpW)
              {
                paramAnonymousView = new Intent(paramAnonymousAdapterView.vKB.vKW, BizChatSearchUI.class);
                paramAnonymousView.putExtra("enterprise_biz_name", paramAnonymousAdapterView.juZ);
                paramAnonymousView.putExtra("biz_chat_search_scene", 2);
                paramAnonymousView.putExtra("biz_chat_search_text", paramAnonymousAdapterView.jus.bFU());
                paramAnonymousAdapterView.startActivity(paramAnonymousView);
                GMTrace.o(2971312062464L, 22138);
                return;
              }
              if (((Integer)paramAnonymousView.data).intValue() == BizChatSearchUI.g.wpX)
              {
                paramAnonymousView = new Intent(paramAnonymousAdapterView.vKB.vKW, BizChatSearchUI.class);
                paramAnonymousView.putExtra("enterprise_biz_name", paramAnonymousAdapterView.juZ);
                paramAnonymousView.putExtra("biz_chat_search_scene", 3);
                paramAnonymousView.putExtra("biz_chat_search_text", paramAnonymousAdapterView.jus.bFU());
                paramAnonymousAdapterView.startActivity(paramAnonymousView);
              }
            }
            GMTrace.o(2971312062464L, 22138);
            return;
          }
          label637:
          paramAnonymousLong = -1L;
        }
      }
    });
    this.wpp.wpm = this;
    if (a.a(this.wpr)) {
      this.wpp.setOnScrollListener(this.lUB);
    }
    this.jus = new com.tencent.mm.pluginsdk.ui.tools.p();
    this.jus.mD(a.b(this.wpr));
    this.jus.a(this);
    this.jus.tHZ = false;
    GMTrace.o(3002584793088L, 22371);
  }
  
  public final void QA()
  {
    GMTrace.i(3002450575360L, 22370);
    GMTrace.o(3002450575360L, 22370);
  }
  
  public final void QB()
  {
    GMTrace.i(16851975274496L, 125557);
    GMTrace.o(16851975274496L, 125557);
  }
  
  public final void Qy()
  {
    GMTrace.i(3002853228544L, 22373);
    finish();
    GMTrace.o(3002853228544L, 22373);
  }
  
  public final void Qz()
  {
    GMTrace.i(3002719010816L, 22372);
    GMTrace.o(3002719010816L, 22372);
  }
  
  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
    GMTrace.i(3004061188096L, 22382);
    GMTrace.o(3004061188096L, 22382);
  }
  
  public final void aim()
  {
    GMTrace.i(3003255881728L, 22376);
    aLo();
    GMTrace.o(3003255881728L, 22376);
  }
  
  public final void ain()
  {
    GMTrace.i(3003390099456L, 22377);
    GMTrace.o(3003390099456L, 22377);
  }
  
  public final boolean aio()
  {
    GMTrace.i(3004329623552L, 22384);
    aLo();
    GMTrace.o(3004329623552L, 22384);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(3004195405824L, 22383);
    int i = R.i.cvr;
    GMTrace.o(3004195405824L, 22383);
    return i;
  }
  
  public final boolean nC(String paramString)
  {
    GMTrace.i(3003121664000L, 22375);
    aLo();
    GMTrace.o(3003121664000L, 22375);
    return true;
  }
  
  public final void nD(String paramString)
  {
    a locala = null;
    GMTrace.i(3002987446272L, 22374);
    if ((bg.nm(paramString)) && (this.wpn != null))
    {
      paramString = this.wpn;
      this.wpn = null;
      if (!paramString.equals("")) {
        this.jus.WP(paramString);
      }
      com.tencent.mm.pluginsdk.ui.tools.p localp = this.jus;
      if (a.b(this.wpr)) {
        paramString = this.vKB.vKW.getResources().getString(R.l.daT);
      }
      for (;;)
      {
        localp.setHint(paramString);
        this.jus.clearFocus();
        GMTrace.o(3002987446272L, 22374);
        return;
        if (a.a(this.wpr))
        {
          paramString = this.vKB.vKW.getResources().getString(R.l.daX);
        }
        else
        {
          paramString = locala;
          if (a.d(this.wpr)) {
            paramString = this.vKB.vKW.getResources().getString(R.l.daQ);
          }
        }
      }
    }
    locala = this.wpr;
    locala.jQT = paramString;
    if (bg.nm(paramString))
    {
      locala.Ty();
      locala.wpH = false;
      locala.wpL = false;
      locala.lU(true);
      GMTrace.o(3002987446272L, 22374);
      return;
    }
    if (locala.cbv())
    {
      locala.wpH = true;
      locala.wpL = false;
      locala.cbx();
      locala.bd(paramString, false);
      locala.VQ(paramString);
      GMTrace.o(3002987446272L, 22374);
      return;
    }
    locala.bd(paramString, true);
    if ((locala.wpv) && (locala.wpH)) {
      locala.VQ(paramString);
    }
    GMTrace.o(3002987446272L, 22374);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3002316357632L, 22369);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(3002316357632L, 22369);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(3003792752640L, 22380);
    this.jus.a(this, paramMenu);
    GMTrace.o(3003792752640L, 22380);
    return true;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(3003658534912L, 22379);
    super.onDestroy();
    GMTrace.o(3003658534912L, 22379);
  }
  
  protected void onPause()
  {
    GMTrace.i(3003524317184L, 22378);
    super.onPause();
    this.jus.cancel();
    this.jus.clearFocus();
    GMTrace.o(3003524317184L, 22378);
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(3003926970368L, 22381);
    this.jus.a(this, paramMenu);
    GMTrace.o(3003926970368L, 22381);
    return true;
  }
  
  private static final class a
    extends BaseAdapter
    implements com.tencent.mm.ad.e
  {
    public static int wpt;
    private int Ob;
    private Context context;
    private com.tencent.mm.ao.a.a.c gKp;
    String jQT;
    String juZ;
    private int scene;
    private BizChatSearchUI.g wpA;
    private ArrayList<BizChatSearchUI.g> wpB;
    private BizChatSearchUI.g wpC;
    private BizChatSearchUI.g wpD;
    private ArrayList<BizChatSearchUI.g> wpE;
    private BizChatSearchUI.g wpF;
    public boolean wpG;
    public boolean wpH;
    public boolean wpI;
    private boolean wpJ;
    private int wpK;
    public boolean wpL;
    int wpM;
    private int wpu;
    boolean wpv;
    boolean wpw;
    private ArrayList<com.tencent.mm.af.a.c> wpx;
    private ArrayList<Object> wpy;
    private ArrayList<com.tencent.mm.af.a.c> wpz;
    
    static
    {
      GMTrace.i(2966748659712L, 22104);
      wpt = 3;
      GMTrace.o(2966748659712L, 22104);
    }
    
    public a(Context paramContext, String paramString, int paramInt)
    {
      GMTrace.i(2963393216512L, 22079);
      this.wpx = new ArrayList();
      this.wpy = new ArrayList();
      this.wpz = new ArrayList();
      this.wpB = new ArrayList();
      this.wpE = new ArrayList();
      this.wpG = true;
      this.wpH = false;
      this.wpI = false;
      this.wpJ = true;
      this.wpK = 0;
      this.Ob = 0;
      this.wpL = false;
      this.wpM = 0;
      this.context = paramContext;
      this.juZ = paramString;
      this.scene = paramInt;
      boolean bool1;
      if ((this.scene == 1) || (this.scene == 2))
      {
        bool1 = true;
        this.wpv = bool1;
        if (this.scene != 1)
        {
          bool1 = bool2;
          if (this.scene != 3) {}
        }
        else
        {
          bool1 = true;
        }
        this.wpw = bool1;
        if (this.scene != 1) {
          break label274;
        }
      }
      label274:
      for (paramInt = wpt;; paramInt = Integer.MAX_VALUE)
      {
        this.wpu = paramInt;
        paramContext = new c.a();
        paramContext.gKF = com.tencent.mm.af.a.e.bk(this.juZ);
        paramContext.gKC = true;
        paramContext.gKY = true;
        paramContext.gKR = R.k.aVS;
        this.gKp = paramContext.Jn();
        if (this.wpv) {
          at.wS().a(1364, this);
        }
        GMTrace.o(2963393216512L, 22079);
        return;
        bool1 = false;
        break;
      }
    }
    
    private static SpannableString a(Context paramContext, Spannable paramSpannable, int paramInt)
    {
      int i = 0;
      GMTrace.i(2965003829248L, 22091);
      paramContext = h.c(paramContext, paramSpannable, paramInt);
      ForegroundColorSpan[] arrayOfForegroundColorSpan = (ForegroundColorSpan[])paramSpannable.getSpans(0, paramSpannable.length(), ForegroundColorSpan.class);
      if (arrayOfForegroundColorSpan != null)
      {
        int j = arrayOfForegroundColorSpan.length;
        paramInt = i;
        while (paramInt < j)
        {
          ForegroundColorSpan localForegroundColorSpan = arrayOfForegroundColorSpan[paramInt];
          paramContext.setSpan(localForegroundColorSpan, paramSpannable.getSpanStart(localForegroundColorSpan), paramSpannable.getSpanEnd(localForegroundColorSpan), paramSpannable.getSpanFlags(localForegroundColorSpan));
          paramInt += 1;
        }
      }
      GMTrace.o(2965003829248L, 22091);
      return paramContext;
    }
    
    private void cbt()
    {
      GMTrace.i(2964466958336L, 22087);
      if (cbv())
      {
        this.wpH = false;
        this.wpL = true;
        cbx();
      }
      GMTrace.o(2964466958336L, 22087);
    }
    
    private boolean cbu()
    {
      GMTrace.i(2964601176064L, 22088);
      if (this.scene == 1)
      {
        GMTrace.o(2964601176064L, 22088);
        return true;
      }
      GMTrace.o(2964601176064L, 22088);
      return false;
    }
    
    private boolean cbw()
    {
      GMTrace.i(2964869611520L, 22090);
      if (this.scene == 3)
      {
        GMTrace.o(2964869611520L, 22090);
        return true;
      }
      GMTrace.o(2964869611520L, 22090);
      return false;
    }
    
    private static void p(View paramView, boolean paramBoolean)
    {
      GMTrace.i(2965138046976L, 22092);
      if (paramBoolean)
      {
        paramView.setBackgroundResource(R.g.aVO);
        GMTrace.o(2965138046976L, 22092);
        return;
      }
      paramView.setBackgroundResource(R.g.aVP);
      GMTrace.o(2965138046976L, 22092);
    }
    
    public final BizChatSearchUI.g Cz(int paramInt)
    {
      GMTrace.i(2963930087424L, 22083);
      if (paramInt < this.wpK)
      {
        if (paramInt == 0)
        {
          if (this.wpA == null) {
            this.wpA = new BizChatSearchUI.g(BizChatSearchUI.g.wpU, Integer.valueOf(BizChatSearchUI.g.wpW));
          }
          localg = this.wpA;
          GMTrace.o(2963930087424L, 22083);
          return localg;
        }
        if ((paramInt == this.wpK - 1) && (this.wpH) && (cbu()))
        {
          if (this.wpC == null) {
            this.wpC = new BizChatSearchUI.g();
          }
          this.wpC.jHw = BizChatSearchUI.g.wpT;
          this.wpC.data = Integer.valueOf(BizChatSearchUI.g.wpW);
          localg = this.wpC;
          GMTrace.o(2963930087424L, 22083);
          return localg;
        }
        if ((paramInt == this.wpK - 1) && (this.wpG) && (cbu()))
        {
          if (this.wpC == null) {
            this.wpC = new BizChatSearchUI.g();
          }
          this.wpC.jHw = BizChatSearchUI.g.wpS;
          this.wpC.data = Integer.valueOf(BizChatSearchUI.g.wpW);
          localg = this.wpC;
          GMTrace.o(2963930087424L, 22083);
          return localg;
        }
        paramInt -= 1;
        if ((paramInt >= 0) && (paramInt < this.wpB.size()))
        {
          localg = (BizChatSearchUI.g)this.wpB.get(paramInt);
          GMTrace.o(2963930087424L, 22083);
          return localg;
        }
      }
      else
      {
        if (paramInt == this.wpK)
        {
          if (this.wpD == null) {
            this.wpD = new BizChatSearchUI.g(BizChatSearchUI.g.wpU, Integer.valueOf(BizChatSearchUI.g.wpX));
          }
          localg = this.wpD;
          GMTrace.o(2963930087424L, 22083);
          return localg;
        }
        if ((paramInt == this.Ob - 1) && (this.wpJ) && (cbu()))
        {
          if (this.wpF == null) {
            this.wpF = new BizChatSearchUI.g(BizChatSearchUI.g.wpS, Integer.valueOf(BizChatSearchUI.g.wpX));
          }
          localg = this.wpF;
          GMTrace.o(2963930087424L, 22083);
          return localg;
        }
        paramInt = paramInt - this.wpK - 1;
        if ((paramInt >= 0) && (paramInt < this.wpE.size()))
        {
          localg = (BizChatSearchUI.g)this.wpE.get(paramInt);
          GMTrace.o(2963930087424L, 22083);
          return localg;
        }
      }
      BizChatSearchUI.g localg = new BizChatSearchUI.g();
      GMTrace.o(2963930087424L, 22083);
      return localg;
    }
    
    final void Ty()
    {
      GMTrace.i(2965540700160L, 22095);
      this.wpM = 0;
      this.wpy.clear();
      this.wpx.clear();
      this.wpz.clear();
      GMTrace.o(2965540700160L, 22095);
    }
    
    final void VQ(final String paramString)
    {
      GMTrace.i(2965406482432L, 22094);
      if (!this.wpv)
      {
        GMTrace.o(2965406482432L, 22094);
        return;
      }
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2982720569344L, 22223);
          if (!paramString.equals(BizChatSearchUI.a.c(BizChatSearchUI.a.this)))
          {
            GMTrace.o(2982720569344L, 22223);
            return;
          }
          l locall = new l(BizChatSearchUI.a.e(BizChatSearchUI.a.this), paramString, 0);
          at.wS().a(locall, 0);
          GMTrace.o(2982720569344L, 22223);
        }
      }, 200L);
      GMTrace.o(2965406482432L, 22094);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
    {
      GMTrace.i(2964332740608L, 22086);
      Object localObject1;
      Object localObject2;
      if ((this.wpv) && (paramk.getType() == 1364) && ((paramk instanceof l)))
      {
        this.wpI = false;
        localObject1 = (l)paramk;
        if ((((l)localObject1).fUa != null) && (((l)localObject1).fUa.gtC.gtK != null)) {}
        for (paramString = (hd)((l)localObject1).fUa.gtC.gtK;; paramString = null)
        {
          paramk = paramString.eBj;
          localObject2 = paramString.tVU;
          if ((paramk.equals(this.jQT)) && (((String)localObject2).equals(this.juZ)) && (this.wpM == paramString.offset)) {
            break;
          }
          GMTrace.o(2964332740608L, 22086);
          return;
        }
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          cbt();
          GMTrace.o(2964332740608L, 22086);
          return;
        }
        if ((((l)localObject1).fUa != null) && (((l)localObject1).fUa.gtD.gtK != null)) {}
        for (paramString = (he)((l)localObject1).fUa.gtD.gtK; (paramString == null) || (paramString.tWa == null) || (paramString.tWa.ret != 0); paramString = null)
        {
          cbt();
          GMTrace.o(2964332740608L, 22086);
          return;
        }
        localObject1 = paramString.tWb;
        boolean bool = paramString.tWc;
        if (paramk.equals(this.jQT))
        {
          this.wpH = false;
          this.wpM += ((List)localObject1).size();
          if (cbu())
          {
            if (this.wpy.size() < this.wpx.size())
            {
              bd(paramk, true);
              GMTrace.o(2964332740608L, 22086);
              return;
            }
            if (this.wpy.size() > this.wpx.size()) {}
          }
          else
          {
            if (cbv()) {
              this.wpG = bool;
            }
            if (cbw()) {
              break label485;
            }
            paramString = ((List)localObject1).iterator();
          }
        }
      }
      label485:
      label498:
      for (;;)
      {
        if (paramString.hasNext())
        {
          paramk = (hc)paramString.next();
          localObject1 = paramk.tVX;
          if (!bg.nm(((hf)localObject1).tVV))
          {
            localObject2 = this.wpx.iterator();
            com.tencent.mm.af.a.c localc;
            do
            {
              if (!((Iterator)localObject2).hasNext()) {
                break;
              }
              localc = (com.tencent.mm.af.a.c)((Iterator)localObject2).next();
            } while (!((hf)localObject1).tVV.equals(localc.field_bizChatServId));
          }
        }
        else
        {
          for (paramInt1 = 1;; paramInt1 = 0)
          {
            if (paramInt1 != 0) {
              break label498;
            }
            this.wpy.add(paramk);
            break;
            lU(true);
            GMTrace.o(2964332740608L, 22086);
            return;
          }
        }
      }
    }
    
    final void bd(String paramString, boolean paramBoolean)
    {
      GMTrace.i(2965272264704L, 22093);
      Object localObject2 = x.FJ();
      String str = this.juZ;
      Object localObject1 = new ArrayList();
      if (!bg.nm(paramString))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("select BizChatInfo.*");
        localStringBuilder.append(" from BizChatConversation , BizChatInfo");
        localStringBuilder.append(" where BizChatConversation.brandUserName").append(" = '").append(str).append("'");
        localStringBuilder.append(" and BizChatInfo.brandUserName").append(" = '").append(str).append("'");
        localStringBuilder.append(" and BizChatConversation.bizChatId");
        localStringBuilder.append(" = BizChatInfo.bizChatLocalId");
        localStringBuilder.append(" and BizChatInfo.chatName").append(" like '%").append(paramString).append("%'");
        localStringBuilder.append(" order by BizChatConversation.flag").append(" desc");
        localStringBuilder.append(" , BizChatConversation.lastMsgTime").append(" desc");
        w.d("MicroMsg.BizConversationStorage", "getBizChatConversationSearchCursor: sql:%s", new Object[] { localStringBuilder.toString() });
        paramString = ((com.tencent.mm.af.a.b)localObject2).rawQuery(localStringBuilder.toString(), new String[0]);
        if (paramString != null)
        {
          if (paramString.moveToFirst()) {
            do
            {
              localObject2 = new com.tencent.mm.af.a.c();
              ((com.tencent.mm.af.a.c)localObject2).b(paramString);
              ((ArrayList)localObject1).add(localObject2);
            } while (paramString.moveToNext());
          }
          paramString.close();
        }
      }
      Ty();
      paramString = ((List)localObject1).iterator();
      while (paramString.hasNext())
      {
        localObject1 = (com.tencent.mm.af.a.c)paramString.next();
        bool = ((com.tencent.mm.af.a.c)localObject1).FU();
        if ((bool) && (this.wpw))
        {
          this.wpz.add(localObject1);
        }
        else if ((!bool) && (this.wpv))
        {
          this.wpy.add(localObject1);
          this.wpx.add(localObject1);
        }
      }
      if (this.wpv) {
        if (this.wpy.size() > this.wpu) {
          break label414;
        }
      }
      label414:
      for (boolean bool = true;; bool = false)
      {
        this.wpH = bool;
        lU(paramBoolean);
        GMTrace.o(2965272264704L, 22093);
        return;
      }
    }
    
    final boolean cbv()
    {
      GMTrace.i(2964735393792L, 22089);
      if (this.scene == 2)
      {
        GMTrace.o(2964735393792L, 22089);
        return true;
      }
      GMTrace.o(2964735393792L, 22089);
      return false;
    }
    
    final void cbx()
    {
      GMTrace.i(2965809135616L, 22097);
      BizChatSearchUI localBizChatSearchUI = (BizChatSearchUI)this.context;
      if (cbu())
      {
        if (bg.nm(this.jQT))
        {
          localBizChatSearchUI.wpq.setVisibility(8);
          localBizChatSearchUI.wpp.setVisibility(8);
          GMTrace.o(2965809135616L, 22097);
          return;
        }
        if (getCount() <= 0)
        {
          localBizChatSearchUI.wpq.setVisibility(0);
          localBizChatSearchUI.wpp.setVisibility(8);
          GMTrace.o(2965809135616L, 22097);
          return;
        }
        localBizChatSearchUI.wpq.setVisibility(8);
        localBizChatSearchUI.wpp.setVisibility(0);
        GMTrace.o(2965809135616L, 22097);
        return;
      }
      if (bg.nm(this.jQT))
      {
        localBizChatSearchUI.wpq.setVisibility(0);
        localBizChatSearchUI.wpq.setText("");
        localBizChatSearchUI.wpp.setVisibility(8);
      }
      while (cbv()) {
        if (this.wpI)
        {
          localBizChatSearchUI.Cy(1);
          GMTrace.o(2965809135616L, 22097);
          return;
          if ((cbv()) && (this.wpH))
          {
            localBizChatSearchUI.wpq.setVisibility(0);
            localBizChatSearchUI.wpq.setText(R.l.daR);
            localBizChatSearchUI.wpp.setVisibility(8);
          }
          else if ((cbv()) && (this.wpL))
          {
            localBizChatSearchUI.wpq.setVisibility(0);
            localBizChatSearchUI.wpq.setText(R.l.daS);
            localBizChatSearchUI.wpp.setVisibility(8);
          }
          else if (getCount() <= 0)
          {
            localBizChatSearchUI.wpq.setVisibility(0);
            localBizChatSearchUI.wpq.setText(f.a(localBizChatSearchUI.getString(R.l.dWd), localBizChatSearchUI.getString(R.l.dWc), com.tencent.mm.plugin.fts.d.b.a.d(this.jQT, this.jQT)).lAJ);
            localBizChatSearchUI.wpp.setVisibility(8);
          }
          else
          {
            localBizChatSearchUI.wpq.setVisibility(8);
            localBizChatSearchUI.wpp.setVisibility(0);
          }
        }
        else
        {
          if (this.wpG)
          {
            localBizChatSearchUI.Cy(2);
            GMTrace.o(2965809135616L, 22097);
            return;
          }
          localBizChatSearchUI.Cy(0);
        }
      }
      GMTrace.o(2965809135616L, 22097);
    }
    
    public final int getCount()
    {
      GMTrace.i(2963527434240L, 22080);
      int i = this.Ob;
      GMTrace.o(2963527434240L, 22080);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(2964064305152L, 22084);
      long l = paramInt;
      GMTrace.o(2964064305152L, 22084);
      return l;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(2963661651968L, 22081);
      BizChatSearchUI.g localg = Cz(paramInt);
      if (localg != null)
      {
        paramInt = localg.jHw;
        GMTrace.o(2963661651968L, 22081);
        return paramInt;
      }
      paramInt = BizChatSearchUI.g.wpP;
      GMTrace.o(2963661651968L, 22081);
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(2964198522880L, 22085);
      BizChatSearchUI.g localg = Cz(paramInt);
      View localView;
      int i;
      BizChatSearchUI.f localf;
      Object localObject;
      if ((localg.jHw == BizChatSearchUI.g.wpQ) || (localg.jHw == BizChatSearchUI.g.wpR))
      {
        localView = paramView;
        if (paramView == null)
        {
          localView = LayoutInflater.from(this.context).inflate(R.i.cxG, paramViewGroup, false);
          i = paramViewGroup.getPaddingLeft();
          int j = paramViewGroup.getPaddingRight();
          localView.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(paramViewGroup.getWidth(), 1073741824), i + j, -1), View.MeasureSpec.makeMeasureSpec(-2, 1073741824));
          paramView = new BizChatSearchUI.f();
          paramView.hqG = ((ImageView)localView.findViewById(R.h.bfq));
          paramView.hqH = ((TextView)localView.findViewById(R.h.chT));
          paramView.hqI = ((TextView)localView.findViewById(R.h.bti));
          paramView.hqF = localView.findViewById(R.h.cay);
          localView.setTag(paramView);
        }
        localf = (BizChatSearchUI.f)localView.getTag();
        localObject = "";
        i = 0;
        if ((localg.data instanceof com.tencent.mm.af.a.c))
        {
          paramView = (com.tencent.mm.af.a.c)localg.data;
          if (paramView == null) {
            break label1235;
          }
          if (!paramView.FU())
          {
            localObject = x.FK().bl(paramView.field_bizChatServId);
            if (localObject != null)
            {
              paramViewGroup = ((j)localObject).field_userName;
              paramView = ((j)localObject).field_headImageUrl;
            }
          }
        }
      }
      for (;;)
      {
        boolean bool1 = false;
        i = 1;
        String str = "";
        localObject = paramViewGroup;
        paramViewGroup = str;
        for (;;)
        {
          if (i != 0)
          {
            localObject = com.tencent.mm.az.e.a((CharSequence)localObject, this.jQT);
            localObject = a(this.context, (Spannable)localObject, d.b.lzt);
            label302:
            if (!bool1) {
              break label571;
            }
            str = this.context.getString(R.l.daY);
            paramViewGroup = com.tencent.mm.az.e.a(paramViewGroup, this.jQT);
          }
          label571:
          for (paramViewGroup = TextUtils.concat(new CharSequence[] { str, a(this.context, paramViewGroup, d.b.lzt) });; paramViewGroup = "")
          {
            boolean bool2 = true;
            bool1 = bool2;
            if (localg.jHw == BizChatSearchUI.g.wpQ)
            {
              bool1 = bool2;
              if (paramInt == this.wpK - 1)
              {
                bool1 = bool2;
                if (this.wpK != this.Ob) {
                  bool1 = false;
                }
              }
            }
            p(localf.hqF, bool1);
            com.tencent.mm.ao.n.Jd().a(paramView, localf.hqG, this.gKp);
            com.tencent.mm.plugin.fts.d.e.a((CharSequence)localObject, localf.hqH);
            com.tencent.mm.plugin.fts.d.e.a(paramViewGroup, localf.hqI);
            GMTrace.o(2964198522880L, 22085);
            return localView;
            paramViewGroup = paramView.field_chatName;
            paramView = paramView.field_headImageUrl;
            break;
            if (!(localg.data instanceof hc)) {
              break label1221;
            }
            paramViewGroup = (hc)localg.data;
            paramView = paramViewGroup.tVX;
            localObject = paramView.jBs;
            paramView = paramView.tVP;
            bool1 = "userid".equals(paramViewGroup.tVY);
            if (!bool1) {}
            for (i = 1;; i = 0)
            {
              paramViewGroup = paramViewGroup.tVZ;
              break;
            }
            localObject = a(this.context, new SpannableString((CharSequence)localObject), d.b.lzt);
            break label302;
          }
          if (localg.jHw == BizChatSearchUI.g.wpU)
          {
            localObject = paramView;
            if (paramView == null)
            {
              localObject = LayoutInflater.from(this.context).inflate(R.i.cxM, paramViewGroup, false);
              paramView = new BizChatSearchUI.b();
              paramView.jUf = ((TextView)((View)localObject).findViewById(R.h.bGb));
              paramView.lAk = ((View)localObject).findViewById(R.h.bST);
              paramView.hqF = ((View)localObject).findViewById(R.h.cay);
              ((View)localObject).setTag(paramView);
            }
            paramViewGroup = (BizChatSearchUI.b)((View)localObject).getTag();
            if (((Integer)localg.data).intValue() == BizChatSearchUI.g.wpW) {
              paramView = this.context.getResources().getString(R.l.daW);
            }
          }
          for (;;)
          {
            com.tencent.mm.plugin.fts.d.e.a(paramView, paramViewGroup.jUf);
            if (paramInt == 0) {
              paramViewGroup.lAk.setVisibility(8);
            }
            for (;;)
            {
              paramViewGroup.hqF.setBackgroundResource(R.g.aXD);
              GMTrace.o(2964198522880L, 22085);
              return (View)localObject;
              if (((Integer)localg.data).intValue() != BizChatSearchUI.g.wpX) {
                break label1214;
              }
              paramView = this.context.getResources().getString(R.l.daP);
              break;
              paramViewGroup.lAk.setVisibility(0);
            }
            if (localg.jHw == BizChatSearchUI.g.wpS)
            {
              localObject = paramView;
              if (paramView == null)
              {
                localObject = LayoutInflater.from(this.context).inflate(R.i.cxW, paramViewGroup, false);
                paramView = new BizChatSearchUI.e();
                paramView.lAu = ((TextView)((View)localObject).findViewById(R.h.chy));
                paramView.iub = ((ImageView)((View)localObject).findViewById(R.h.bGr));
                paramView.hqF = ((View)localObject).findViewById(R.h.cay);
                ((View)localObject).setTag(paramView);
              }
              paramViewGroup = (BizChatSearchUI.e)((View)localObject).getTag();
              paramView = "";
              if (((Integer)localg.data).intValue() == BizChatSearchUI.g.wpW)
              {
                paramView = this.context.getResources().getString(R.l.daV);
                if ((((Integer)localg.data).intValue() != BizChatSearchUI.g.wpW) || (this.wpK == this.Ob)) {
                  break label1208;
                }
              }
            }
            label1202:
            label1208:
            for (bool1 = false;; bool1 = true)
            {
              p(paramViewGroup.hqF, bool1);
              paramViewGroup.lAu.setText(paramView);
              paramViewGroup.iub.setImageResource(R.k.cMG);
              GMTrace.o(2964198522880L, 22085);
              return (View)localObject;
              if (((Integer)localg.data).intValue() != BizChatSearchUI.g.wpX) {
                break;
              }
              paramView = this.context.getResources().getString(R.l.daU);
              break;
              if (localg.jHw == BizChatSearchUI.g.wpT)
              {
                localObject = paramView;
                if (paramView == null)
                {
                  localObject = LayoutInflater.from(this.context).inflate(R.i.cxO, paramViewGroup, false);
                  paramView = new BizChatSearchUI.d();
                  paramView.lAu = ((TextView)((View)localObject).findViewById(R.h.chy));
                  paramView.hqF = ((View)localObject).findViewById(R.h.cay);
                  ((View)localObject).setTag(paramView);
                }
                paramView = (BizChatSearchUI.d)((View)localObject).getTag();
                if ((((Integer)localg.data).intValue() != BizChatSearchUI.g.wpW) || (this.wpK == this.Ob)) {
                  break label1202;
                }
              }
              for (bool1 = false;; bool1 = true)
              {
                p(paramView.hqF, bool1);
                paramView.lAu.setText(this.context.getResources().getString(R.l.daR));
                GMTrace.o(2964198522880L, 22085);
                return (View)localObject;
                GMTrace.o(2964198522880L, 22085);
                return null;
              }
            }
            label1214:
            paramView = "";
          }
          label1221:
          bool1 = false;
          paramView = "";
          paramViewGroup = "";
        }
        label1235:
        paramView = "";
        paramViewGroup = "";
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(2963795869696L, 22082);
      int i = BizChatSearchUI.g.wpV;
      GMTrace.o(2963795869696L, 22082);
      return i;
    }
    
    final void lU(boolean paramBoolean)
    {
      int k = 1;
      GMTrace.i(2965674917888L, 22096);
      this.wpB.clear();
      this.wpE.clear();
      int i = 0;
      while (i < Math.min(this.wpu, this.wpy.size()))
      {
        this.wpB.add(new BizChatSearchUI.g(BizChatSearchUI.g.wpQ, this.wpy.get(i)));
        i += 1;
      }
      i = 0;
      while (i < Math.min(this.wpu, this.wpz.size()))
      {
        this.wpE.add(new BizChatSearchUI.g(BizChatSearchUI.g.wpR, this.wpz.get(i)));
        i += 1;
      }
      i = this.wpy.size();
      int m = this.wpz.size();
      boolean bool;
      label197:
      int j;
      if (this.scene != 2)
      {
        if (this.wpy.size() > this.wpu)
        {
          bool = true;
          this.wpG = bool;
        }
      }
      else
      {
        if (this.wpz.size() <= this.wpu) {
          break label337;
        }
        bool = true;
        this.wpJ = bool;
        if ((i <= 0) && (!this.wpH)) {
          break label358;
        }
        j = Math.min(i, this.wpu) + 1;
        if (!cbu()) {
          break label353;
        }
        if ((!this.wpH) && (!this.wpG)) {
          break label343;
        }
        i = 1;
        label248:
        i += j;
      }
      for (;;)
      {
        this.wpK = i;
        j = i;
        if (m > 0)
        {
          m = i + 1 + Math.min(m, this.wpu);
          j = m;
          if (cbu()) {
            if (!this.wpJ) {
              break label348;
            }
          }
        }
        label337:
        label343:
        label348:
        for (i = k;; i = 0)
        {
          j = m + i;
          this.Ob = j;
          if (paramBoolean)
          {
            notifyDataSetChanged();
            cbx();
          }
          GMTrace.o(2965674917888L, 22096);
          return;
          bool = false;
          break;
          bool = false;
          break label197;
          i = 0;
          break label248;
        }
        label353:
        i = j;
        continue;
        label358:
        i = 0;
      }
    }
  }
  
  private static final class b
  {
    public View hqF;
    public TextView jUf;
    public View lAk;
    
    public b()
    {
      GMTrace.i(2972251586560L, 22145);
      GMTrace.o(2972251586560L, 22145);
    }
  }
  
  private static final class c
  {
    View jui;
    View juj;
    View juk;
    
    public c()
    {
      GMTrace.i(2984062746624L, 22233);
      GMTrace.o(2984062746624L, 22233);
    }
    
    final void k(boolean paramBoolean1, boolean paramBoolean2)
    {
      int j = 0;
      GMTrace.i(2984196964352L, 22234);
      View localView = this.jui;
      if (paramBoolean1)
      {
        i = 0;
        localView.setVisibility(i);
        this.juj.setVisibility(8);
        localView = this.juk;
        if (!paramBoolean2) {
          break label74;
        }
      }
      label74:
      for (int i = j;; i = 8)
      {
        localView.setVisibility(i);
        GMTrace.o(2984196964352L, 22234);
        return;
        i = 8;
        break;
      }
    }
  }
  
  private static final class d
  {
    public View hqF;
    public TextView lAu;
    
    public d()
    {
      GMTrace.i(3011845816320L, 22440);
      GMTrace.o(3011845816320L, 22440);
    }
  }
  
  private static final class e
  {
    public View hqF;
    public ImageView iub;
    public TextView lAu;
    
    public e()
    {
      GMTrace.i(2982049480704L, 22218);
      GMTrace.o(2982049480704L, 22218);
    }
  }
  
  private static final class f
  {
    public View hqF;
    public ImageView hqG;
    public TextView hqH;
    public TextView hqI;
    
    public f()
    {
      GMTrace.i(2995337035776L, 22317);
      GMTrace.o(2995337035776L, 22317);
    }
  }
  
  private static final class g
  {
    public static int wpP;
    public static int wpQ;
    public static int wpR;
    public static int wpS;
    public static int wpT;
    public static int wpU;
    public static int wpV;
    public static int wpW;
    public static int wpX;
    public Object data;
    public int jHw;
    
    static
    {
      GMTrace.i(2997752954880L, 22335);
      wpP = 0;
      wpQ = 1;
      wpR = 2;
      wpS = 3;
      wpT = 4;
      wpU = 5;
      wpV = 6;
      wpW = 1;
      wpX = 2;
      GMTrace.o(2997752954880L, 22335);
    }
    
    public g()
    {
      GMTrace.i(2997484519424L, 22333);
      this.jHw = wpP;
      this.data = null;
      GMTrace.o(2997484519424L, 22333);
    }
    
    public g(int paramInt, Object paramObject)
    {
      GMTrace.i(2997618737152L, 22334);
      this.jHw = paramInt;
      this.data = paramObject;
      GMTrace.o(2997618737152L, 22334);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bizchat\BizChatSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */