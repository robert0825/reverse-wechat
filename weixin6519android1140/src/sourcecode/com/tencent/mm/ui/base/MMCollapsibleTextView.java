package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.k;

public class MMCollapsibleTextView
  extends LinearLayout
{
  private Context context;
  private boolean hasCheck;
  private TextView hvO;
  private Runnable ldG;
  private TextView pPA;
  private String pPB;
  private String pPC;
  private int ppo;
  private SparseIntArray wbl;
  
  public MMCollapsibleTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3304708898816L, 24622);
    this.hasCheck = true;
    this.wbl = new SparseIntArray();
    this.ldG = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3364838440960L, 25070);
        MMCollapsibleTextView.d(MMCollapsibleTextView.this).setMaxLines(10);
        MMCollapsibleTextView.e(MMCollapsibleTextView.this).setVisibility(0);
        MMCollapsibleTextView.e(MMCollapsibleTextView.this).setText(MMCollapsibleTextView.f(MMCollapsibleTextView.this));
        GMTrace.o(3364838440960L, 25070);
      }
    };
    this.context = paramContext;
    this.pPB = this.context.getString(a.k.ggt);
    this.pPC = this.context.getString(a.k.ggs);
    paramContext = inflate(this.context, a.h.gff, this);
    paramContext.setPadding(0, -3, 0, 0);
    this.hvO = ((TextView)paramContext.findViewById(a.g.bti));
    this.pPA = ((TextView)paramContext.findViewById(a.g.gdf));
    this.pPA.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(3190758047744L, 23773);
        switch (MMCollapsibleTextView.b(MMCollapsibleTextView.this).get(MMCollapsibleTextView.a(MMCollapsibleTextView.this), -1))
        {
        default: 
          GMTrace.o(3190758047744L, 23773);
          return;
        case 1: 
          MMCollapsibleTextView.b(MMCollapsibleTextView.this).put(MMCollapsibleTextView.a(MMCollapsibleTextView.this), 2);
        }
        for (;;)
        {
          MMCollapsibleTextView.c(MMCollapsibleTextView.this);
          GMTrace.o(3190758047744L, 23773);
          return;
          MMCollapsibleTextView.b(MMCollapsibleTextView.this).put(MMCollapsibleTextView.a(MMCollapsibleTextView.this), 1);
        }
      }
    });
    GMTrace.o(3304708898816L, 24622);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3304843116544L, 24623);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.hasCheck)
    {
      GMTrace.o(3304843116544L, 24623);
      return;
    }
    this.hasCheck = true;
    if (this.hvO.getLineCount() <= 10)
    {
      this.wbl.put(this.ppo, 0);
      GMTrace.o(3304843116544L, 24623);
      return;
    }
    this.wbl.put(this.ppo, 1);
    post(this.ldG);
    GMTrace.o(3304843116544L, 24623);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\MMCollapsibleTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */