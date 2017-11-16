package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.f.m;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.emoji.ui.SquareImageView;
import com.tencent.mm.protocal.c.aaa;
import com.tencent.mm.protocal.c.aae;
import com.tencent.mm.protocal.c.re;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.util.LinkedList;

public class EmojiStoreV2RewardDetailUI
  extends MMActivity
  implements AbsListView.OnScrollListener, e
{
  private ListView Ev;
  private View Ks;
  private boolean jRF;
  private String klj;
  private String klu;
  private int kni;
  private aae kpA;
  private ae krX;
  private String ksQ;
  private String ksR;
  private ImageView ksS;
  private TextView ksT;
  private TextView ksU;
  private TextView ksV;
  private View ksW;
  private View ksX;
  private a ksY;
  private aaa ksZ;
  private byte[] kta;
  private m ktb;
  private MMLoadScrollView.a ktc;
  
  public EmojiStoreV2RewardDetailUI()
  {
    GMTrace.i(11503801466880L, 85710);
    this.jRF = false;
    this.kni = -1;
    this.krX = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11473468260352L, 85484);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11473468260352L, 85484);
          return;
          if (EmojiStoreV2RewardDetailUI.a(EmojiStoreV2RewardDetailUI.this) != null)
          {
            EmojiStoreV2RewardDetailUI.a(EmojiStoreV2RewardDetailUI.this).setVisibility(8);
            GMTrace.o(11473468260352L, 85484);
            return;
            if (EmojiStoreV2RewardDetailUI.a(EmojiStoreV2RewardDetailUI.this) != null) {
              EmojiStoreV2RewardDetailUI.a(EmojiStoreV2RewardDetailUI.this).setVisibility(0);
            }
          }
        }
      }
    };
    this.ktc = new MMLoadScrollView.a()
    {
      public final void atc()
      {
        GMTrace.i(11485816291328L, 85576);
        w.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "onBottom");
        EmojiStoreV2RewardDetailUI.b(EmojiStoreV2RewardDetailUI.this);
        GMTrace.o(11485816291328L, 85576);
      }
    };
    GMTrace.o(11503801466880L, 85710);
  }
  
  private void atb()
  {
    GMTrace.i(11504606773248L, 85716);
    this.ktb = new m(this.klj, this.kta);
    at.wS().a(this.ktb, 0);
    GMTrace.o(11504606773248L, 85716);
  }
  
  private void dX(boolean paramBoolean)
  {
    GMTrace.i(11504740990976L, 85717);
    if ((!this.jRF) && (this.kni != 0))
    {
      atb();
      this.jRF = true;
      if (paramBoolean) {
        this.krX.sendEmptyMessageDelayed(1002, 200L);
      }
    }
    GMTrace.o(11504740990976L, 85717);
  }
  
  protected final void MP()
  {
    GMTrace.i(11504472555520L, 85715);
    oM(R.l.doV);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11480716017664L, 85538);
        EmojiStoreV2RewardDetailUI.this.finish();
        GMTrace.o(11480716017664L, 85538);
        return false;
      }
    });
    this.Ks = v.fb(this.vKB.vKW).inflate(R.i.cuU, null);
    this.ksS = ((ImageView)this.Ks.findViewById(R.h.btp));
    this.ksT = ((TextView)this.Ks.findViewById(R.h.bUf));
    this.ksU = ((TextView)this.Ks.findViewById(R.h.btq));
    this.ksV = ((TextView)this.Ks.findViewById(R.h.bYI));
    this.ksW = findViewById(R.h.bZf);
    this.Ev = ((ListView)findViewById(R.h.bFU));
    this.ksX = v.fb(this.vKB.vKW).inflate(R.i.cuH, null);
    this.ksX.setVisibility(8);
    this.Ev.addHeaderView(this.Ks);
    this.Ev.addFooterView(this.ksX);
    this.ksY = new a(this);
    this.Ev.setAdapter(this.ksY);
    this.Ev.setOnScrollListener(this);
    GMTrace.o(11504472555520L, 85715);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11505277861888L, 85721);
    GMTrace.o(11505277861888L, 85721);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11504875208704L, 85718);
    this.jRF = false;
    if (this.ksX != null)
    {
      this.ksX.setVisibility(8);
      this.krX.removeMessages(1002);
      this.krX.sendEmptyMessageDelayed(1001, 200L);
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(11504875208704L, 85718);
      return;
      paramString = (m)paramk;
      if ((paramInt1 == 0) || (paramInt1 == 4))
      {
        this.kta = paramString.klL;
        if (paramInt2 == 0)
        {
          this.kni = 0;
          if (paramString.arA() != null)
          {
            this.ksY.J(paramString.arA().uqF);
            GMTrace.o(11504875208704L, 85718);
          }
        }
        else if (paramInt2 == 2)
        {
          this.kni = 2;
          if (paramString.arA() != null) {
            this.ksY.J(paramString.arA().uqF);
          }
          if ((this.ksY != null) && (this.Ks != null))
          {
            paramString = this.ksY;
            paramInt1 = paramString.krN;
            paramInt1 = paramString.kgW + paramInt1;
            paramInt2 = this.Ks.getHeight();
            int i = com.tencent.mm.br.a.eg(this);
            w.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "item:%d header:%d window:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
            if (i > paramInt1 * this.ksY.getCount() + paramInt2) {
              paramInt1 = 0;
            }
          }
          while (paramInt1 == 0)
          {
            dX(false);
            GMTrace.o(11504875208704L, 85718);
            return;
            paramInt1 = 1;
            continue;
            paramInt1 = 1;
          }
        }
        else if (paramInt2 == 3)
        {
          this.kni = 1;
          this.kta = null;
          this.ksY.ktf = true;
          dX(false);
          GMTrace.o(11504875208704L, 85718);
        }
      }
      else
      {
        w.w("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "unknow errType:%d", new Object[] { Integer.valueOf(paramInt1) });
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11503935684608L, 85711);
    int i = R.i.cuT;
    GMTrace.o(11503935684608L, 85711);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11504069902336L, 85712);
    super.onCreate(paramBundle);
    this.klj = getIntent().getStringExtra("extra_id");
    this.klu = getIntent().getStringExtra("extra_name");
    this.ksQ = getIntent().getStringExtra("extra_iconurl");
    this.ksR = getIntent().getStringExtra("name");
    MP();
    this.kpA = h.arl().kjD.UQ(this.klj);
    atb();
    com.tencent.mm.ao.n.Jd().a(this.ksQ, this.ksS, f.bQ(this.klj, this.ksQ));
    this.ksT.setText(this.klu);
    this.ksU.setText(this.ksR);
    if (this.ksZ != null)
    {
      this.ksY.J(this.ksZ.uqF);
      this.ksY.ktf = true;
    }
    if (this.kpA != null) {
      this.ksV.setText(getString(R.l.doW, new Object[] { Integer.valueOf(this.kpA.uqE) }));
    }
    at.wS().a(299, this);
    GMTrace.o(11504069902336L, 85712);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11504338337792L, 85714);
    super.onDestroy();
    at.wS().b(299, this);
    com.tencent.mm.ao.n.Jd().bi(0);
    GMTrace.o(11504338337792L, 85714);
  }
  
  protected void onPause()
  {
    GMTrace.i(11504204120064L, 85713);
    super.onPause();
    GMTrace.o(11504204120064L, 85713);
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11505143644160L, 85720);
    GMTrace.o(11505143644160L, 85720);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(11505009426432L, 85719);
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1))
    {
      if ((this.kni == 0) || (this.jRF))
      {
        w.d("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "No More List.");
        GMTrace.o(11505009426432L, 85719);
        return;
      }
      dX(true);
      w.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "[onScrollStateChanged] loadMoreData.");
      com.tencent.mm.ao.n.Jd().bi(paramInt);
    }
    GMTrace.o(11505009426432L, 85719);
  }
  
  final class a
    extends BaseAdapter
  {
    private Bitmap erM;
    private int kgV;
    int kgW;
    int krN;
    private LinkedList<re> kte;
    boolean ktf;
    private Context mContext;
    private int mNumColumns;
    
    public a(Context paramContext)
    {
      GMTrace.i(11483131936768L, 85556);
      this.ktf = false;
      this.mNumColumns = 1;
      this.erM = null;
      this.mContext = paramContext;
      this.krN = com.tencent.mm.br.a.V(EmojiStoreV2RewardDetailUI.this.vKB.vKW, R.f.aRQ);
      int k = com.tencent.mm.br.a.ef(EmojiStoreV2RewardDetailUI.this.vKB.vKW) - com.tencent.mm.br.a.V(EmojiStoreV2RewardDetailUI.this.vKB.vKW, R.f.aQq) * 2;
      int m = this.krN;
      int n = com.tencent.mm.br.a.V(EmojiStoreV2RewardDetailUI.this.vKB.vKW, R.f.aQu);
      int j = k / (m + n);
      int i = j;
      if (k - j * m - n * (j - 1) > m) {
        i = j + 1;
      }
      this.mNumColumns = i;
      this.kgV = com.tencent.mm.br.a.ef(this.mContext);
      this.kgW = ((int)((this.kgV - this.mNumColumns * this.krN) / (this.mNumColumns + 1.0F)));
      try
      {
        this.erM = BackwardSupportUtil.b.a(this.mContext.getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.br.a.getDensity(null));
        GMTrace.o(11483131936768L, 85556);
        return;
      }
      catch (IOException this$1)
      {
        w.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "decode stream default avatar failed. %s", new Object[] { bg.bQW() });
        GMTrace.o(11483131936768L, 85556);
      }
    }
    
    private re mN(int paramInt)
    {
      GMTrace.i(11483534589952L, 85559);
      if (this.kte != null) {
        if (this.kte != null) {
          break label39;
        }
      }
      label39:
      for (int i = 0; paramInt >= i; i = this.kte.size())
      {
        GMTrace.o(11483534589952L, 85559);
        return null;
      }
      re localre = (re)this.kte.get(paramInt);
      GMTrace.o(11483534589952L, 85559);
      return localre;
    }
    
    public final void J(LinkedList<re> paramLinkedList)
    {
      GMTrace.i(11483266154496L, 85557);
      if (this.kte == null) {
        this.kte = new LinkedList();
      }
      if (this.ktf)
      {
        this.kte.clear();
        this.ktf = false;
      }
      this.kte.addAll(paramLinkedList);
      notifyDataSetChanged();
      GMTrace.o(11483266154496L, 85557);
    }
    
    public final int getCount()
    {
      GMTrace.i(11483400372224L, 85558);
      if (this.kte == null) {}
      for (int i = 0; i > 0; i = this.kte.size())
      {
        i = (int)Math.ceil(i / this.mNumColumns);
        GMTrace.o(11483400372224L, 85558);
        return i;
      }
      GMTrace.o(11483400372224L, 85558);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11483668807680L, 85560);
      long l = paramInt;
      GMTrace.o(11483668807680L, 85560);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11483803025408L, 85561);
      Object localObject1;
      Object localObject2;
      if ((paramView == null) || (paramView.getTag() == null))
      {
        localObject1 = new LinearLayout(this.mContext);
        paramView = new AbsListView.LayoutParams(-1, -2);
        ((LinearLayout)localObject1).setBackgroundResource(R.g.bbj);
        ((LinearLayout)localObject1).setOrientation(0);
        ((LinearLayout)localObject1).setLayoutParams(paramView);
        ((LinearLayout)localObject1).setPadding(0, 0, 0, this.kgW);
        localObject2 = new EmojiStoreV2RewardDetailUI.b(EmojiStoreV2RewardDetailUI.this);
        ((EmojiStoreV2RewardDetailUI.b)localObject2).khc = ((LinearLayout)localObject1);
        ((View)localObject1).setTag(localObject2);
        i = 0;
        for (;;)
        {
          paramViewGroup = (ViewGroup)localObject2;
          paramView = (View)localObject1;
          if (i >= this.mNumColumns) {
            break;
          }
          paramView = new LinearLayout.LayoutParams(this.krN, this.krN);
          paramView.leftMargin = this.kgW;
          paramViewGroup = new SquareImageView(this.mContext);
          ((EmojiStoreV2RewardDetailUI.b)localObject2).khc.addView(paramViewGroup, i, paramView);
          i += 1;
        }
      }
      paramViewGroup = (EmojiStoreV2RewardDetailUI.b)paramView.getTag();
      int i = 0;
      if (i < this.mNumColumns)
      {
        int j = this.mNumColumns;
        localObject1 = (SquareImageView)paramViewGroup.khc.getChildAt(i);
        localObject2 = mN(j * paramInt + i);
        if (localObject2 != null)
        {
          ((SquareImageView)localObject1).setVisibility(0);
          if (!bg.nm(((re)localObject2).uhA)) {
            com.tencent.mm.ao.n.Jd().a(((re)localObject2).uhA, (ImageView)localObject1, f.o(EmojiStoreV2RewardDetailUI.c(EmojiStoreV2RewardDetailUI.this), ((re)localObject2).uhA, this.krN));
          }
        }
        for (;;)
        {
          i += 1;
          break;
          ((SquareImageView)localObject1).setImageBitmap(this.erM);
          continue;
          ((SquareImageView)localObject1).setVisibility(8);
        }
      }
      GMTrace.o(11483803025408L, 85561);
      return paramView;
    }
  }
  
  final class b
  {
    LinearLayout khc;
    
    b()
    {
      GMTrace.i(11534671544320L, 85940);
      GMTrace.o(11534671544320L, 85940);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\EmojiStoreV2RewardDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */