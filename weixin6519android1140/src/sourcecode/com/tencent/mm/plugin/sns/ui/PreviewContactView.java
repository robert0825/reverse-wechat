package com.tencent.mm.plugin.sns.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressLint({"UseSparseArrays"})
public class PreviewContactView
  extends LinearLayout
{
  private final Context context;
  private List<String> ePZ;
  private final int pVA;
  private TableLayout pVx;
  private final Map<Integer, View> pVy;
  @SuppressLint({"UseSparseArrays"})
  private final Map<Integer, TableRow> pVz;
  
  public PreviewContactView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8351027036160L, 62220);
    this.ePZ = new ArrayList();
    this.pVy = new HashMap();
    this.pVz = new HashMap();
    this.pVA = 5;
    this.context = paramContext;
    this.pVx = ((TableLayout)LayoutInflater.from(this.context).inflate(i.g.pgc, this, true).findViewById(i.f.content));
    GMTrace.o(8351027036160L, 62220);
  }
  
  public final void bE(List<String> paramList)
  {
    GMTrace.i(8351161253888L, 62221);
    if (paramList == null)
    {
      GMTrace.o(8351161253888L, 62221);
      return;
    }
    this.ePZ = paramList;
    this.pVx.removeAllViews();
    if (paramList.size() == 0)
    {
      GMTrace.o(8351161253888L, 62221);
      return;
    }
    int m = paramList.size();
    int j = 0;
    int i = 0;
    TableRow localTableRow;
    if (i < m)
    {
      localTableRow = (TableRow)this.pVz.get(Integer.valueOf(j));
      if (localTableRow != null) {
        break label295;
      }
      localTableRow = new TableRow(this.context);
      this.pVz.put(Integer.valueOf(j), localTableRow);
    }
    label295:
    for (;;)
    {
      localTableRow.removeAllViews();
      int k = 0;
      while ((k < 5) && (i < m))
      {
        Object localObject2 = (View)this.pVy.get(Integer.valueOf(i));
        Object localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = View.inflate(this.context, i.g.pgb, null);
          this.pVy.put(Integer.valueOf(i), localObject1);
        }
        localObject2 = (String)paramList.get(i);
        ImageView localImageView = (ImageView)((View)localObject1).findViewById(i.f.pbc);
        localImageView.setBackgroundDrawable(null);
        a.b.a(localImageView, (String)localObject2);
        ((View)localObject1).setTag(Integer.valueOf(0));
        ((View)localObject1).setClickable(false);
        localTableRow.addView((View)localObject1);
        k += 1;
        i += 1;
      }
      this.pVx.addView(localTableRow);
      j += 1;
      break;
      GMTrace.o(8351161253888L, 62221);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\PreviewContactView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */