package android.support.v7.widget;

import android.view.View;

public abstract class aj
  extends RecyclerView.e
{
  public boolean WL = true;
  
  public abstract boolean a(RecyclerView.t paramt, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract boolean a(RecyclerView.t paramt1, RecyclerView.t paramt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public boolean a(RecyclerView.t paramt1, RecyclerView.t paramt2, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    int k = paramc1.left;
    int m = paramc1.top;
    int i;
    if (paramt2.ga()) {
      i = paramc1.left;
    }
    for (int j = paramc1.top;; j = paramc2.top)
    {
      return a(paramt1, paramt2, k, m, i, j);
      i = paramc2.left;
    }
  }
  
  public abstract boolean b(RecyclerView.t paramt);
  
  public abstract boolean c(RecyclerView.t paramt);
  
  public boolean d(RecyclerView.t paramt, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    int k = paramc1.left;
    int m = paramc1.top;
    paramc1 = paramt.UU;
    int i;
    if (paramc2 == null)
    {
      i = paramc1.getLeft();
      if (paramc2 != null) {
        break label103;
      }
    }
    label103:
    for (int j = paramc1.getTop();; j = paramc2.top)
    {
      if ((paramt.isRemoved()) || ((k == i) && (m == j))) {
        break label112;
      }
      paramc1.layout(i, j, paramc1.getWidth() + i, paramc1.getHeight() + j);
      return a(paramt, k, m, i, j);
      i = paramc2.left;
      break;
    }
    label112:
    return b(paramt);
  }
  
  public boolean e(RecyclerView.t paramt, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    if ((paramc1 != null) && ((paramc1.left != paramc2.left) || (paramc1.top != paramc2.top))) {
      return a(paramt, paramc1.left, paramc1.top, paramc2.left, paramc2.top);
    }
    return c(paramt);
  }
  
  public boolean f(RecyclerView.t paramt, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    if ((paramc1.left != paramc2.left) || (paramc1.top != paramc2.top)) {
      return a(paramt, paramc1.left, paramc1.top, paramc2.left, paramc2.top);
    }
    q(paramt);
    return false;
  }
  
  public final boolean m(RecyclerView.t paramt)
  {
    return (!this.WL) || (paramt.gj());
  }
  
  public final void q(RecyclerView.t paramt)
  {
    t(paramt);
    k(paramt);
  }
  
  public void r(RecyclerView.t paramt) {}
  
  public void s(RecyclerView.t paramt) {}
  
  public void t(RecyclerView.t paramt) {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */