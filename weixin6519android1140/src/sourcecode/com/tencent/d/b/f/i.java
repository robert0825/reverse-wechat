package com.tencent.d.b.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.util.SparseArray;
import com.tencent.d.a.c.c;
import com.tencent.d.a.c.f;
import com.tencent.d.b.e.d.a;
import com.tencent.d.b.e.d.b;

public class i
  extends d
{
  private com.tencent.d.b.e.d yaU;
  public String yaV = "";
  public int[] yaW;
  private String ybA = "";
  private boolean ybz = false;
  
  public i(Context paramContext, e parame)
  {
    com.tencent.d.a.c.b localb = parame.yaX;
    if (localb != null) {
      c.a(localb);
    }
    com.tencent.d.a.a.setUp();
    if ((com.tencent.d.a.a.cpw()) && (com.tencent.d.a.a.hD(paramContext))) {}
    for (boolean bool = true;; bool = false)
    {
      this.ybz = bool;
      this.yaU = parame.yaU;
      this.yaW = parame.yaW;
      this.yaV = parame.yaV;
      this.ybA = parame.yaY;
      parame = com.tencent.d.b.b.a.cpH();
      paramContext = paramContext.getSharedPreferences("soter_status", 0);
      try
      {
        parame.yau = paramContext;
        return;
      }
      finally {}
    }
  }
  
  static boolean Fn(int paramInt)
  {
    return (paramInt == 2) || (paramInt == 1);
  }
  
  @SuppressLint({"DefaultLocale"})
  public void a(String paramString, int[] paramArrayOfInt)
  {
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = paramArrayOfInt[i];
      String str = String.format("%suid%d_%s_scene%d", new Object[] { "Wechat", Integer.valueOf(Process.myUid()), f.nl(paramString), Integer.valueOf(k) });
      com.tencent.d.b.b.a.cpH().cpJ().put(k, str);
      i += 1;
    }
  }
  
  final boolean cpQ()
  {
    int[] arrayOfInt = this.yaW;
    if ((arrayOfInt == null) || (arrayOfInt.length <= 0)) {}
    for (int i = 1; i != 0; i = 0)
    {
      c.e("Soter.TaskInit", "soter: the salt string used to distinguish is longer than 24", new Object[0]);
      b(new com.tencent.d.b.a.d(27, "no business scene provided"));
      return true;
    }
    if (f.nl(this.yaV).length() > 24)
    {
      c.e("Soter.TaskInit", "soter: the salt string used to distinguish is longer than 24", new Object[0]);
      b(new com.tencent.d.b.a.d(28, "the account salt length is too long"));
      return true;
    }
    if ((!f.nm(this.ybA)) && (this.ybA.length() > 24))
    {
      c.e("Soter.TaskInit", "soter: the passed ask name is too long (larger than 24).", new Object[0]);
      b(new com.tencent.d.b.a.d(29, "the passed ask name is too long (larger than 24)"));
      return true;
    }
    if (this.yaU == null) {
      c.w("Soter.TaskInit", "soter: it is strongly recommended to check device support from server, so you'd better provider a net wrapper to check it", new Object[0]);
    }
    if (!f.nm(this.ybA))
    {
      c.i("Soter.TaskInit", "soter: provided valid ASK name", new Object[0]);
      com.tencent.d.a.c.d.cpF().yae = this.ybA;
    }
    g.cpU().v(new Runnable()
    {
      public final void run()
      {
        i.this.a(i.this.yaV, i.this.yaW);
        Object localObject = i.this;
        SharedPreferences localSharedPreferences = com.tencent.d.b.b.a.cpH().cpK();
        int i = localSharedPreferences.getInt(com.tencent.d.a.c.d.cpF().yae, 0);
        c.d("Soter.TaskInit", "soter: ask status: %d", new Object[] { Integer.valueOf(i) });
        if ((i.Fn(i)) && (com.tencent.d.a.a.cpz())) {
          com.tencent.d.a.a.cpy();
        }
        localObject = ((i)localObject).yaW;
        int j = localObject.length;
        i = 0;
        while (i < j)
        {
          int k = localObject[i];
          String str = (String)com.tencent.d.b.b.a.cpH().cpJ().get(k, "");
          if (!f.nm(str))
          {
            k = localSharedPreferences.getInt(str, 0);
            c.d("Soter.TaskInit", "soter: %s status: %d", new Object[] { str, Integer.valueOf(k) });
            if ((i.Fn(k)) && (com.tencent.d.a.a.Ys(str))) {
              com.tencent.d.a.a.bk(str, false);
            }
          }
          i += 1;
        }
      }
    });
    return false;
  }
  
  final void cpR() {}
  
  final void execute()
  {
    if (this.ybz)
    {
      if (this.yaU == null)
      {
        com.tencent.d.b.b.a.cpH().nb(true);
        com.tencent.d.b.b.a.cpH().cpI();
        b(new com.tencent.d.b.a.d(0));
        return;
      }
      String str = com.tencent.d.a.a.cpB();
      this.yaU.aX(new d.a(str));
      this.yaU.a(new com.tencent.d.b.e.b() {});
      this.yaU.execute();
      return;
    }
    b(new com.tencent.d.b.a.d(2));
    try
    {
      com.tencent.d.b.b.a.cpH().nb(false);
      com.tencent.d.b.b.a.cpH().cpI();
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\d\b\f\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */