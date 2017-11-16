package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.p;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMHorList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class h
{
  public Context context;
  private String jQt;
  private int ljP;
  private ae mHandler;
  private boolean mIsInit;
  public MMHorList mzN;
  a mzO;
  public c mzP;
  
  public h(Context paramContext, View paramView, String paramString)
  {
    GMTrace.i(9645691240448L, 71866);
    this.mIsInit = false;
    this.jQt = "";
    this.mHandler = new ae(Looper.getMainLooper());
    this.mzP = null;
    this.context = paramContext;
    this.mzN = ((MMHorList)paramView);
    this.jQt = paramString;
    aKI();
    GMTrace.o(9645691240448L, 71866);
  }
  
  private void Bl(String paramString)
  {
    GMTrace.i(9646093893632L, 71869);
    w.d("MicroMsg.ShareHeaderAvatarViewMgr", "onMemberEnter, usernmae=%s", new Object[] { paramString });
    if (this.mzO.Bp(paramString))
    {
      GMTrace.o(9646093893632L, 71869);
      return;
    }
    paramString = new b(paramString);
    a locala = this.mzO;
    locala.mzS.add(paramString);
    locala.notifyDataSetChanged();
    this.mzN.invalidate();
    GMTrace.o(9646093893632L, 71869);
  }
  
  private void Bm(String paramString)
  {
    GMTrace.i(9646228111360L, 71870);
    w.d("MicroMsg.ShareHeaderAvatarViewMgr", "onMemberExit, username=%s", new Object[] { paramString });
    a locala;
    int i;
    if (this.mzO.Bp(paramString))
    {
      locala = this.mzO;
      i = 0;
      if (i >= locala.mzS.size()) {
        break label114;
      }
      if (!((b)locala.mzS.get(i)).username.equals(paramString)) {
        break label107;
      }
    }
    for (;;)
    {
      if (i != -1)
      {
        locala.mzS.remove(i);
        locala.notifyDataSetChanged();
      }
      this.mzN.invalidate();
      GMTrace.o(9646228111360L, 71870);
      return;
      label107:
      i += 1;
      break;
      label114:
      i = -1;
    }
  }
  
  private void H(ArrayList<b> paramArrayList)
  {
    GMTrace.i(9645959675904L, 71868);
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb.mzT) {
        localb.aKL();
      }
    }
    this.ljP = a.fromDPToPix(this.context, 60);
    this.mzN.wdi = true;
    this.mzN.wdj = this.ljP;
    this.mzN.wdh = true;
    this.mzN.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(9655757570048L, 71941);
        paramAnonymousAdapterView = (String)paramAnonymousView.getTag();
        if (!bg.nm(paramAnonymousAdapterView))
        {
          g.ork.i(10997, new Object[] { "15", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          if (h.this.mzP != null) {
            h.this.mzP.Bq(paramAnonymousAdapterView);
          }
        }
        GMTrace.o(9655757570048L, 71941);
      }
    });
    this.mzO = new a(paramArrayList);
    this.mzN.setAdapter(this.mzO);
    GMTrace.o(9645959675904L, 71868);
  }
  
  private void aKI()
  {
    GMTrace.i(9645825458176L, 71867);
    Object localObject = l.aKo().Bh(this.jQt);
    w.d("MicroMsg.ShareHeaderAvatarViewMgr", "initAvatarList, memebers.size=%d", new Object[] { Integer.valueOf(((List)localObject).size()) });
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (!bg.nm(str))
      {
        localArrayList1.add(new b(str));
        localArrayList2.add(str);
      }
    }
    H(localArrayList1);
    I(localArrayList2);
    this.mzN.invalidate();
    this.mzO.notifyDataSetChanged();
    GMTrace.o(9645825458176L, 71867);
  }
  
  public final void Bn(String paramString)
  {
    int k = 0;
    GMTrace.i(9646362329088L, 71871);
    w.d("MicroMsg.ShareHeaderAvatarViewMgr", "onMemberTalk, username=%s", new Object[] { paramString });
    final int i;
    if (this.mzO.Bp(paramString))
    {
      this.mzO.Bo(paramString).aKL();
      this.mzO.notifyDataSetChanged();
      this.mzN.invalidate();
      if ((this.mzN.nsy) || (bg.nm(paramString)))
      {
        GMTrace.o(9646362329088L, 71871);
        return;
      }
      a locala = this.mzO;
      i = 0;
      if (i >= locala.mzS.size()) {
        break label252;
      }
      if (!((b)locala.mzS.get(i)).username.equals(paramString)) {
        break label211;
      }
    }
    label178:
    label211:
    label218:
    label247:
    label252:
    for (int j = i;; j = -1)
    {
      w.d("MicroMsg.ShareHeaderAvatarViewMgr", "scrollToTalker, index=%d", new Object[] { Integer.valueOf(j) });
      int m;
      if (j != -1)
      {
        m = j * this.ljP;
        i = this.mzN.wcV;
        if (m >= i) {
          break label218;
        }
      }
      for (;;)
      {
        if (j == 0) {
          i = k;
        }
        for (;;)
        {
          this.mHandler.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9649583554560L, 71895);
              w.d("MicroMsg.ShareHeaderAvatarViewMgr", "scrollToTalker pos=%d", new Object[] { Integer.valueOf(i) });
              h.this.mzN.Ca(i);
              GMTrace.o(9649583554560L, 71895);
            }
          });
          GMTrace.o(9646362329088L, 71871);
          return;
          i += 1;
          break;
          if (m <= i + this.ljP * 3) {
            break label247;
          }
          i = m - this.ljP * 3;
          break label178;
        }
        i = 0;
      }
    }
  }
  
  public final void I(ArrayList<String> paramArrayList)
  {
    GMTrace.i(9646630764544L, 71873);
    w.d("MicroMsg.ShareHeaderAvatarViewMgr", "onRefreshMemberList, members.size=%d", new Object[] { Integer.valueOf(paramArrayList.size()) });
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList1 = new ArrayList();
    Object localObject1 = this.mzO.aKK();
    Object localObject2 = paramArrayList.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      if (((ArrayList)localObject1).indexOf(str) == -1) {
        localArrayList2.add(str);
      }
    }
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      if (paramArrayList.indexOf(localObject2) == -1) {
        localArrayList1.add(localObject2);
      }
    }
    w.d("MicroMsg.ShareHeaderAvatarViewMgr", "onRefreshMemberList, newMember.size=%d, removeMember.size=%d", new Object[] { Integer.valueOf(localArrayList2.size()), Integer.valueOf(localArrayList1.size()) });
    if (localArrayList2.size() > 0)
    {
      paramArrayList = localArrayList2.iterator();
      while (paramArrayList.hasNext()) {
        Bl((String)paramArrayList.next());
      }
    }
    if (localArrayList1.size() > 0)
    {
      paramArrayList = localArrayList1.iterator();
      while (paramArrayList.hasNext()) {
        Bm((String)paramArrayList.next());
      }
    }
    GMTrace.o(9646630764544L, 71873);
  }
  
  public final void aKJ()
  {
    GMTrace.i(9646496546816L, 71872);
    a locala = this.mzO;
    Iterator localIterator = locala.mzS.iterator();
    while (localIterator.hasNext()) {
      ((b)localIterator.next()).aKM();
    }
    locala.notifyDataSetChanged();
    this.mzN.invalidate();
    GMTrace.o(9646496546816L, 71872);
  }
  
  final class a
    extends BaseAdapter
  {
    ArrayList<h.b> mzS;
    
    public a()
    {
      GMTrace.i(9715887112192L, 72389);
      this.mzS = new ArrayList();
      Collection localCollection;
      this.mzS.addAll(localCollection);
      GMTrace.o(9715887112192L, 72389);
    }
    
    public final h.b Bo(String paramString)
    {
      GMTrace.i(9716558200832L, 72394);
      int i = 0;
      while (i < this.mzS.size())
      {
        if (((h.b)this.mzS.get(i)).username.equals(paramString))
        {
          paramString = (h.b)this.mzS.get(i);
          GMTrace.o(9716558200832L, 72394);
          return paramString;
        }
        i += 1;
      }
      GMTrace.o(9716558200832L, 72394);
      return null;
    }
    
    public final boolean Bp(String paramString)
    {
      GMTrace.i(9716692418560L, 72395);
      int i = 0;
      while (i < this.mzS.size())
      {
        if (((h.b)this.mzS.get(i)).username.equals(paramString))
        {
          GMTrace.o(9716692418560L, 72395);
          return true;
        }
        i += 1;
      }
      GMTrace.o(9716692418560L, 72395);
      return false;
    }
    
    public final ArrayList<String> aKK()
    {
      GMTrace.i(9716826636288L, 72396);
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.mzS.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(((h.b)localIterator.next()).username);
      }
      GMTrace.o(9716826636288L, 72396);
      return localArrayList;
    }
    
    public final int getCount()
    {
      GMTrace.i(9716021329920L, 72390);
      int i = this.mzS.size();
      GMTrace.o(9716021329920L, 72390);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(9716155547648L, 72391);
      Object localObject = this.mzS.get(paramInt);
      GMTrace.o(9716155547648L, 72391);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(9716289765376L, 72392);
      long l = paramInt;
      GMTrace.o(9716289765376L, 72392);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(9716423983104L, 72393);
      paramView = ((h.b)this.mzS.get(paramInt)).mzV.mzW;
      GMTrace.o(9716423983104L, 72393);
      return paramView;
    }
  }
  
  final class b
  {
    boolean mzT;
    private LinearLayout.LayoutParams mzU;
    a mzV;
    String username;
    
    public b(String paramString)
    {
      GMTrace.i(9665555464192L, 72014);
      this.mzT = false;
      this.username = paramString;
      if (bg.nm(paramString))
      {
        w.e("MicroMsg.ShareHeaderAvatarViewMgr", "init HeaderAvatar, username can't not be null");
        GMTrace.o(9665555464192L, 72014);
        return;
      }
      this.mzV = new a();
      this$1 = (LayoutInflater)h.this.context.getSystemService("layout_inflater");
      this.mzV.mzW = ((RelativeLayout)h.this.inflate(R.i.cAQ, null));
      this.mzV.hrI = ((ImageView)this.mzV.mzW.findViewById(R.h.bfk));
      a.b.n(this.mzV.hrI, this.username);
      this.mzV.mzW.setTag(this.username);
      this.mzU = new LinearLayout.LayoutParams(-2, -2);
      this.mzU.leftMargin = BackwardSupportUtil.b.a(h.this.context, 5.0F);
      this.mzU.rightMargin = BackwardSupportUtil.b.a(h.this.context, 5.0F);
      this.mzU.gravity = 17;
      GMTrace.o(9665555464192L, 72014);
    }
    
    public final void aKL()
    {
      GMTrace.i(9665689681920L, 72015);
      w.i("MicroMsg.ShareHeaderAvatarViewMgr", "setTalking, username=%s", new Object[] { this.username });
      this.mzV.mzW.setBackgroundResource(R.g.aXK);
      this.mzV.mzW.invalidate();
      this.mzT = true;
      GMTrace.o(9665689681920L, 72015);
    }
    
    public final void aKM()
    {
      GMTrace.i(9665823899648L, 72016);
      w.i("MicroMsg.ShareHeaderAvatarViewMgr", "exitTalking, username=%s", new Object[] { this.username });
      this.mzV.mzW.setBackgroundResource(R.g.aXJ);
      this.mzV.mzW.invalidate();
      this.mzT = false;
      GMTrace.o(9665823899648L, 72016);
    }
    
    final class a
    {
      ImageView hrI;
      RelativeLayout mzW;
      
      a()
      {
        GMTrace.i(9653878521856L, 71927);
        GMTrace.o(9653878521856L, 71927);
      }
    }
  }
  
  public static abstract interface c
  {
    public abstract void Bq(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */