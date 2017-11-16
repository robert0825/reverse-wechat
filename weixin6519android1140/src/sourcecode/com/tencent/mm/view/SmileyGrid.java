package com.tencent.mm.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;

public class SmileyGrid
  extends GridView
{
  public static int xzd;
  public ListAdapter EP;
  public int gRb;
  private int iPt;
  public int iPw;
  private AdapterView.OnItemClickListener juU;
  public j tBe;
  int xze;
  public int xzf;
  private int xzg;
  public ChatFooterPanel.a xzh;
  private boolean xzi;
  
  static
  {
    GMTrace.i(20101789122560L, 149770);
    xzd = 1;
    GMTrace.o(20101789122560L, 149770);
  }
  
  public SmileyGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20099775856640L, 149755);
    this.xze = 20;
    this.xzf = 0;
    this.xzg = 0;
    this.gRb = ChatFooterPanel.ttd;
    this.juU = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20105815654400L, 149800);
        switch (SmileyGrid.a(SmileyGrid.this))
        {
        }
        do
        {
          GMTrace.o(20105815654400L, 149800);
          return;
          if ((SmileyGrid.a(SmileyGrid.this) == 25) && (paramAnonymousInt == 0) && (SmileyGrid.this.iPw == 0) && (SmileyGrid.b(SmileyGrid.this) != ChatFooterPanel.ttf))
          {
            SmileyGrid.c(SmileyGrid.this);
            GMTrace.o(20105815654400L, 149800);
            return;
          }
          paramAnonymousAdapterView = (EmojiInfo)SmileyGrid.this.EP.getItem(paramAnonymousInt);
          SmileyGrid.a(SmileyGrid.this, paramAnonymousAdapterView);
          GMTrace.o(20105815654400L, 149800);
          return;
          if (paramAnonymousInt == SmileyGrid.this.EP.getCount() - 1)
          {
            if (SmileyGrid.d(SmileyGrid.this) != null) {
              SmileyGrid.d(SmileyGrid.this).acZ();
            }
            GMTrace.o(20105815654400L, 149800);
            return;
          }
          if (SmileyGrid.this.iPw * (SmileyGrid.this.xzf - 1) + paramAnonymousInt >= SmileyGrid.e(SmileyGrid.this))
          {
            GMTrace.o(20105815654400L, 149800);
            return;
          }
          paramAnonymousInt = SmileyGrid.this.iPw * (SmileyGrid.this.xzf - 1) + paramAnonymousInt;
        } while (SmileyGrid.d(SmileyGrid.this) == null);
        if (SmileyGrid.f(SmileyGrid.this)) {}
        for (paramAnonymousAdapterView = e.bRA().kh(paramAnonymousInt);; paramAnonymousAdapterView = e.bRA().getText(paramAnonymousInt))
        {
          SmileyGrid.d(SmileyGrid.this).append(paramAnonymousAdapterView);
          g.ork.i(13470, new Object[] { paramAnonymousAdapterView.replaceAll(",", " "), Integer.valueOf(SmileyGrid.b(SmileyGrid.this)) });
          break;
        }
      }
    };
    GMTrace.o(20099775856640L, 149755);
  }
  
  public final void ckF()
  {
    GMTrace.i(20100178509824L, 149758);
    setOnItemClickListener(this.juU);
    GMTrace.o(20100178509824L, 149758);
  }
  
  public final void h(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(20100312727552L, 149759);
    w.v("MicroMsg.emoji.SmileyGrid", "type:" + paramInt1 + " itemsPerPage:" + paramInt4 + " totalPage:" + paramInt5 + " curPage:" + this.iPw);
    setOnItemClickListener(this.juU);
    this.xze = paramInt1;
    this.iPw = paramInt2;
    this.iPt = paramInt3;
    this.xzf = paramInt4;
    this.xzg = paramInt5;
    GMTrace.o(20100312727552L, 149759);
  }
  
  @TargetApi(8)
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(20100044292096L, 149757);
    super.onConfigurationChanged(paramConfiguration);
    GMTrace.o(20100044292096L, 149757);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20099910074368L, 149756);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(20099910074368L, 149756);
  }
  
  public void release()
  {
    GMTrace.i(20100446945280L, 149760);
    this.xzh = null;
    this.tBe = null;
    GMTrace.o(20100446945280L, 149760);
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    GMTrace.i(20100581163008L, 149761);
    super.setAdapter(paramListAdapter);
    this.EP = paramListAdapter;
    GMTrace.o(20100581163008L, 149761);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\SmileyGrid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */