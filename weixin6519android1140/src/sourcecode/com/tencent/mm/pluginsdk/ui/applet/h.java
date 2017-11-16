package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.comm.a.c;
import com.tencent.mm.plugin.comm.a.d;
import com.tencent.mm.plugin.comm.a.e;
import com.tencent.mm.plugin.comm.a.f;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class h
  extends BaseAdapter
{
  public static int txg;
  public static int txh;
  boolean eMr;
  private List<String> eNC;
  com.tencent.mm.storage.q jNF;
  boolean jPB;
  c jQF;
  private List<x> jej;
  private Context mContext;
  public boolean txA;
  private boolean txB;
  private boolean txC;
  boolean txD;
  public boolean txE;
  a txi;
  private ArrayList<x> txj;
  boolean txk;
  public boolean txl;
  public boolean txm;
  private List<Object> txn;
  private Set<String> txo;
  int txp;
  int txq;
  d txr;
  public boolean txs;
  public boolean txt;
  public boolean txu;
  private boolean txv;
  boolean txw;
  int txx;
  String txy;
  private final int txz;
  String username;
  
  static
  {
    GMTrace.i(941268926464L, 7013);
    txg = 44;
    txh = 5;
    GMTrace.o(941268926464L, 7013);
  }
  
  public h(Context paramContext)
  {
    GMTrace.i(939389878272L, 6999);
    this.eNC = new ArrayList();
    this.txj = new ArrayList();
    this.txk = false;
    this.txl = false;
    this.txm = false;
    this.jej = new ArrayList();
    this.txn = new ArrayList();
    this.txo = new HashSet();
    this.txp = 0;
    this.txq = 0;
    this.txs = false;
    this.txt = false;
    this.txu = false;
    this.txv = true;
    this.txw = false;
    this.txx = 12;
    this.txA = false;
    this.jQF = null;
    this.txB = true;
    this.txC = false;
    this.txD = true;
    this.txE = false;
    this.mContext = paramContext;
    this.jPB = false;
    this.txz = paramContext.getResources().getDimensionPixelSize(a.c.aPv);
    GMTrace.o(939389878272L, 6999);
  }
  
  private void bIC()
  {
    GMTrace.i(940195184640L, 7005);
    if (this.txi != null) {
      this.txi.bIC();
    }
    GMTrace.o(940195184640L, 7005);
  }
  
  private void bLI()
  {
    GMTrace.i(939926749184L, 7003);
    if (this.txj == null)
    {
      GMTrace.o(939926749184L, 7003);
      return;
    }
    w.d("MicroMsg.ContactsListArchAdapter", "initData memberContactList.size %d", new Object[] { Integer.valueOf(this.txj.size()) });
    this.txo.clear();
    this.jej.clear();
    if (this.txj.size() > 0)
    {
      Iterator localIterator = this.txj.iterator();
      while (localIterator.hasNext())
      {
        x localx = (x)localIterator.next();
        this.jej.add(localx);
        this.txo.add(localx.field_username);
      }
    }
    this.txq = this.jej.size();
    GMTrace.o(939926749184L, 7003);
  }
  
  private b cV(View paramView)
  {
    GMTrace.i(940329402368L, 7006);
    b localb = new b();
    localb.txF = ((ImageView)paramView.findViewById(a.e.bYV));
    localb.hqG = ((ImageView)paramView.findViewById(a.e.bZe));
    localb.oKs = ((ImageView)paramView.findViewById(a.e.kbt));
    localb.jpV = ((TextView)paramView.findViewById(a.e.kbv));
    localb.jQH = ((TextView)paramView.findViewById(a.e.bZd));
    localb.jpY = ((ImageView)paramView.findViewById(a.e.kbu));
    localb.hqG.setScaleType(ImageView.ScaleType.CENTER_CROP);
    paramView.setTag(localb);
    GMTrace.o(940329402368L, 7006);
    return localb;
  }
  
  public final void ac(ArrayList<x> paramArrayList)
  {
    GMTrace.i(939792531456L, 7002);
    this.txv = false;
    this.txj = paramArrayList;
    GMTrace.o(939792531456L, 7002);
  }
  
  public final void bA(List<String> paramList)
  {
    GMTrace.i(939658313728L, 7001);
    this.txv = true;
    this.eNC = paramList;
    GMTrace.o(939658313728L, 7001);
  }
  
  public final boolean bLH()
  {
    GMTrace.i(939524096000L, 7000);
    if (this.txk)
    {
      bool = this.txm;
      GMTrace.o(939524096000L, 7000);
      return bool;
    }
    boolean bool = s.eb(this.username);
    GMTrace.o(939524096000L, 7000);
    return bool;
  }
  
  public final int getCount()
  {
    GMTrace.i(940866273280L, 7010);
    if (this.txw)
    {
      i = Math.min(this.txx, this.txp);
      GMTrace.o(940866273280L, 7010);
      return i;
    }
    int i = this.txp;
    GMTrace.o(940866273280L, 7010);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(941000491008L, 7011);
    if (paramInt < this.txq)
    {
      if (this.txk)
      {
        localObject = this.txn.get(paramInt);
        GMTrace.o(941000491008L, 7011);
        return localObject;
      }
      Object localObject = this.jej.get(paramInt);
      GMTrace.o(941000491008L, 7011);
      return localObject;
    }
    GMTrace.o(941000491008L, 7011);
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(941134708736L, 7012);
    long l = paramInt;
    GMTrace.o(941134708736L, 7012);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(940463620096L, 7007);
    x localx;
    int i;
    if (paramInt < this.txq) {
      if (this.txk)
      {
        paramViewGroup = getItem(paramInt);
        localx = null;
        i = 0;
      }
    }
    for (;;)
    {
      View localView;
      b localb;
      if (paramView == null)
      {
        localView = View.inflate(this.mContext, a.f.cET, null);
        localb = cV(localView);
      }
      for (;;)
      {
        label61:
        int j;
        if ((txh == 4) || (this.txE))
        {
          j = this.mContext.getResources().getDimensionPixelSize(a.c.aQA);
          localb.hqG.getLayoutParams().height = j;
          localb.hqG.getLayoutParams().width = j;
          label116:
          localb.txF.setVisibility(8);
          if (i != 0) {
            break label833;
          }
          localb.hqG.setVisibility(0);
          if (!this.eMr) {
            break label633;
          }
          if (bg.nm(localx.field_conRemark)) {
            break label603;
          }
          paramView = localx.field_conRemark;
          label164:
          Object localObject = paramView;
          if (bg.nm(paramView)) {
            localObject = localx.field_conRemark;
          }
          paramView = (View)localObject;
          if (bg.nm((String)localObject)) {
            paramView = localx.vj();
          }
          paramView = com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, paramView, localb.jpV.getTextSize());
          label215:
          if (!(paramView instanceof SpannableString)) {
            break label692;
          }
          localb.jpV.setVisibility(8);
          localb.jQH.setVisibility(0);
          localb.jQH.setText(paramView);
          label250:
          localb.hqG.setContentDescription("");
          if (!this.txk) {
            break label723;
          }
          com.tencent.mm.ao.n.Jd().a(n.a.txR.by(paramViewGroup), localb.hqG, this.jQF);
          localb.hqG.setBackgroundDrawable(null);
          label301:
          if (!this.txk) {
            break label779;
          }
          if ((!this.jPB) || ((this.txy != null) && (this.txy.equals(n.a.txR.bz(paramViewGroup))))) {
            break label766;
          }
          localb.oKs.setVisibility(0);
        }
        for (;;)
        {
          if ((!this.txk) || (paramViewGroup == null)) {
            localb.jpY.setVisibility(8);
          }
          localb.jHw = i;
          GMTrace.o(940463620096L, 7007);
          return localView;
          localx = (x)getItem(paramInt);
          paramViewGroup = null;
          i = 0;
          break;
          if ((paramInt == this.txq) && (this.txt))
          {
            paramViewGroup = null;
            localx = null;
            i = 3;
            break;
          }
          if ((paramInt == this.txq + 1) && (this.txs))
          {
            paramViewGroup = null;
            localx = null;
            i = 4;
            break;
          }
          if ((paramInt == this.txq + 1) && (this.txu) && (!this.txs))
          {
            paramViewGroup = null;
            localx = null;
            i = 5;
            break;
          }
          if ((paramInt != this.txq + 2) || (!this.txu) || (!this.txs)) {
            break label1418;
          }
          paramViewGroup = null;
          localx = null;
          i = 5;
          break;
          localb = (b)paramView.getTag();
          if (localb != null) {
            break label1412;
          }
          localb = cV(paramView);
          localView = paramView;
          break label61;
          j = this.mContext.getResources().getDimensionPixelSize(a.c.aQy);
          localb.hqG.getLayoutParams().height = j;
          localb.hqG.getLayoutParams().width = j;
          break label116;
          label603:
          paramView = localx.field_username;
          if (this.jNF == null)
          {
            paramView = null;
            break label164;
          }
          paramView = this.jNF.fs(paramView);
          break label164;
          label633:
          if (this.txk)
          {
            paramView = com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, n.a.txR.bx(paramViewGroup), localb.jpV.getTextSize());
            break label215;
          }
          paramView = com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, localx.vk(), localb.jpV.getTextSize());
          break label215;
          label692:
          localb.jpV.setVisibility(0);
          localb.jQH.setVisibility(8);
          localb.jpV.setText(paramView);
          break label250;
          label723:
          a.b.a(localb.hqG, localx.field_username);
          paramView = (com.tencent.mm.pluginsdk.ui.a)localb.hqG.getDrawable();
          if (this.txr == null) {
            break label301;
          }
          this.txr.a(paramView);
          break label301;
          label766:
          localb.oKs.setVisibility(8);
          continue;
          label779:
          if ((this.jPB) && ((this.txy == null) || (!this.txy.equals(localx.field_username))))
          {
            localb.oKs.setVisibility(0);
          }
          else
          {
            localb.oKs.setVisibility(8);
            continue;
            label833:
            if (i == 3)
            {
              paramView = localb.jpV;
              if (paramInt == 0)
              {
                j = 8;
                label853:
                paramView.setVisibility(j);
                paramView = localb.jQH;
                if (paramInt != 0) {
                  break label912;
                }
              }
              label912:
              for (paramInt = 8;; paramInt = 4)
              {
                paramView.setVisibility(paramInt);
                localb.oKs.setVisibility(8);
                if (!this.jPB) {
                  break label917;
                }
                localb.hqG.setVisibility(4);
                break;
                j = 4;
                break label853;
              }
              label917:
              localb.hqG.setVisibility(0);
              if (this.txk)
              {
                com.tencent.mm.ao.n.Jd().a("", localb.hqG, this.jQF);
                localb.hqG.setBackgroundDrawable(null);
              }
              localb.hqG.setImageResource(a.d.aTZ);
              localb.hqG.setContentDescription(this.mContext.getString(a.h.kbU));
            }
            else if (i == 4)
            {
              paramView = localb.jpV;
              if (1 == paramInt)
              {
                j = 8;
                label1013:
                paramView.setVisibility(j);
                paramView = localb.jQH;
                if (1 != paramInt) {
                  break label1080;
                }
              }
              label1080:
              for (paramInt = 8;; paramInt = 4)
              {
                paramView.setVisibility(paramInt);
                localb.oKs.setVisibility(8);
                if ((!this.jPB) && (this.txq != 0)) {
                  break label1085;
                }
                localb.hqG.setVisibility(4);
                break;
                j = 4;
                break label1013;
              }
              label1085:
              localb.hqG.setVisibility(0);
              if (this.txk)
              {
                com.tencent.mm.ao.n.Jd().a("", localb.hqG, this.jQF);
                localb.hqG.setBackgroundDrawable(null);
              }
              localb.hqG.setImageResource(a.d.aUa);
              localb.hqG.setContentDescription(this.mContext.getString(a.h.kbZ));
            }
            else if (i == 5)
            {
              paramView = localb.jpV;
              if (paramInt == 0)
              {
                j = 8;
                label1180:
                paramView.setVisibility(j);
                paramView = localb.jQH;
                if (paramInt != 0) {
                  break label1239;
                }
              }
              label1239:
              for (paramInt = 8;; paramInt = 4)
              {
                paramView.setVisibility(paramInt);
                localb.oKs.setVisibility(8);
                if (!this.jPB) {
                  break label1244;
                }
                localb.hqG.setVisibility(4);
                break;
                j = 4;
                break label1180;
              }
              label1244:
              localb.hqG.setVisibility(0);
              if (this.txk)
              {
                com.tencent.mm.ao.n.Jd().a("", localb.hqG, this.jQF);
                localb.hqG.setBackgroundDrawable(null);
              }
              localb.hqG.setImageResource(a.d.kbn);
              localb.hqG.setContentDescription(this.mContext.getString(a.h.kcK));
            }
            else if (i == 2)
            {
              if (this.txk) {
                com.tencent.mm.ao.n.Jd().a("", localb.hqG, this.jQF);
              }
              localb.jpV.setVisibility(4);
              localb.jQH.setVisibility(4);
              localb.oKs.setVisibility(8);
              localb.hqG.setVisibility(4);
              localb.hqG.setImageResource(a.d.aXW);
              localb.hqG.setBackgroundResource(a.d.aXW);
            }
          }
        }
        label1412:
        localView = paramView;
      }
      label1418:
      paramViewGroup = null;
      localx = null;
      i = 2;
    }
  }
  
  public final void notifyChanged()
  {
    GMTrace.i(940732055552L, 7009);
    label383:
    label567:
    int i;
    if ((this.eNC != null) || (this.txj != null))
    {
      if (!this.txv) {
        break label1347;
      }
      if (this.eNC != null)
      {
        w.d("MicroMsg.ContactsListArchAdapter", "initData memberList.size %d", new Object[] { Integer.valueOf(this.eNC.size()) });
        this.txo.clear();
        this.jej.clear();
        this.txn.clear();
        if (this.eNC.size() > 0)
        {
          Object localObject1 = this.eNC.iterator();
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (String)((Iterator)localObject1).next();
            if (this.txk) {
              this.txn.add(n.a.txR.Pg((String)localObject2));
            }
            for (;;)
            {
              this.txo.add(localObject2);
              break;
              localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE((String)localObject2);
              if ((localObject3 != null) && (!bg.nm(((af)localObject3).field_username)) && (((af)localObject3).field_username.equals(localObject2))) {
                this.jej.add(localObject3);
              } else {
                this.jej.add(new x(this.username));
              }
            }
          }
          int j;
          if ((this.txB) && (!bg.nm(this.txy)) && (this.eNC.contains(this.txy)))
          {
            if (this.txk)
            {
              localObject1 = this.txn.iterator();
              while (((Iterator)localObject1).hasNext())
              {
                localObject2 = ((Iterator)localObject1).next();
                if (this.txy.equals(n.a.txR.bz(localObject2)))
                {
                  this.txn.remove(localObject2);
                  this.txn.add(0, localObject2);
                  break label690;
                }
              }
            }
          }
          else
          {
            if ((!this.txC) || (this.txk)) {
              break label1124;
            }
            localObject1 = bg.aq((String)com.tencent.mm.kernel.h.xy().xh().get(2, null), "");
            if (this.eNC.contains(localObject1))
            {
              this.txo.remove(localObject1);
              localObject2 = this.jej.iterator();
              while (((Iterator)localObject2).hasNext())
              {
                localObject3 = (x)((Iterator)localObject2).next();
                if (((String)localObject1).equals(((af)localObject3).field_username)) {
                  this.jej.remove(localObject3);
                }
              }
            }
            localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE((String)localObject1);
            if ((localObject2 == null) || (bg.nm(((af)localObject2).field_username)) || (!((af)localObject2).field_username.equals(localObject1))) {
              break label754;
            }
            this.jej.add(1, localObject2);
            this.txo.add(localObject1);
            if ((!this.txD) || (this.jej.size() < 3)) {
              break label1124;
            }
            j = this.jej.size();
            localObject1 = new LinkedList();
            i = 0;
            label620:
            if (i >= j) {
              break label901;
            }
            localObject2 = (x)this.jej.get(i);
            if (((af)localObject2).field_showHead <= 0) {
              break label776;
            }
            ((LinkedList)localObject1).add(((af)localObject2).field_showHead);
          }
          for (;;)
          {
            i += 1;
            break label620;
            localObject1 = this.jej.iterator();
            label690:
            if (!((Iterator)localObject1).hasNext()) {
              break label383;
            }
            localObject2 = (x)((Iterator)localObject1).next();
            if (!this.txy.equals(((af)localObject2).field_username)) {
              break;
            }
            this.jej.remove(localObject2);
            this.jej.add(0, localObject2);
            break label383;
            label754:
            this.jej.add(1, new x((String)localObject1));
            break label567;
            label776:
            if (!bg.nm(((af)localObject2).field_conRemark)) {
              ((LinkedList)localObject1).add(((af)localObject2).field_conRemark);
            } else if (!bg.nm(((af)localObject2).field_conRemarkPYShort)) {
              ((LinkedList)localObject1).add(((af)localObject2).field_conRemarkPYShort);
            } else if (!bg.nm(((af)localObject2).field_conRemarkPYFull)) {
              ((LinkedList)localObject1).add(((af)localObject2).field_conRemarkPYFull);
            } else if (!bg.nm(((x)localObject2).qR())) {
              ((LinkedList)localObject1).add(((x)localObject2).qR());
            } else if (!bg.nm(((af)localObject2).field_username)) {
              ((LinkedList)localObject1).add(((af)localObject2).field_username);
            }
          }
          label901:
          w.v("MicroMsg.ContactsListArchAdapter", "klem, order list:%s", new Object[] { ((LinkedList)localObject1).toString() });
          Object localObject2 = new ArrayList();
          ((List)localObject2).add(this.jej.get(0));
          ((List)localObject2).add(this.jej.get(1));
          Object localObject3 = new LinkedList();
          ((List)localObject3).add(((LinkedList)localObject1).get(0));
          ((List)localObject3).add(((LinkedList)localObject1).get(0));
          int k = this.jej.size();
          i = 2;
          while (i < k)
          {
            String str = (String)((LinkedList)localObject1).get(i);
            int m = ((List)localObject2).size();
            j = 1;
            while ((j < m) && (str.compareToIgnoreCase((String)((List)localObject3).get(j)) >= 0)) {
              j += 1;
            }
            ((List)localObject3).add(j, str);
            ((List)localObject2).add(j, this.jej.get(i));
            i += 1;
          }
          this.jej.clear();
          this.jej = ((List)localObject2);
        }
        label1124:
        if (!this.txk) {
          break label1210;
        }
        this.txq = this.txn.size();
      }
      if (this.txq != 0) {
        break label1354;
      }
      this.txp = txh;
    }
    for (;;)
    {
      w.d("MicroMsg.ContactsListArchAdapter", "Number Size  contactSize :" + this.txq + " realySize : " + this.txp);
      bIC();
      GMTrace.o(940732055552L, 7009);
      return;
      label1210:
      if (this.eMr)
      {
        if ((bg.nm(this.txy)) || ((this.txy != null) && (!this.txy.equals(com.tencent.mm.y.q.zE()))))
        {
          if (this.jej.size() >= txg) {}
          for (i = txg;; i = this.jej.size())
          {
            this.txq = i;
            break;
          }
        }
        if (this.jej.size() >= txg - 1) {}
        for (i = txg - 1;; i = this.jej.size())
        {
          this.txq = i;
          break;
        }
      }
      this.txq = this.jej.size();
      break;
      label1347:
      bLI();
      break;
      label1354:
      if ((this.txt) && (this.txs) && (this.txu)) {
        this.txp = (((this.txq + 2) / txh + 1) * txh);
      } else if (((this.txt) && (this.txs) && (!this.txu)) || ((this.txt) && (!this.txs) && (this.txu)) || ((!this.txt) && (this.txs) && (this.txu))) {
        this.txp = (((this.txq + 1) / txh + 1) * txh);
      } else if (((this.txt) && (!this.txs) && (!this.txu)) || ((!this.txt) && (this.txs) && (!this.txu)) || ((!this.txt) && (!this.txs) && (this.txu))) {
        this.txp = ((this.txq / txh + 1) * txh);
      } else if ((!this.txt) && (!this.txs) && (!this.txu)) {
        this.txp = (((this.txq - 1) / txh + 1) * txh);
      }
    }
  }
  
  public final boolean zi(int paramInt)
  {
    GMTrace.i(940060966912L, 7004);
    if (!this.jPB)
    {
      if (paramInt < this.txq)
      {
        this.jPB = true;
        bIC();
      }
      GMTrace.o(940060966912L, 7004);
      return true;
    }
    GMTrace.o(940060966912L, 7004);
    return false;
  }
  
  public final boolean zj(int paramInt)
  {
    GMTrace.i(940597837824L, 7008);
    if (paramInt < this.txq)
    {
      GMTrace.o(940597837824L, 7008);
      return true;
    }
    GMTrace.o(940597837824L, 7008);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void bIC();
  }
  
  final class b
  {
    public ImageView hqG;
    public int jHw;
    public TextView jQH;
    public TextView jpV;
    public ImageView jpY;
    public ImageView oKs;
    public ImageView txF;
    
    b()
    {
      GMTrace.i(959925190656L, 7152);
      GMTrace.o(959925190656L, 7152);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */