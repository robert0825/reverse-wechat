package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PreviewImageView
  extends LinearLayout
  implements w
{
  private final Context context;
  private List<String> ePZ;
  private final int pVA;
  private HashMap<String, Bitmap> pVB;
  private w.a pVC;
  private boolean pVD;
  private boolean pVE;
  private TableLayout pVx;
  private final Map<Integer, View> pVy;
  private final Map<Integer, TableRow> pVz;
  
  public PreviewImageView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8702409048064L, 64838);
    this.ePZ = new ArrayList();
    this.pVy = new HashMap();
    this.pVz = new HashMap();
    this.pVB = new HashMap();
    this.pVA = 4;
    this.pVD = true;
    this.pVE = false;
    this.context = paramContext;
    init();
    GMTrace.o(8702409048064L, 64838);
  }
  
  public PreviewImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8702274830336L, 64837);
    this.ePZ = new ArrayList();
    this.pVy = new HashMap();
    this.pVz = new HashMap();
    this.pVB = new HashMap();
    this.pVA = 4;
    this.pVD = true;
    this.pVE = false;
    this.context = paramContext;
    init();
    GMTrace.o(8702274830336L, 64837);
  }
  
  private void init()
  {
    GMTrace.i(8702543265792L, 64839);
    this.pVx = ((TableLayout)LayoutInflater.from(this.context).inflate(i.g.pgc, this, true).findViewById(i.f.content));
    GMTrace.o(8702543265792L, 64839);
  }
  
  public final void a(w.a parama)
  {
    GMTrace.i(15996337258496L, 119182);
    this.pVC = parama;
    GMTrace.o(15996337258496L, 119182);
  }
  
  public final void bD(List<String> paramList)
  {
    GMTrace.i(8702677483520L, 64840);
    long l = System.currentTimeMillis();
    if (paramList == null)
    {
      GMTrace.o(8702677483520L, 64840);
      return;
    }
    this.ePZ = paramList;
    int i = 0;
    this.pVx.removeAllViews();
    int m = paramList.size() + 1;
    int j = 0;
    TableRow localTableRow;
    if (i < m)
    {
      localTableRow = (TableRow)this.pVz.get(Integer.valueOf(j));
      if (localTableRow != null) {
        break label546;
      }
      localTableRow = new TableRow(this.context);
      this.pVz.put(Integer.valueOf(j), localTableRow);
    }
    label258:
    label315:
    label408:
    label504:
    label546:
    for (;;)
    {
      localTableRow.removeAllViews();
      int k = 0;
      if ((k < 4) && (i < m)) {
        if (i >= 9) {
          i += 1;
        }
      }
      for (;;)
      {
        if (localTableRow.getChildCount() > 0) {
          this.pVx.addView(localTableRow);
        }
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PreviewImageView", "initlist time : " + (System.currentTimeMillis() - l));
        j += 1;
        break;
        Object localObject2 = (View)this.pVy.get(Integer.valueOf(i));
        Object localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = View.inflate(this.context, i.g.pgd, null);
          this.pVy.put(Integer.valueOf(i), localObject1);
        }
        ImageView localImageView;
        if (i == m - 1)
        {
          localObject2 = "";
          localImageView = (ImageView)((View)localObject1).findViewById(i.f.pbc);
          if (i != m - 1) {
            break label408;
          }
          if (this.pVD)
          {
            localImageView.setBackgroundResource(i.e.oYm);
            localImageView.setContentDescription(getContext().getString(i.j.piB));
            localImageView.setImageDrawable(null);
            if (this.pVC != null)
            {
              if (i != m - 1) {
                break label504;
              }
              ((View)localObject1).setTag(Integer.valueOf(-1));
              ((View)localObject1).setOnClickListener(this.pVC.pTd);
              ((View)localObject1).setClickable(true);
            }
          }
        }
        for (;;)
        {
          ((View)localObject1).setLayoutParams(new TableRow.LayoutParams(-2, -2));
          localTableRow.addView((View)localObject1);
          i += 1;
          k += 1;
          break;
          localObject2 = (String)paramList.get(i);
          break label258;
          localImageView.setBackgroundDrawable(null);
          localImageView.setTag(localObject2);
          localImageView.setContentDescription(getContext().getString(i.j.pjy));
          Bitmap localBitmap = (Bitmap)this.pVB.get(localObject2);
          if (!i.m(localBitmap))
          {
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PreviewImageView", "bm is null");
            new a(localImageView, (String)localObject2).m(new String[] { "" });
            break label315;
          }
          localImageView.setImageBitmap(localBitmap);
          break label315;
          ((View)localObject1).setTag(Integer.valueOf(i));
          ((View)localObject1).setOnClickListener(this.pVC.pTd);
          ((View)localObject1).setClickable(true);
        }
        GMTrace.o(8702677483520L, 64840);
        return;
      }
    }
  }
  
  public final void bnx()
  {
    GMTrace.i(15996068823040L, 119180);
    this.pVD = false;
    GMTrace.o(15996068823040L, 119180);
  }
  
  public final void clean()
  {
    GMTrace.i(15996471476224L, 119183);
    this.pVE = true;
    Iterator localIterator = this.pVB.values().iterator();
    while (localIterator.hasNext())
    {
      Bitmap localBitmap = (Bitmap)localIterator.next();
      if (i.m(localBitmap)) {
        localBitmap.recycle();
      }
    }
    GMTrace.o(15996471476224L, 119183);
  }
  
  public final View getView()
  {
    GMTrace.i(15996203040768L, 119181);
    GMTrace.o(15996203040768L, 119181);
    return this;
  }
  
  final class a
    extends h<String, Integer, Boolean>
  {
    private ImageView eKZ;
    private Bitmap gsp;
    private String path;
    
    public a(ImageView paramImageView, String paramString)
    {
      GMTrace.i(8333176078336L, 62087);
      this.eKZ = paramImageView;
      this.path = paramString;
      GMTrace.o(8333176078336L, 62087);
    }
    
    public final com.tencent.mm.sdk.platformtools.ae biu()
    {
      GMTrace.i(8333310296064L, 62088);
      com.tencent.mm.sdk.platformtools.ae localae = com.tencent.mm.plugin.sns.model.ae.biO();
      GMTrace.o(8333310296064L, 62088);
      return localae;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\PreviewImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */