package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import java.util.List;

public abstract interface w
{
  public abstract void a(a parama);
  
  public abstract void bD(List<String> paramList);
  
  public abstract void bnx();
  
  public abstract void clean();
  
  public abstract View getView();
  
  public static abstract class a
  {
    public View.OnClickListener pTd;
    
    public a()
    {
      GMTrace.i(15967614664704L, 118968);
      this.pTd = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(15995666169856L, 119177);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(15995666169856L, 119177);
            return;
          }
          int i = ((Integer)paramAnonymousView.getTag()).intValue();
          w.a.this.ve(i);
          GMTrace.o(15995666169856L, 119177);
        }
      };
      GMTrace.o(15967614664704L, 118968);
    }
    
    public abstract void ve(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */