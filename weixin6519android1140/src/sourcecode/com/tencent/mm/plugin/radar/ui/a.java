package com.tencent.mm.plugin.radar.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TableRow;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

abstract class a
{
  private Context mContext;
  public RadarSpecialGridView oal;
  private int oam;
  
  public a(RadarSpecialGridView paramRadarSpecialGridView, Context paramContext)
  {
    GMTrace.i(8905480470528L, 66351);
    this.oal = null;
    this.mContext = null;
    this.oam = 3;
    this.mContext = paramContext;
    this.oal = paramRadarSpecialGridView;
    GMTrace.o(8905480470528L, 66351);
  }
  
  public abstract View A(View paramView, int paramInt);
  
  public void aZP()
  {
    GMTrace.i(8905883123712L, 66354);
    if (this.oam == 0)
    {
      w.e("MicroMsg.RadarGridView.GridDataAdapter", "column is 0, pls check!");
      GMTrace.o(8905883123712L, 66354);
      return;
    }
    final int i = 0;
    if (i < getCount())
    {
      int j = i / this.oam;
      int k = this.oal.oaN.getChildCount();
      TableRow localTableRow;
      label84:
      label106:
      View localView1;
      View localView2;
      if (k > j)
      {
        localTableRow = (TableRow)this.oal.oaN.getChildAt(k - 1 - j);
        k = i % this.oam;
        int m = localTableRow.getChildCount();
        if (m > k) {
          break label214;
        }
        j = 1;
        localView1 = null;
        k = m - 1 - k;
        if (j == 0) {
          localView1 = localTableRow.getChildAt(k);
        }
        localView2 = A(localView1, i);
        if (j == 0) {
          break label219;
        }
        localTableRow.addView(localView2, 0);
      }
      for (;;)
      {
        localView2.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8901990809600L, 66325);
            if (a.this.oal.oaM != null) {
              a.this.oal.oaM.e(i, paramAnonymousView);
            }
            GMTrace.o(8901990809600L, 66325);
          }
        });
        i += 1;
        break;
        localTableRow = new TableRow(this.mContext);
        localTableRow.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.oal.oaN.addView(localTableRow, 0);
        break label84;
        label214:
        j = 0;
        break label106;
        label219:
        if (localView2 != localView1)
        {
          localTableRow.removeViewAt(k);
          localTableRow.addView(localView2, k);
        }
      }
    }
    w.v("MicroMsg.RadarGridView.GridDataAdapter", "mTable rows count : " + this.oal.oaN.getChildCount());
    GMTrace.o(8905883123712L, 66354);
  }
  
  public abstract int getCount();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */