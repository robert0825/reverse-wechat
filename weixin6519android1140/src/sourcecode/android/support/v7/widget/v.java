package android.support.v7.widget;

import android.support.v4.a.a;
import android.support.v4.view.ai;
import android.support.v4.view.am;
import android.support.v4.view.z;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class v
  extends aj
{
  private ArrayList<RecyclerView.t> PP = new ArrayList();
  private ArrayList<RecyclerView.t> PQ = new ArrayList();
  private ArrayList<b> PR = new ArrayList();
  private ArrayList<a> PS = new ArrayList();
  public ArrayList<ArrayList<RecyclerView.t>> PT = new ArrayList();
  public ArrayList<ArrayList<b>> PU = new ArrayList();
  public ArrayList<ArrayList<a>> PV = new ArrayList();
  public ArrayList<RecyclerView.t> PW = new ArrayList();
  public ArrayList<RecyclerView.t> PX = new ArrayList();
  public ArrayList<RecyclerView.t> PY = new ArrayList();
  public ArrayList<RecyclerView.t> PZ = new ArrayList();
  
  private void a(a parama)
  {
    if (parama.Qm != null) {
      a(parama, parama.Qm);
    }
    if (parama.Qn != null) {
      a(parama, parama.Qn);
    }
  }
  
  private void a(List<a> paramList, RecyclerView.t paramt)
  {
    int i = paramList.size() - 1;
    while (i >= 0)
    {
      a locala = (a)paramList.get(i);
      if ((a(locala, paramt)) && (locala.Qm == null) && (locala.Qn == null)) {
        paramList.remove(locala);
      }
      i -= 1;
    }
  }
  
  private boolean a(a parama, RecyclerView.t paramt)
  {
    if (parama.Qn == paramt) {
      parama.Qn = null;
    }
    for (;;)
    {
      z.d(paramt.UU, 1.0F);
      z.b(paramt.UU, 0.0F);
      z.c(paramt.UU, 0.0F);
      k(paramt);
      return true;
      if (parama.Qm != paramt) {
        break;
      }
      parama.Qm = null;
    }
    return false;
  }
  
  private void e(RecyclerView.t paramt)
  {
    a.v(paramt.UU);
    d(paramt);
  }
  
  private static void h(List<RecyclerView.t> paramList)
  {
    int i = paramList.size() - 1;
    while (i >= 0)
    {
      z.V(((RecyclerView.t)paramList.get(i)).UU).cancel();
      i -= 1;
    }
  }
  
  public boolean a(RecyclerView.t paramt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = paramt.UU;
    paramInt1 = (int)(paramInt1 + z.R(paramt.UU));
    paramInt2 = (int)(paramInt2 + z.S(paramt.UU));
    e(paramt);
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    if ((i == 0) && (j == 0))
    {
      q(paramt);
      return false;
    }
    if (i != 0) {
      z.b(localView, -i);
    }
    if (j != 0) {
      z.c(localView, -j);
    }
    this.PR.add(new b(paramt, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  public boolean a(RecyclerView.t paramt1, RecyclerView.t paramt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramt1 == paramt2) {
      return a(paramt1, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    float f1 = z.R(paramt1.UU);
    float f2 = z.S(paramt1.UU);
    float f3 = z.H(paramt1.UU);
    e(paramt1);
    int i = (int)(paramInt3 - paramInt1 - f1);
    int j = (int)(paramInt4 - paramInt2 - f2);
    z.b(paramt1.UU, f1);
    z.c(paramt1.UU, f2);
    z.d(paramt1.UU, f3);
    if (paramt2 != null)
    {
      e(paramt2);
      z.b(paramt2.UU, -i);
      z.c(paramt2.UU, -j);
      z.d(paramt2.UU, 0.0F);
    }
    this.PS.add(new a(paramt1, paramt2, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  public boolean a(RecyclerView.t paramt, List<Object> paramList)
  {
    return (!paramList.isEmpty()) || (super.a(paramt, paramList));
  }
  
  public boolean b(RecyclerView.t paramt)
  {
    e(paramt);
    this.PP.add(paramt);
    return true;
  }
  
  public boolean c(RecyclerView.t paramt)
  {
    e(paramt);
    z.d(paramt.UU, 0.0F);
    this.PQ.add(paramt);
    return true;
  }
  
  public void d(RecyclerView.t paramt)
  {
    View localView = paramt.UU;
    z.V(localView).cancel();
    int i = this.PR.size() - 1;
    while (i >= 0)
    {
      if (((b)this.PR.get(i)).Qs == paramt)
      {
        z.c(localView, 0.0F);
        z.b(localView, 0.0F);
        q(paramt);
        this.PR.remove(i);
      }
      i -= 1;
    }
    a(this.PS, paramt);
    if (this.PP.remove(paramt))
    {
      z.d(localView, 1.0F);
      k(paramt);
    }
    if (this.PQ.remove(paramt))
    {
      z.d(localView, 1.0F);
      k(paramt);
    }
    i = this.PV.size() - 1;
    ArrayList localArrayList;
    while (i >= 0)
    {
      localArrayList = (ArrayList)this.PV.get(i);
      a(localArrayList, paramt);
      if (localArrayList.isEmpty()) {
        this.PV.remove(i);
      }
      i -= 1;
    }
    i = this.PU.size() - 1;
    if (i >= 0)
    {
      localArrayList = (ArrayList)this.PU.get(i);
      int j = localArrayList.size() - 1;
      for (;;)
      {
        if (j >= 0)
        {
          if (((b)localArrayList.get(j)).Qs != paramt) {
            break label293;
          }
          z.c(localView, 0.0F);
          z.b(localView, 0.0F);
          q(paramt);
          localArrayList.remove(j);
          if (localArrayList.isEmpty()) {
            this.PU.remove(i);
          }
        }
        i -= 1;
        break;
        label293:
        j -= 1;
      }
    }
    i = this.PT.size() - 1;
    while (i >= 0)
    {
      localArrayList = (ArrayList)this.PT.get(i);
      if (localArrayList.remove(paramt))
      {
        z.d(localView, 1.0F);
        k(paramt);
        if (localArrayList.isEmpty()) {
          this.PT.remove(i);
        }
      }
      i -= 1;
    }
    this.PY.remove(paramt);
    this.PW.remove(paramt);
    this.PZ.remove(paramt);
    this.PX.remove(paramt);
    eJ();
  }
  
  public void eI()
  {
    int i;
    int j;
    label24:
    int k;
    if (!this.PP.isEmpty())
    {
      i = 1;
      if (this.PR.isEmpty()) {
        break label72;
      }
      j = 1;
      if (this.PS.isEmpty()) {
        break label77;
      }
      k = 1;
      label36:
      if (this.PQ.isEmpty()) {
        break label82;
      }
    }
    label72:
    label77:
    label82:
    for (int m = 1;; m = 0)
    {
      if ((i != 0) || (j != 0) || (m != 0) || (k != 0)) {
        break label88;
      }
      return;
      i = 0;
      break;
      j = 0;
      break label24;
      k = 0;
      break label36;
    }
    label88:
    final Object localObject1 = this.PP.iterator();
    final Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (RecyclerView.t)((Iterator)localObject1).next();
      final ai localai = z.V(((RecyclerView.t)localObject2).UU);
      this.PY.add(localObject2);
      localai.d(this.TX).p(0.0F).a(new c()
      {
        public final void p(View paramAnonymousView)
        {
          v.this.r(localObject2);
        }
        
        public final void q(View paramAnonymousView)
        {
          localai.a(null);
          z.d(paramAnonymousView, 1.0F);
          v.this.k(localObject2);
          v.this.PY.remove(localObject2);
          v.this.eJ();
        }
      }).start();
    }
    this.PP.clear();
    label260:
    label340:
    long l1;
    label415:
    long l2;
    if (j != 0)
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.PR);
      this.PU.add(localObject1);
      this.PR.clear();
      localObject2 = new Runnable()
      {
        public final void run()
        {
          Iterator localIterator = localObject1.iterator();
          while (localIterator.hasNext())
          {
            Object localObject = (v.b)localIterator.next();
            v localv = v.this;
            RecyclerView.t localt = ((v.b)localObject).Qs;
            int k = ((v.b)localObject).Qo;
            int i = ((v.b)localObject).Qp;
            int m = ((v.b)localObject).Qq;
            int j = ((v.b)localObject).Qr;
            localObject = localt.UU;
            k = m - k;
            i = j - i;
            if (k != 0) {
              z.V((View)localObject).q(0.0F);
            }
            if (i != 0) {
              z.V((View)localObject).r(0.0F);
            }
            localObject = z.V((View)localObject);
            localv.PX.add(localt);
            ((ai)localObject).d(localv.TY).a(new v.6(localv, localt, k, i, (ai)localObject)).start();
          }
          localObject1.clear();
          v.this.PU.remove(localObject1);
        }
      };
      if (i != 0) {
        z.a(((b)((ArrayList)localObject1).get(0)).Qs.UU, (Runnable)localObject2, this.TX);
      }
    }
    else
    {
      if (k != 0)
      {
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).addAll(this.PS);
        this.PV.add(localObject1);
        this.PS.clear();
        localObject2 = new Runnable()
        {
          public final void run()
          {
            Iterator localIterator = localObject1.iterator();
            if (localIterator.hasNext())
            {
              v.a locala = (v.a)localIterator.next();
              v localv = v.this;
              Object localObject1 = locala.Qm;
              if (localObject1 == null)
              {
                localObject1 = null;
                label46:
                localObject2 = locala.Qn;
                if (localObject2 == null) {
                  break label223;
                }
              }
              label223:
              for (Object localObject2 = ((RecyclerView.t)localObject2).UU;; localObject2 = null)
              {
                if (localObject1 != null)
                {
                  localObject1 = z.V((View)localObject1).d(localv.TZ);
                  localv.PZ.add(locala.Qm);
                  ((ai)localObject1).q(locala.Qq - locala.Qo);
                  ((ai)localObject1).r(locala.Qr - locala.Qp);
                  ((ai)localObject1).p(0.0F).a(new v.7(localv, locala, (ai)localObject1)).start();
                }
                if (localObject2 == null) {
                  break;
                }
                localObject1 = z.V((View)localObject2);
                localv.PZ.add(locala.Qn);
                ((ai)localObject1).q(0.0F).r(0.0F).d(localv.TZ).p(1.0F).a(new v.8(localv, locala, (ai)localObject1, (View)localObject2)).start();
                break;
                localObject1 = ((RecyclerView.t)localObject1).UU;
                break label46;
              }
            }
            localObject1.clear();
            v.this.PV.remove(localObject1);
          }
        };
        if (i == 0) {
          break label477;
        }
        z.a(((a)((ArrayList)localObject1).get(0)).Qm.UU, (Runnable)localObject2, this.TX);
      }
      if (m == 0) {
        break label485;
      }
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.PQ);
      this.PT.add(localObject1);
      this.PQ.clear();
      localObject2 = new Runnable()
      {
        public final void run()
        {
          Iterator localIterator = localObject1.iterator();
          while (localIterator.hasNext())
          {
            RecyclerView.t localt = (RecyclerView.t)localIterator.next();
            v localv = v.this;
            ai localai = z.V(localt.UU);
            localv.PW.add(localt);
            localai.p(1.0F).d(localv.TW).a(new v.5(localv, localt, localai)).start();
          }
          localObject1.clear();
          v.this.PT.remove(localObject1);
        }
      };
      if ((i == 0) && (j == 0) && (k == 0)) {
        break label505;
      }
      if (i == 0) {
        break label487;
      }
      l1 = this.TX;
      if (j == 0) {
        break label493;
      }
      l2 = this.TY;
      label425:
      if (k == 0) {
        break label499;
      }
    }
    label477:
    label485:
    label487:
    label493:
    label499:
    for (long l3 = this.TZ;; l3 = 0L)
    {
      l2 = Math.max(l2, l3);
      z.a(((RecyclerView.t)((ArrayList)localObject1).get(0)).UU, (Runnable)localObject2, l1 + l2);
      return;
      ((Runnable)localObject2).run();
      break label260;
      ((Runnable)localObject2).run();
      break label340;
      break;
      l1 = 0L;
      break label415;
      l2 = 0L;
      break label425;
    }
    label505:
    ((Runnable)localObject2).run();
  }
  
  public void eJ()
  {
    if (!isRunning()) {
      fQ();
    }
  }
  
  public final void eK()
  {
    int i = this.PR.size() - 1;
    Object localObject1;
    Object localObject2;
    while (i >= 0)
    {
      localObject1 = (b)this.PR.get(i);
      localObject2 = ((b)localObject1).Qs.UU;
      z.c((View)localObject2, 0.0F);
      z.b((View)localObject2, 0.0F);
      q(((b)localObject1).Qs);
      this.PR.remove(i);
      i -= 1;
    }
    i = this.PP.size() - 1;
    while (i >= 0)
    {
      k((RecyclerView.t)this.PP.get(i));
      this.PP.remove(i);
      i -= 1;
    }
    i = this.PQ.size() - 1;
    while (i >= 0)
    {
      localObject1 = (RecyclerView.t)this.PQ.get(i);
      z.d(((RecyclerView.t)localObject1).UU, 1.0F);
      k((RecyclerView.t)localObject1);
      this.PQ.remove(i);
      i -= 1;
    }
    i = this.PS.size() - 1;
    while (i >= 0)
    {
      a((a)this.PS.get(i));
      i -= 1;
    }
    this.PS.clear();
    if (!isRunning()) {
      return;
    }
    i = this.PU.size() - 1;
    int j;
    while (i >= 0)
    {
      localObject1 = (ArrayList)this.PU.get(i);
      j = ((ArrayList)localObject1).size() - 1;
      while (j >= 0)
      {
        localObject2 = (b)((ArrayList)localObject1).get(j);
        View localView = ((b)localObject2).Qs.UU;
        z.c(localView, 0.0F);
        z.b(localView, 0.0F);
        q(((b)localObject2).Qs);
        ((ArrayList)localObject1).remove(j);
        if (((ArrayList)localObject1).isEmpty()) {
          this.PU.remove(localObject1);
        }
        j -= 1;
      }
      i -= 1;
    }
    i = this.PT.size() - 1;
    while (i >= 0)
    {
      localObject1 = (ArrayList)this.PT.get(i);
      j = ((ArrayList)localObject1).size() - 1;
      while (j >= 0)
      {
        localObject2 = (RecyclerView.t)((ArrayList)localObject1).get(j);
        z.d(((RecyclerView.t)localObject2).UU, 1.0F);
        k((RecyclerView.t)localObject2);
        ((ArrayList)localObject1).remove(j);
        if (((ArrayList)localObject1).isEmpty()) {
          this.PT.remove(localObject1);
        }
        j -= 1;
      }
      i -= 1;
    }
    i = this.PV.size() - 1;
    while (i >= 0)
    {
      localObject1 = (ArrayList)this.PV.get(i);
      j = ((ArrayList)localObject1).size() - 1;
      while (j >= 0)
      {
        a((a)((ArrayList)localObject1).get(j));
        if (((ArrayList)localObject1).isEmpty()) {
          this.PV.remove(localObject1);
        }
        j -= 1;
      }
      i -= 1;
    }
    h(this.PY);
    h(this.PX);
    h(this.PW);
    h(this.PZ);
    fQ();
  }
  
  public boolean isRunning()
  {
    return (!this.PQ.isEmpty()) || (!this.PS.isEmpty()) || (!this.PR.isEmpty()) || (!this.PP.isEmpty()) || (!this.PX.isEmpty()) || (!this.PY.isEmpty()) || (!this.PW.isEmpty()) || (!this.PZ.isEmpty()) || (!this.PU.isEmpty()) || (!this.PT.isEmpty()) || (!this.PV.isEmpty());
  }
  
  private static final class a
  {
    public RecyclerView.t Qm;
    public RecyclerView.t Qn;
    public int Qo;
    public int Qp;
    public int Qq;
    public int Qr;
    
    private a(RecyclerView.t paramt1, RecyclerView.t paramt2)
    {
      this.Qm = paramt1;
      this.Qn = paramt2;
    }
    
    public a(RecyclerView.t paramt1, RecyclerView.t paramt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this(paramt1, paramt2);
      this.Qo = paramInt1;
      this.Qp = paramInt2;
      this.Qq = paramInt3;
      this.Qr = paramInt4;
    }
    
    public final String toString()
    {
      return "ChangeInfo{oldHolder=" + this.Qm + ", newHolder=" + this.Qn + ", fromX=" + this.Qo + ", fromY=" + this.Qp + ", toX=" + this.Qq + ", toY=" + this.Qr + '}';
    }
  }
  
  private static final class b
  {
    public int Qo;
    public int Qp;
    public int Qq;
    public int Qr;
    public RecyclerView.t Qs;
    
    public b(RecyclerView.t paramt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this.Qs = paramt;
      this.Qo = paramInt1;
      this.Qp = paramInt2;
      this.Qq = paramInt3;
      this.Qr = paramInt4;
    }
  }
  
  private static class c
    implements am
  {
    public void as(View paramView) {}
    
    public void p(View paramView) {}
    
    public void q(View paramView) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */