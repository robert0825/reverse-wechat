package com.tencent.mm.plugin.readerapp.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.pluginsdk.i.n;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.s;
import com.tencent.mm.pluginsdk.ui.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.MMPullDownView.g;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.CustomFitTextView;
import com.tencent.mm.ui.widget.h;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bh;
import com.tencent.mm.y.bi;
import com.tencent.mm.y.c;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReaderAppUI
  extends MMActivity
  implements j.a
{
  private static float density;
  private int eRb;
  private h juL;
  private String mAI;
  private View mOO;
  private ListView mTQ;
  private MMPullDownView mTU;
  private p.d mTX;
  private a<Long> ocQ;
  private e ocR;
  private ae ocS;
  private int ocT;
  
  public ReaderAppUI()
  {
    GMTrace.i(11759217803264L, 87613);
    this.eRb = 0;
    this.mAI = "";
    this.ocR = null;
    this.ocS = new ae();
    this.ocT = 0;
    this.mTX = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(11767002431488L, 87671);
        paramAnonymousInt = paramAnonymousMenuItem.getGroupId();
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(11767002431488L, 87671);
          return;
          long l = ((Long)ReaderAppUI.b(ReaderAppUI.this).getItem(paramAnonymousInt)).longValue();
          Object localObject1;
          if (l != 0L)
          {
            com.tencent.mm.plugin.readerapp.b.g.t(l, ReaderAppUI.a(ReaderAppUI.this));
            paramAnonymousMenuItem = com.tencent.mm.plugin.readerapp.b.g.bah();
            paramAnonymousInt = ReaderAppUI.a(ReaderAppUI.this);
            localObject1 = "delete from " + bi.fx(paramAnonymousInt) + " where time = " + l;
            w.d("MicroMsg.ReaderAppInfoStorage", "deleteGroup:%s", new Object[] { localObject1 });
            if (paramAnonymousMenuItem.goN.eZ(bi.fx(paramAnonymousInt), (String)localObject1))
            {
              paramAnonymousMenuItem.fA(paramAnonymousInt);
              paramAnonymousMenuItem.doNotify();
            }
          }
          ReaderAppUI.this.refresh();
          GMTrace.o(11767002431488L, 87671);
          return;
          if (ReaderAppUI.a(ReaderAppUI.this) == 20)
          {
            l = ((Long)ReaderAppUI.b(ReaderAppUI.this).getItem(paramAnonymousInt)).longValue();
            paramAnonymousMenuItem = com.tencent.mm.plugin.readerapp.b.g.bah().b(l, ReaderAppUI.a(ReaderAppUI.this));
            Object localObject2;
            if (paramAnonymousMenuItem.size() > 0)
            {
              paramAnonymousMenuItem = (bh)paramAnonymousMenuItem.get(0);
              localObject1 = new f.a();
              ((f.a)localObject1).title = paramAnonymousMenuItem.getTitle();
              ((f.a)localObject1).description = paramAnonymousMenuItem.BA();
              ((f.a)localObject1).action = "view";
              ((f.a)localObject1).type = 5;
              ((f.a)localObject1).url = paramAnonymousMenuItem.getUrl();
              localObject2 = f.a.a((f.a)localObject1, null, null);
              localObject1 = new Intent();
              ((Intent)localObject1).putExtra("Retr_Msg_content", (String)localObject2);
              ((Intent)localObject1).putExtra("Retr_Msg_Type", 2);
              ((Intent)localObject1).putExtra("Retr_Msg_thumb_path", s.s(paramAnonymousMenuItem.Bz(), paramAnonymousMenuItem.type, "@T"));
              ((Intent)localObject1).putExtra("Retr_Msg_Id", 7377812);
              localObject2 = u.gy(paramAnonymousMenuItem.goK);
              ((Intent)localObject1).putExtra("reportSessionId", (String)localObject2);
              localObject2 = u.Av().p((String)localObject2, true);
              ((u.b)localObject2).o("prePublishId", "msg_" + paramAnonymousMenuItem.goK);
              ((u.b)localObject2).o("preUsername", "newsapp");
              ((u.b)localObject2).o("preChatName", "newsapp");
              ((u.b)localObject2).o("preMsgIndex", Integer.valueOf(0));
              ((u.b)localObject2).o("sendAppMsgScene", Integer.valueOf(1));
              com.tencent.mm.plugin.readerapp.a.a.hnH.l((Intent)localObject1, ReaderAppUI.this);
            }
            GMTrace.o(11767002431488L, 87671);
            return;
            if (ReaderAppUI.a(ReaderAppUI.this) == 20)
            {
              l = ((Long)ReaderAppUI.b(ReaderAppUI.this).getItem(paramAnonymousInt)).longValue();
              paramAnonymousMenuItem = com.tencent.mm.plugin.readerapp.b.g.bah().b(l, ReaderAppUI.a(ReaderAppUI.this));
              if (!paramAnonymousMenuItem.isEmpty())
              {
                w.i("MicroMsg.ReaderAppUI", "fav time %d, index %d, size %d", new Object[] { Long.valueOf(l), Integer.valueOf(ReaderAppUI.c(ReaderAppUI.this)), Integer.valueOf(paramAnonymousMenuItem.size()) });
                if (ReaderAppUI.c(ReaderAppUI.this) >= paramAnonymousMenuItem.size()) {
                  ReaderAppUI.a(ReaderAppUI.this, 0);
                }
                paramAnonymousMenuItem = (bh)paramAnonymousMenuItem.get(ReaderAppUI.c(ReaderAppUI.this));
                localObject1 = new cf();
                localObject2 = u.gy(paramAnonymousMenuItem.goK);
                u.b localb = u.Av().p((String)localObject2, true);
                localb.o("prePublishId", "msg_" + paramAnonymousMenuItem.goK);
                localb.o("preUsername", "newsapp");
                localb.o("preChatName", "newsapp");
                localb.o("preMsgIndex", Integer.valueOf(0));
                localb.o("sendAppMsgScene", Integer.valueOf(1));
                ((cf)localObject1).eDv.eDA = ((String)localObject2);
                com.tencent.mm.plugin.readerapp.b.b.a((cf)localObject1, paramAnonymousMenuItem, ReaderAppUI.c(ReaderAppUI.this));
                ((cf)localObject1).eDv.eDC = 7;
                ((cf)localObject1).eDv.activity = ReaderAppUI.this;
                com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
              }
            }
          }
        }
      }
    };
    GMTrace.o(11759217803264L, 87613);
  }
  
  private PackageInfo Fo(String paramString)
  {
    GMTrace.i(11760559980544L, 87623);
    if (paramString.length() == 0)
    {
      GMTrace.o(11760559980544L, 87623);
      return null;
    }
    try
    {
      paramString = this.vKB.vKW.getPackageManager().getPackageInfo(paramString, 0);
      GMTrace.o(11760559980544L, 87623);
      return paramString;
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      w.printErrStackTrace("MicroMsg.ReaderAppUI", paramString, "", new Object[0]);
      GMTrace.o(11760559980544L, 87623);
    }
    return null;
  }
  
  protected final void MP()
  {
    GMTrace.i(11760157327360L, 87620);
    try
    {
      this.ocR = new e(bg.convertStreamToString(getAssets().open("chatting/default_chat.xml")));
      this.mTQ = ((ListView)findViewById(R.h.bWE));
      this.mTU = ((MMPullDownView)findViewById(R.h.bWH));
      this.mOO = getLayoutInflater().inflate(R.i.cEh, null);
      this.mTQ.addHeaderView(this.mOO);
      ((TextView)findViewById(R.h.bwF)).setText(R.l.dPF);
      if (this.eRb == 20)
      {
        this.ocQ = new a(this, Long.valueOf(0L));
        this.mTQ.setOnScrollListener(this.ocQ);
        this.mTQ.setAdapter(this.ocQ);
        this.mTQ.setTranscriptMode(0);
        registerForContextMenu(this.mTQ);
        this.juL = new h(this);
        if (this.ocQ.getCount() != 0) {
          break label277;
        }
        Intent localIntent = new Intent(this, ReaderAppIntroUI.class);
        localIntent.putExtra("type", this.eRb);
        startActivity(localIntent);
        finish();
        GMTrace.o(11760157327360L, 87620);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ReaderAppUI", localException, "", new Object[0]);
        continue;
        if (this.eRb == 11) {
          this.ocQ = new b(this, Long.valueOf(0L));
        }
      }
      label277:
      this.mTU.wdN = new MMPullDownView.g()
      {
        public final boolean apa()
        {
          GMTrace.i(11757070319616L, 87597);
          if (ReaderAppUI.b(ReaderAppUI.this).alU())
          {
            ReaderAppUI.e(ReaderAppUI.this).setSelectionFromTop(0, ReaderAppUI.d(ReaderAppUI.this).wdP);
            GMTrace.o(11757070319616L, 87597);
            return true;
          }
          int i = ReaderAppUI.b(ReaderAppUI.this).alV();
          w.v("MicroMsg.ReaderAppUI", "onLoadData add count:" + i);
          ReaderAppUI.b(ReaderAppUI.this).a(null, null);
          ReaderAppUI.e(ReaderAppUI.this).setSelectionFromTop(i, ReaderAppUI.d(ReaderAppUI.this).wdP);
          GMTrace.o(11757070319616L, 87597);
          return true;
        }
      };
      this.mTU.lG(true);
      this.mTU.wdZ = new MMPullDownView.c()
      {
        public final boolean aoZ()
        {
          GMTrace.i(11766733996032L, 87669);
          View localView = ReaderAppUI.e(ReaderAppUI.this).getChildAt(ReaderAppUI.e(ReaderAppUI.this).getChildCount() - 1);
          if (localView == null)
          {
            GMTrace.o(11766733996032L, 87669);
            return false;
          }
          if ((localView.getBottom() <= ReaderAppUI.e(ReaderAppUI.this).getHeight()) && (ReaderAppUI.e(ReaderAppUI.this).getLastVisiblePosition() == ReaderAppUI.e(ReaderAppUI.this).getAdapter().getCount() - 1))
          {
            GMTrace.o(11766733996032L, 87669);
            return true;
          }
          GMTrace.o(11766733996032L, 87669);
          return false;
        }
      };
      this.mTU.wea = new MMPullDownView.d()
      {
        public final boolean aoY()
        {
          GMTrace.i(11769015697408L, 87686);
          View localView = ReaderAppUI.e(ReaderAppUI.this).getChildAt(ReaderAppUI.e(ReaderAppUI.this).getFirstVisiblePosition());
          if ((localView != null) && (localView.getTop() == 0))
          {
            GMTrace.o(11769015697408L, 87686);
            return true;
          }
          GMTrace.o(11769015697408L, 87686);
          return false;
        }
      };
      this.mTU.lE(true);
      this.ocQ.vKu = new o.a()
      {
        public final void QC()
        {
          GMTrace.i(11757338755072L, 87599);
          ReaderAppUI.d(ReaderAppUI.this).lD(ReaderAppUI.b(ReaderAppUI.this).alU());
          GMTrace.o(11757338755072L, 87599);
        }
        
        public final void QD()
        {
          GMTrace.i(11757472972800L, 87600);
          GMTrace.o(11757472972800L, 87600);
        }
      };
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11770760527872L, 87699);
          ReaderAppUI.this.finish();
          GMTrace.o(11770760527872L, 87699);
          return true;
        }
      });
      a(0, R.l.cQi, R.k.cIU, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11764183859200L, 87650);
          com.tencent.mm.plugin.readerapp.a.a.hnH.d(new Intent().putExtra("Contact_User", ReaderAppUI.f(ReaderAppUI.this)), ReaderAppUI.this);
          GMTrace.o(11764183859200L, 87650);
          return true;
        }
      });
      this.mTQ.setSelection(this.ocQ.bai() - 1 + this.mTQ.getHeaderViewsCount());
      GMTrace.o(11760157327360L, 87620);
    }
  }
  
  public final View.OnClickListener a(final bh parambh, final int paramInt1, final int paramInt2)
  {
    GMTrace.i(11760291545088L, 87621);
    parambh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11753983311872L, 87574);
        if (20 == paramInt1)
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("mode", 1);
          Object localObject = parambh.getUrl();
          paramAnonymousView.putExtra("news_svr_id", parambh.goK);
          paramAnonymousView.putExtra("news_svr_tweetid", parambh.Bv());
          paramAnonymousView.putExtra("rawUrl", ReaderAppUI.a(ReaderAppUI.this, (String)localObject));
          paramAnonymousView.putExtra("title", parambh.getName());
          paramAnonymousView.putExtra("webpageTitle", parambh.getTitle());
          paramAnonymousView.putExtra("useJs", true);
          paramAnonymousView.putExtra("vertical_scroll", true);
          localObject = new Bundle();
          ((Bundle)localObject).putInt("snsWebSource", 3);
          paramAnonymousView.putExtra("jsapiargs", (Bundle)localObject);
          paramAnonymousView.putExtra("shortUrl", parambh.Bw());
          paramAnonymousView.putExtra("type", parambh.type);
          paramAnonymousView.putExtra("tweetid", parambh.Bv());
          paramAnonymousView.putExtra("geta8key_username", "newsapp");
          paramAnonymousView.putExtra("KPublisherId", "msg_" + Long.toString(parambh.goK));
          paramAnonymousView.putExtra("pre_username", "newsapp");
          paramAnonymousView.putExtra("prePublishId", "msg_" + Long.toString(parambh.goK));
          paramAnonymousView.putExtra("preUsername", "newsapp");
          paramAnonymousView.putExtra("preChatName", "newsapp");
          paramAnonymousView.putExtra("preMsgIndex", paramInt2);
          com.tencent.mm.plugin.readerapp.a.a.hnH.j(paramAnonymousView, ReaderAppUI.this);
        }
        GMTrace.o(11753983311872L, 87574);
      }
    };
    GMTrace.o(11760291545088L, 87621);
    return parambh;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11759620456448L, 87616);
    int i = R.i.cEe;
    GMTrace.o(11759620456448L, 87616);
    return i;
  }
  
  public final void k(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(11760425762816L, 87622);
    w.d("MicroMsg.ReaderAppUI", "onUpdate");
    if ((this == null) || (isFinishing()) || (paramBitmap == null))
    {
      w.d("MicroMsg.ReaderAppUI", "readerappui is finish");
      GMTrace.o(11760425762816L, 87622);
      return;
    }
    this.ocS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11756533448704L, 87593);
        if (ReaderAppUI.b(ReaderAppUI.this) != null) {
          ReaderAppUI.b(ReaderAppUI.this).notifyDataSetChanged();
        }
        GMTrace.o(11756533448704L, 87593);
      }
    });
    GMTrace.o(11760425762816L, 87622);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11759352020992L, 87614);
    super.onCreate(paramBundle);
    this.eRb = getIntent().getIntExtra("type", 0);
    density = com.tencent.mm.br.a.getDensity(this);
    MP();
    this.mAI = bh.fw(this.eRb);
    GMTrace.o(11759352020992L, 87614);
  }
  
  public void onDestroy()
  {
    GMTrace.i(11759486238720L, 87615);
    if (this.ocQ != null)
    {
      this.ocQ.aJe();
      this.ocQ.vKu = null;
    }
    super.onDestroy();
    GMTrace.o(11759486238720L, 87615);
  }
  
  protected void onPause()
  {
    GMTrace.i(11759888891904L, 87618);
    super.onPause();
    at.getNotification().dv("");
    com.tencent.mm.plugin.readerapp.b.g.bah().j(this.ocQ);
    j.c(this);
    at.AR();
    c.yP().TQ(this.mAI);
    GMTrace.o(11759888891904L, 87618);
  }
  
  protected void onResume()
  {
    GMTrace.i(11759754674176L, 87617);
    super.onResume();
    j.b(this);
    if (this.eRb == 20) {
      oM(R.l.dCr);
    }
    for (;;)
    {
      at.getNotification().dv(this.mAI);
      at.getNotification().cancelNotification(this.mAI);
      at.AR();
      c.yP().TQ(this.mAI);
      com.tencent.mm.plugin.readerapp.b.g.bah().c(this.ocQ);
      this.ocQ.a(null, null);
      refresh();
      GMTrace.o(11759754674176L, 87617);
      return;
      oM(R.l.dCu);
    }
  }
  
  public final void refresh()
  {
    GMTrace.i(11760023109632L, 87619);
    TextView localTextView = (TextView)findViewById(R.h.bwF);
    if (this.eRb == 20) {}
    for (int i = R.l.aZv;; i = R.l.dPQ)
    {
      localTextView.setText(i);
      if (this.ocQ.getCount() != 0) {
        break;
      }
      localTextView.setVisibility(0);
      GMTrace.o(11760023109632L, 87619);
      return;
    }
    localTextView.setVisibility(8);
    GMTrace.o(11760023109632L, 87619);
  }
  
  final class a
    extends a<Long>
  {
    private Context context;
    private int gQB;
    private int jIt;
    private Html.ImageGetter ocY;
    private int ocZ;
    private int oda;
    private int odb;
    
    public a(Context paramContext, Long paramLong)
    {
      super(paramLong);
      GMTrace.i(11767270866944L, 87673);
      this.ocY = new Html.ImageGetter()
      {
        public final Drawable getDrawable(String paramAnonymousString)
        {
          GMTrace.i(11771028963328L, 87701);
          int i = bg.getInt(paramAnonymousString, 0);
          paramAnonymousString = ReaderAppUI.this.getResources().getDrawable(i);
          paramAnonymousString.setBounds(0, 0, paramAnonymousString.getIntrinsicWidth(), paramAnonymousString.getIntrinsicHeight());
          GMTrace.o(11771028963328L, 87701);
          return paramAnonymousString;
        }
      };
      this.ocZ = 0;
      this.oda = 0;
      this.odb = 0;
      this.context = paramContext;
      this.jIt = 3;
      this.gQB = com.tencent.mm.plugin.readerapp.b.g.bah().fy(ReaderAppUI.a(ReaderAppUI.this));
      this.oda = paramContext.getResources().getDimensionPixelSize(R.f.aQN);
      this.odb = paramContext.getResources().getDimensionPixelSize(R.f.aPT);
      this.ocZ = paramContext.getResources().getDimensionPixelSize(R.f.aPv);
      GMTrace.o(11767270866944L, 87673);
    }
    
    private void a(b paramb, List<bh> paramList, int paramInt1, int paramInt2)
    {
      GMTrace.i(11768344608768L, 87681);
      a locala = new a();
      locala.odd = View.inflate(this.context, paramInt1, null);
      locala.ikm = ((TextView)locala.odd.findViewById(R.h.title));
      locala.odf = ((ImageView)locala.odd.findViewById(R.h.bsp));
      locala.odg = ((ImageView)locala.odd.findViewById(R.h.cjU));
      locala.ode = locala.odd.findViewById(R.h.bsq);
      locala.lho = ((ProgressBar)locala.odd.findViewById(R.h.bKJ));
      locala.odh = locala.odd.findViewById(R.h.bKz);
      if (paramb != null)
      {
        paramb.odm.addView(locala.odd);
        paramb.odp.add(locala);
      }
      paramb = (bh)paramList.get(paramInt2);
      locala.ikm.setText(paramb.getTitle());
      locala.lho.setVisibility(8);
      locala.odh.setVisibility(8);
      if (paramb.Bu())
      {
        locala.ikm.setText(Html.fromHtml(paramb.getTitle() + "<img src='" + R.g.aZu + "'/>", this.ocY, null));
        if (bg.nm(paramb.Bz())) {
          break label373;
        }
        locala.odf.setVisibility(0);
        paramList = j.a(new s(paramb.Bz(), paramb.type, "@S", this.kNw));
        locala.odf.setImageBitmap(paramList);
      }
      for (;;)
      {
        paramb = ReaderAppUI.this.a(paramb, ReaderAppUI.a(ReaderAppUI.this), paramInt2);
        locala.odd.setOnClickListener(paramb);
        GMTrace.o(11768344608768L, 87681);
        return;
        locala.ikm.setText(paramb.getTitle());
        break;
        label373:
        locala.ode.setVisibility(8);
        locala.odg.setVisibility(8);
      }
    }
    
    private void a(b paramb, boolean paramBoolean1, boolean paramBoolean2)
    {
      int j = 0;
      GMTrace.i(11768478826496L, 87682);
      Object localObject = paramb.odo;
      if (paramBoolean1)
      {
        i = 0;
        ((LinearLayout)localObject).setVisibility(i);
        if (paramBoolean1) {
          break label181;
        }
        paramb.odk.setBackgroundResource(R.g.aZq);
        paramb.odk.setPadding(this.odb, this.odb, this.odb, this.oda);
        label69:
        localObject = paramb.ikm;
        if ((!paramBoolean1) && ((paramBoolean1) || (paramBoolean2))) {
          break label217;
        }
        i = 0;
        label90:
        ((TextView)localObject).setVisibility(i);
        localObject = paramb.odi;
        if (!paramBoolean1) {
          break label224;
        }
        i = 0;
        label110:
        ((TextView)localObject).setVisibility(i);
        localObject = paramb.mTK;
        if (!paramBoolean1) {
          break label231;
        }
      }
      label181:
      label217:
      label224:
      label231:
      for (int i = 0;; i = 8)
      {
        ((TextView)localObject).setVisibility(i);
        paramb = paramb.odl;
        if (!paramBoolean1)
        {
          i = j;
          if (paramBoolean2) {}
        }
        else
        {
          i = 8;
        }
        paramb.setVisibility(i);
        GMTrace.o(11768478826496L, 87682);
        return;
        i = 8;
        break;
        paramb.odk.setBackgroundResource(R.g.aZs);
        paramb.odk.setPadding(this.odb, this.odb, this.odb, this.odb);
        break label69;
        i = 8;
        break label90;
        i = 8;
        break label110;
      }
    }
    
    private Long tb(int paramInt)
    {
      GMTrace.i(11768076173312L, 87679);
      Long localLong = (Long)super.getItem(paramInt);
      GMTrace.o(11768076173312L, 87679);
      return localLong;
    }
    
    public final void QF()
    {
      GMTrace.i(11767941955584L, 87678);
      this.gQB = com.tencent.mm.plugin.readerapp.b.g.bah().fy(20);
      setCursor(com.tencent.mm.plugin.readerapp.b.g.bah().aL(this.jIt, 20));
      super.notifyDataSetChanged();
      GMTrace.o(11767941955584L, 87678);
    }
    
    protected final void QG()
    {
      GMTrace.i(11767405084672L, 87674);
      QF();
      GMTrace.o(11767405084672L, 87674);
    }
    
    public final boolean alU()
    {
      GMTrace.i(11767539302400L, 87675);
      if (this.jIt >= this.gQB)
      {
        GMTrace.o(11767539302400L, 87675);
        return true;
      }
      GMTrace.o(11767539302400L, 87675);
      return false;
    }
    
    public final int alV()
    {
      GMTrace.i(11767807737856L, 87677);
      if (alU())
      {
        GMTrace.o(11767807737856L, 87677);
        return 0;
      }
      this.jIt += 3;
      if (this.jIt <= this.gQB)
      {
        GMTrace.o(11767807737856L, 87677);
        return 3;
      }
      this.jIt = this.gQB;
      int i = this.gQB;
      GMTrace.o(11767807737856L, 87677);
      return i % 3;
    }
    
    public final int bai()
    {
      GMTrace.i(11767673520128L, 87676);
      int i = this.jIt;
      GMTrace.o(11767673520128L, 87676);
      return i;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11768210391040L, 87680);
      w.w("MicroMsg.ReaderAppUI", "ashutest get view position %d", new Object[] { Integer.valueOf(paramInt) });
      if (paramView == null)
      {
        paramViewGroup = new b();
        paramView = View.inflate(this.context, R.i.cEj, null);
        paramViewGroup.lWz = ((TextView)paramView.findViewById(R.h.bWu));
        paramViewGroup.odm = ((ViewGroup)paramView.findViewById(R.h.bWq));
        paramViewGroup.ikm = ((TextView)paramView.findViewById(R.h.bWv));
        paramViewGroup.odi = ((TextView)paramView.findViewById(R.h.bWs));
        paramViewGroup.odj = ((ImageView)paramView.findViewById(R.h.bWt));
        paramViewGroup.mTK = ((TextView)paramView.findViewById(R.h.bWr));
        paramViewGroup.odk = paramView.findViewById(R.h.chY);
        paramViewGroup.odl = ((ViewGroup)paramView.findViewById(R.h.chP));
        paramViewGroup.odn = ((CustomFitTextView)paramView.findViewById(R.h.chS));
        paramViewGroup.odo = ((LinearLayout)paramView.findViewById(R.h.btA));
        paramViewGroup.lho = ((ProgressBar)paramView.findViewById(R.h.bIR));
        paramViewGroup.odh = paramView.findViewById(R.h.buV);
        paramViewGroup.odp = new ArrayList();
        paramView.setTag(paramViewGroup);
      }
      for (;;)
      {
        localObject1 = paramViewGroup.odp.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (a)((Iterator)localObject1).next();
          paramViewGroup.odm.removeView(((a)localObject2).odd);
        }
        paramViewGroup = (b)paramView.getTag();
      }
      paramViewGroup.odp.clear();
      long l = tb(paramInt).longValue();
      Object localObject1 = com.tencent.mm.plugin.readerapp.b.g.bah().b(l, 20);
      label533:
      label579:
      int i;
      if (((List)localObject1).size() > 0)
      {
        int j = ((List)localObject1).size();
        localObject2 = (bh)((List)localObject1).get(0);
        paramViewGroup.ikm.setText(((bh)localObject2).getTitle());
        paramViewGroup.mTK.setText(((bh)localObject2).BA());
        paramViewGroup.lWz.setText(n.c(this.context, ((bh)localObject2).time, false));
        paramViewGroup.odi.setText(n.ac(this.context.getString(R.l.dwA), ((bh)localObject2).goF));
        if (ReaderAppUI.h(ReaderAppUI.this) != null)
        {
          paramViewGroup.lWz.setTextColor(ReaderAppUI.h(ReaderAppUI.this).tsS);
          if (ReaderAppUI.h(ReaderAppUI.this).tsT)
          {
            paramViewGroup.lWz.setShadowLayer(2.0F, 1.2F, 1.2F, ReaderAppUI.h(ReaderAppUI.this).tsU);
            if (!ReaderAppUI.h(ReaderAppUI.this).tsV) {
              break label725;
            }
            paramViewGroup.lWz.setBackgroundResource(R.g.aVr);
            paramViewGroup.lWz.setPadding(this.oda, this.ocZ, this.oda, this.ocZ);
          }
        }
        else
        {
          bool = true;
          paramViewGroup.lho.setVisibility(8);
          paramViewGroup.odh.setVisibility(8);
          if (!((bh)localObject2).Bu()) {
            break label736;
          }
          paramViewGroup.odn.b(((bh)localObject2).getTitle(), 4, true, R.g.aZt);
          if (bg.nm(((bh)localObject2).Bz())) {
            break label754;
          }
          paramViewGroup.odj.setVisibility(0);
          localObject3 = j.a(new s(((bh)localObject2).Bz(), ((bh)localObject2).type, "@T", this.kNw));
          paramViewGroup.odj.setImageBitmap((Bitmap)localObject3);
        }
        for (;;)
        {
          localObject2 = ReaderAppUI.this.a((bh)localObject2, ReaderAppUI.a(ReaderAppUI.this), 0);
          paramViewGroup.odk.setOnClickListener((View.OnClickListener)localObject2);
          if (j <= 1) {
            break label991;
          }
          a(paramViewGroup, false, bool);
          i = 1;
          while (i < j - 1)
          {
            a(paramViewGroup, (List)localObject1, R.i.cEq, i);
            i += 1;
          }
          paramViewGroup.lWz.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
          break;
          label725:
          paramViewGroup.lWz.setBackgroundColor(0);
          break label533;
          label736:
          paramViewGroup.odn.b(((bh)localObject2).getTitle(), 4, false, -1);
          break label579;
          label754:
          paramViewGroup.odj.setVisibility(8);
          bool = false;
        }
        a(paramViewGroup, (List)localObject1, R.i.cEp, j - 1);
      }
      paramViewGroup.odk.setTag(Integer.valueOf(paramInt));
      paramViewGroup.odk.setTag(R.h.bWG, Integer.valueOf(0));
      Object localObject2 = ReaderAppUI.i(ReaderAppUI.this);
      Object localObject3 = paramViewGroup.odk;
      Object localObject4 = ReaderAppUI.this;
      label843:
      label877:
      ReaderAppUI localReaderAppUI;
      if (((List)localObject1).size() == 1)
      {
        bool = true;
        ((h)localObject2).c((View)localObject3, ReaderAppUI.a((ReaderAppUI)localObject4, bool), ReaderAppUI.g(ReaderAppUI.this));
        paramViewGroup = paramViewGroup.odp.iterator();
        i = 1;
        if (!paramViewGroup.hasNext()) {
          break label1028;
        }
        localObject2 = (a)paramViewGroup.next();
        ((a)localObject2).odd.setTag(Integer.valueOf(paramInt));
        localObject3 = ReaderAppUI.i(ReaderAppUI.this);
        localObject4 = ((a)localObject2).odd;
        localReaderAppUI = ReaderAppUI.this;
        if (((List)localObject1).size() != 1) {
          break label1022;
        }
      }
      label991:
      label1022:
      for (boolean bool = true;; bool = false)
      {
        ((h)localObject3).c((View)localObject4, ReaderAppUI.a(localReaderAppUI, bool), ReaderAppUI.g(ReaderAppUI.this));
        ((a)localObject2).odd.setTag(R.h.bWG, Integer.valueOf(i));
        i += 1;
        break label877;
        if (!bool) {}
        for (bool = true;; bool = false)
        {
          a(paramViewGroup, true, bool);
          break;
        }
        bool = false;
        break label843;
      }
      label1028:
      GMTrace.o(11768210391040L, 87680);
      return paramView;
    }
    
    final class a
    {
      TextView ikm;
      ProgressBar lho;
      View odd;
      View ode;
      ImageView odf;
      ImageView odg;
      View odh;
      
      a()
      {
        GMTrace.i(11757875625984L, 87603);
        GMTrace.o(11757875625984L, 87603);
      }
    }
    
    final class b
    {
      TextView ikm;
      TextView lWz;
      ProgressBar lho;
      TextView mTK;
      View odh;
      TextView odi;
      ImageView odj;
      View odk;
      ViewGroup odl;
      ViewGroup odm;
      CustomFitTextView odn;
      LinearLayout odo;
      List<ReaderAppUI.a.a> odp;
      
      b()
      {
        GMTrace.i(11756265013248L, 87591);
        GMTrace.o(11756265013248L, 87591);
      }
    }
  }
  
  final class b
    extends a<Long>
  {
    private Context context;
    private int gQB;
    private int jIt;
    private int ocZ;
    private int oda;
    
    public b(Context paramContext, Long paramLong)
    {
      super(paramLong);
      GMTrace.i(11755191271424L, 87583);
      this.context = paramContext;
      this.jIt = 3;
      this.gQB = this.jIt;
      this.ocZ = paramContext.getResources().getDimensionPixelSize(R.f.aPv);
      this.oda = paramContext.getResources().getDimensionPixelSize(R.f.aQN);
      GMTrace.o(11755191271424L, 87583);
    }
    
    public final void QF()
    {
      GMTrace.i(11755862360064L, 87588);
      this.gQB = com.tencent.mm.plugin.readerapp.b.g.bah().fy(ReaderAppUI.a(ReaderAppUI.this));
      setCursor(com.tencent.mm.plugin.readerapp.b.g.bah().aL(this.jIt, ReaderAppUI.a(ReaderAppUI.this)));
      super.notifyDataSetChanged();
      GMTrace.o(11755862360064L, 87588);
    }
    
    protected final void QG()
    {
      GMTrace.i(11755325489152L, 87584);
      QF();
      GMTrace.o(11755325489152L, 87584);
    }
    
    public final boolean alU()
    {
      GMTrace.i(11755459706880L, 87585);
      if (this.jIt >= this.gQB)
      {
        GMTrace.o(11755459706880L, 87585);
        return true;
      }
      GMTrace.o(11755459706880L, 87585);
      return false;
    }
    
    public final int alV()
    {
      GMTrace.i(11755728142336L, 87587);
      if (alU())
      {
        GMTrace.o(11755728142336L, 87587);
        return 0;
      }
      this.jIt += 3;
      if (this.jIt <= this.gQB)
      {
        GMTrace.o(11755728142336L, 87587);
        return 3;
      }
      this.jIt = this.gQB;
      int i = this.gQB;
      GMTrace.o(11755728142336L, 87587);
      return i % 3;
    }
    
    public final int bai()
    {
      GMTrace.i(11755593924608L, 87586);
      int i = this.jIt;
      GMTrace.o(11755593924608L, 87586);
      return i;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11755996577792L, 87589);
      if (paramView == null)
      {
        paramViewGroup = new a();
        paramView = View.inflate(this.context, R.i.cEk, null);
        paramViewGroup.odq = ((ReaderItemListView)paramView.findViewById(R.h.bWI));
        paramViewGroup.lWz = ((TextView)paramView.findViewById(R.h.bWu));
        paramView.setTag(paramViewGroup);
        long l = ((Long)getItem(paramInt)).longValue();
        paramViewGroup.lWz.setText(n.c(this.context, l, false));
        ReaderItemListView localReaderItemListView = paramViewGroup.odq;
        l = ((Long)getItem(paramInt)).longValue();
        View.OnCreateContextMenuListener localOnCreateContextMenuListener = ReaderAppUI.a(ReaderAppUI.this, false);
        p.d locald = ReaderAppUI.g(ReaderAppUI.this);
        localReaderItemListView.position = paramInt;
        localReaderItemListView.odu = localOnCreateContextMenuListener;
        localReaderItemListView.mTX = locald;
        localReaderItemListView.ods = com.tencent.mm.plugin.readerapp.b.g.bah().b(l, localReaderItemListView.type);
        localReaderItemListView.odt.notifyDataSetChanged();
        if (ReaderAppUI.h(ReaderAppUI.this) != null)
        {
          paramViewGroup.lWz.setTextColor(ReaderAppUI.h(ReaderAppUI.this).tsS);
          if (!ReaderAppUI.h(ReaderAppUI.this).tsT) {
            break label311;
          }
          paramViewGroup.lWz.setShadowLayer(2.0F, 1.2F, 1.2F, ReaderAppUI.h(ReaderAppUI.this).tsU);
          label244:
          if (!ReaderAppUI.h(ReaderAppUI.this).tsV) {
            break label325;
          }
          paramViewGroup.lWz.setBackgroundResource(R.g.aVr);
          paramViewGroup.lWz.setPadding(this.oda, this.ocZ, this.oda, this.ocZ);
        }
      }
      for (;;)
      {
        GMTrace.o(11755996577792L, 87589);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label311:
        paramViewGroup.lWz.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
        break label244;
        label325:
        paramViewGroup.lWz.setBackgroundColor(0);
      }
    }
    
    final class a
    {
      TextView lWz;
      ReaderItemListView odq;
      
      a()
      {
        GMTrace.i(11767136649216L, 87672);
        GMTrace.o(11767136649216L, 87672);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\readerapp\ui\ReaderAppUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */