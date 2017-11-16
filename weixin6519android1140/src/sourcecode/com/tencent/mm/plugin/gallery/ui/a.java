package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.gallery.model.GalleryItem.ImageMediaItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem;
import com.tencent.mm.plugin.gallery.model.c;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  extends BaseAdapter
  implements com.tencent.mm.ui.gridviewheaders.e
{
  private SimpleDateFormat kdn;
  int lCg;
  com.tencent.mm.plugin.gallery.stub.a lCh;
  ArrayList<GalleryItem.MediaItem> lCi;
  ArrayList<GalleryItem.MediaItem> lCj;
  private b lCk;
  int lCl;
  LinkedList<a> lCm;
  boolean lCn;
  private View.OnClickListener lCo;
  private Context mContext;
  
  public a(Context paramContext, b paramb)
  {
    GMTrace.i(11927526834176L, 88867);
    this.lCg = 9;
    this.lCh = null;
    this.lCi = new ArrayList();
    this.lCj = new ArrayList();
    this.kdn = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    this.lCm = new LinkedList();
    this.lCn = false;
    this.lCo = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11924037173248L, 88841);
        Integer localInteger = (Integer)paramAnonymousView.getTag(R.h.bMA);
        GalleryItem.MediaItem localMediaItem = (GalleryItem.MediaItem)a.a(a.this).get(localInteger.intValue());
        if (localMediaItem == null)
        {
          w.e("MicroMsg.AlbumAdapter", "[onClick] null == item!");
          GMTrace.o(11924037173248L, 88841);
          return;
        }
        w.i("MicroMsg.AlbumAdapter", "click Image path:" + localMediaItem.gVn);
        int i;
        int j;
        if (a.b(a.this).contains(localMediaItem))
        {
          a.b(a.this).indexOf(localMediaItem);
          a.b(a.this).remove(localMediaItem);
          i = 1;
          j = 0;
        }
        for (;;)
        {
          if (j == 0) {
            if (a.f(a.this) != null) {
              a.f(a.this).B(a.this.lCj.size(), localInteger.intValue(), i);
            }
          }
          for (;;)
          {
            if (1 != i) {
              break label667;
            }
            ((CheckBox)paramAnonymousView.getTag(R.h.bMz)).setChecked(false);
            ((View)paramAnonymousView.getTag(R.h.bME)).setVisibility(0);
            ((View)paramAnonymousView.getTag(R.h.bME)).setBackgroundResource(R.g.aXo);
            GMTrace.o(11924037173248L, 88841);
            return;
            if ((c.aCL().aDo() == 3) && (localMediaItem != null) && (localMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
            {
              com.tencent.mm.plugin.gif.e locale = new com.tencent.mm.plugin.gif.e(localMediaItem.gVn);
              i = com.tencent.mm.a.e.aY(localMediaItem.gVn);
              if (i != 0) {}
              try
              {
                if ((i > a.c(a.this).ub()) || (locale.mfm[0] > a.c(a.this).ua()) || (locale.mfm[1] > a.c(a.this).ua()))
                {
                  a.c(a.this).Z(13459, i + ",1,,0");
                  com.tencent.mm.ui.base.h.bm(a.d(a.this), a.d(a.this).getString(R.l.dzg));
                  GMTrace.o(11924037173248L, 88841);
                  return;
                }
              }
              catch (Exception paramAnonymousView)
              {
                w.e("MicroMsg.AlbumAdapter", bg.f(paramAnonymousView));
                GMTrace.o(11924037173248L, 88841);
                return;
              }
            }
            if (a.b(a.this).size() >= a.e(a.this)) {
              break label720;
            }
            a.b(a.this).add(localMediaItem);
            a.b(a.this).size();
            i = 0;
            j = 0;
            break;
            if (a.g(a.this) == 1) {
              com.tencent.mm.ui.base.h.bm(a.d(a.this), a.d(a.this).getResources().getQuantityString(R.j.cIo, a.e(a.this), new Object[] { Integer.valueOf(a.e(a.this)) }));
            } else if (a.g(a.this) == 2) {
              com.tencent.mm.ui.base.h.bm(a.d(a.this), a.d(a.this).getResources().getQuantityString(R.j.cIq, a.e(a.this), new Object[] { Integer.valueOf(a.e(a.this)) }));
            } else {
              com.tencent.mm.ui.base.h.bm(a.d(a.this), a.d(a.this).getResources().getQuantityString(R.j.cIp, a.e(a.this), new Object[] { Integer.valueOf(a.e(a.this)) }));
            }
          }
          label667:
          ((CheckBox)paramAnonymousView.getTag(R.h.bMz)).setChecked(true);
          ((View)paramAnonymousView.getTag(R.h.bME)).setVisibility(0);
          ((View)paramAnonymousView.getTag(R.h.bME)).setBackgroundResource(R.e.aNW);
          GMTrace.o(11924037173248L, 88841);
          return;
          label720:
          i = 1;
          j = 1;
        }
      }
    };
    this.mContext = paramContext;
    this.lCk = paramb;
    GMTrace.o(11927526834176L, 88867);
  }
  
  public final void B(ArrayList<String> paramArrayList)
  {
    GMTrace.i(11927929487360L, 88870);
    w.d("MicroMsg.AlbumAdapter", "before set selected paths, selected[%s]", new Object[] { this.lCj });
    this.lCj.clear();
    if (paramArrayList != null)
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        String str = (String)paramArrayList.next();
        GalleryItem.MediaItem localMediaItem = GalleryItem.MediaItem.a(0, 0L, str, str, "");
        if (c.aCN() != null)
        {
          int i = c.aCN().indexOf(localMediaItem);
          if (i >= 0)
          {
            localMediaItem = (GalleryItem.MediaItem)c.aCN().get(i);
            if ((localMediaItem != null) && (localMediaItem.getType() == 2))
            {
              this.lCj.add(GalleryItem.MediaItem.a(2, 0L, str, "", ""));
              continue;
            }
          }
        }
        w.d("MicroMsg.AlbumAdapter", "media item no exist on preview items.");
        this.lCj.add(GalleryItem.MediaItem.a(1, 0L, str, "", ""));
      }
    }
    w.d("MicroMsg.AlbumAdapter", "after set selected paths, selected[%s]", new Object[] { this.lCj });
    GMTrace.o(11927929487360L, 88870);
  }
  
  public final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11929137446912L, 88879);
    int i = paramInt;
    if (paramInt < this.lCm.size())
    {
      w.d("MicroMsg.AlbumAdapter", "want to get header view headerId, old pos[%d]", new Object[] { Integer.valueOf(paramInt) });
      i = this.lCm.size();
    }
    if ((paramView == null) || (paramView.getParent() != null))
    {
      paramViewGroup = new ViewGroup.LayoutParams(-1, -2);
      paramView = new TextView(this.mContext);
      paramView.setBackgroundResource(R.g.aXC);
      paramInt = this.mContext.getResources().getDimensionPixelSize(R.f.aQN);
      int j = this.mContext.getResources().getDimensionPixelSize(R.f.aQN);
      paramView.setPadding(j, paramInt, j, paramInt);
      paramView.setTextColor(this.mContext.getResources().getColor(R.e.aNJ));
      paramView.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(R.f.aQo));
      paramView.setTypeface(null, 1);
      paramView.setLayoutParams(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup = on(i);
      Date localDate = new Date(paramViewGroup.lBF);
      String str = com.tencent.mm.ui.gridviewheaders.a.chJ().a(localDate, this.mContext);
      w.v("MicroMsg.AlbumAdapter", "getHeaderView, adjust pos[%d], date[%d] date[%s], headerStr[%s]", new Object[] { Integer.valueOf(i), Long.valueOf(paramViewGroup.lBF), localDate, str });
      ((TextView)paramView).setText(str);
      GMTrace.o(11929137446912L, 88879);
      return paramView;
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(11927661051904L, 88868);
    if (parama == null)
    {
      w.w("MicroMsg.AlbumAdapter", "addHeader error, header is null");
      GMTrace.o(11927661051904L, 88868);
      return;
    }
    this.lCm.remove(parama);
    this.lCm.add(parama);
    GMTrace.o(11927661051904L, 88868);
  }
  
  public final ArrayList<String> aDt()
  {
    GMTrace.i(11927795269632L, 88869);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.lCj.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((GalleryItem.MediaItem)localIterator.next()).gVn);
    }
    GMTrace.o(11927795269632L, 88869);
    return localArrayList;
  }
  
  public final int getCount()
  {
    GMTrace.i(11928197922816L, 88872);
    int i = this.lCm.size();
    int j = this.lCi.size();
    GMTrace.o(11928197922816L, 88872);
    return i + j;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(11928734793728L, 88876);
    long l = paramInt;
    GMTrace.o(11928734793728L, 88876);
    return l;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(11928466358272L, 88874);
    if (paramInt < this.lCm.size())
    {
      GMTrace.o(11928466358272L, 88874);
      return paramInt;
    }
    paramInt = this.lCm.size();
    GMTrace.o(11928466358272L, 88874);
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, final ViewGroup paramViewGroup)
  {
    GMTrace.i(11928869011456L, 88877);
    w.v("MicroMsg.AlbumAdapter", "duanyi getview index[%d] header size[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.lCm.size()) });
    if (paramInt < this.lCm.size())
    {
      w.i("MicroMsg.AlbumAdapter", "position[%d], get header view", new Object[] { Integer.valueOf(paramInt) });
      paramView = ((a)this.lCm.get(paramInt)).getView();
      GMTrace.o(11928869011456L, 88877);
      return paramView;
    }
    int i = paramInt - this.lCm.size();
    GalleryItem.MediaItem localMediaItem = (GalleryItem.MediaItem)this.lCi.get(i);
    w.i("MicroMsg.AlbumAdapter", "addtime:%s", new Object[] { Long.valueOf(localMediaItem.lBF) });
    boolean bool;
    d locald;
    if ((paramView == null) || (!(paramView.getTag() instanceof d))) {
      if (paramView == null)
      {
        bool = true;
        w.d("MicroMsg.AlbumAdapter", "converview is null?[%B]", new Object[] { Boolean.valueOf(bool) });
        paramView = LayoutInflater.from(this.mContext).inflate(R.i.cFn, paramViewGroup, false);
        locald = new d();
        locald.lCv = ((ImageView)paramView.findViewById(R.h.bMG));
        locald.lCw = ((ImageView)paramView.findViewById(R.h.bMJ));
        locald.lCx = ((RelativeLayout)paramView.findViewById(R.h.ckr));
        locald.lCy = ((TextView)paramView.findViewById(R.h.cks));
        locald.lCA = ((CheckBox)paramView.findViewById(R.h.bMz));
        locald.lCz = ((TextView)paramView.findViewById(R.h.cbI));
        locald.lCB = paramView.findViewById(R.h.bMA);
        locald.lCC = ((ImageView)paramView.findViewById(R.h.bME));
        locald.lCB.setOnClickListener(this.lCo);
        locald.lCB.setTag(R.h.bMz, locald.lCA);
        locald.lCB.setTag(R.h.cbI, locald.lCz);
        locald.lCB.setTag(R.h.bME, locald.lCC);
        if ((c.aCL().aDo() == 0) || (c.aCL().aDo() == 5) || (c.aCL().aDo() == 10) || (c.aCL().aDo() == 11))
        {
          locald.lCA.setVisibility(8);
          locald.lCz.setVisibility(8);
          locald.lCB.setVisibility(8);
          locald.lCC.setVisibility(8);
        }
        locald.lCD = ((ImageView)paramView.findViewById(R.h.bFn));
        locald.lCE = ((ImageView)paramView.findViewById(R.h.bvz));
        paramView.setTag(locald);
      }
    }
    for (;;)
    {
      if (localMediaItem != null) {
        break label549;
      }
      w.e("MicroMsg.AlbumAdapter", "get item failed");
      GMTrace.o(11928869011456L, 88877);
      return paramView;
      bool = false;
      break;
      locald = (d)paramView.getTag();
    }
    label549:
    locald.lCv.setVisibility(0);
    if (localMediaItem.getType() == 2)
    {
      locald.lCx.setVisibility(0);
      c.a(locald.lCy, (GalleryItem.VideoMediaItem)localMediaItem);
      if (!localMediaItem.mMimeType.equalsIgnoreCase("edit")) {
        break label689;
      }
      locald.lCE.setVisibility(0);
    }
    Object localObject;
    String str;
    for (;;)
    {
      localObject = localMediaItem.aDc();
      str = localMediaItem.gVn;
      if ((!bg.nm((String)localObject)) || (!bg.nm(str))) {
        break label702;
      }
      w.e("MicroMsg.AlbumAdapter", "null or nil filepath: " + i);
      GMTrace.o(11928869011456L, 88877);
      return paramView;
      locald.lCx.setVisibility(8);
      break;
      label689:
      locald.lCE.setVisibility(8);
    }
    label702:
    locald.lCB.setTag(R.h.bMA, Integer.valueOf(i));
    i = R.l.dNG;
    if (localMediaItem.getType() == 2) {
      i = R.l.ckI;
    }
    paramViewGroup = paramViewGroup.getContext().getString(i, new Object[] { Integer.valueOf(paramInt + 1 - this.lCm.size()), this.kdn.format(new Date(localMediaItem.lBF)) });
    w.d("MicroMsg.AlbumAdapter", "thumbFilaPath: %s | origFilePath: %s | contentDescription %s", new Object[] { localObject, str, paramViewGroup });
    locald.lCw.setContentDescription(paramViewGroup);
    paramViewGroup = locald.lCv;
    h.a(locald.lCw, localMediaItem.getType(), (String)localObject, str, localMediaItem.lBE, -1, new h.a()
    {
      public final void aDu()
      {
        GMTrace.i(11940814389248L, 88966);
        if (paramViewGroup != null) {
          paramViewGroup.setVisibility(8);
        }
        GMTrace.o(11940814389248L, 88966);
      }
    });
    if (this.lCn) {
      if (localMediaItem.getType() == 2)
      {
        locald.lCA.setVisibility(8);
        locald.lCz.setVisibility(8);
        locald.lCB.setVisibility(8);
        locald.lCC.setVisibility(8);
        if (((c.aCL().aDo() != 3) && (c.aCL().aDo() != 11)) || (localMediaItem == null) || (!localMediaItem.mMimeType.equalsIgnoreCase("image/gif"))) {
          break label1235;
        }
        locald.lCD.setVisibility(0);
      }
    }
    for (;;)
    {
      GMTrace.o(11928869011456L, 88877);
      return paramView;
      if (this.lCj.contains(localMediaItem))
      {
        locald.lCA.setChecked(true);
        paramViewGroup = locald.lCz;
        localObject = new StringBuilder();
        if (localMediaItem == null) {}
        for (paramInt = -1;; paramInt = this.lCj.indexOf(localMediaItem))
        {
          paramViewGroup.setText(paramInt);
          locald.lCC.setBackgroundResource(R.e.aNW);
          locald.lCB.setVisibility(0);
          locald.lCA.setVisibility(0);
          locald.lCC.setVisibility(0);
          break;
        }
      }
      locald.lCz.setVisibility(8);
      locald.lCA.setChecked(false);
      locald.lCC.setBackgroundResource(R.g.aXo);
      locald.lCA.setVisibility(0);
      locald.lCB.setVisibility(0);
      locald.lCC.setVisibility(0);
      break;
      if (this.lCj.contains(localMediaItem))
      {
        locald.lCA.setChecked(true);
        locald.lCC.setVisibility(0);
        locald.lCC.setBackgroundResource(R.e.aNW);
        break;
      }
      locald.lCA.setChecked(false);
      locald.lCz.setVisibility(8);
      locald.lCC.setVisibility(0);
      locald.lCC.setBackgroundResource(R.g.aXo);
      break;
      label1235:
      locald.lCD.setVisibility(8);
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(11928332140544L, 88873);
    int i = this.lCm.size();
    GMTrace.o(11928332140544L, 88873);
    return i + 1;
  }
  
  public final long mj(int paramInt)
  {
    GMTrace.i(11929003229184L, 88878);
    int i = paramInt;
    if (paramInt < this.lCm.size())
    {
      w.d("MicroMsg.AlbumAdapter", "want to get header view headerId, old pos[%d]", new Object[] { Integer.valueOf(paramInt) });
      i = this.lCm.size();
    }
    GalleryItem.MediaItem localMediaItem = on(i);
    Date localDate = new Date(localMediaItem.lBF);
    long l = com.tencent.mm.ui.gridviewheaders.a.chJ().a(localDate);
    w.v("MicroMsg.AlbumAdapter", "getHeaderId, adjust pos[%d], date[%d] date[%s], headerID[%d]", new Object[] { Integer.valueOf(i), Long.valueOf(localMediaItem.lBF), localDate, Long.valueOf(l) });
    GMTrace.o(11929003229184L, 88878);
    return l;
  }
  
  public final ArrayList<GalleryItem.MediaItem> om(int paramInt)
  {
    GMTrace.i(11928063705088L, 88871);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.lCi.iterator();
    while (localIterator.hasNext())
    {
      GalleryItem.MediaItem localMediaItem = (GalleryItem.MediaItem)localIterator.next();
      if (localMediaItem.getType() == paramInt) {
        localArrayList.add(localMediaItem);
      }
    }
    GMTrace.o(11928063705088L, 88871);
    return localArrayList;
  }
  
  public final GalleryItem.MediaItem on(int paramInt)
  {
    GMTrace.i(11928600576000L, 88875);
    if (paramInt < this.lCm.size())
    {
      w.i("MicroMsg.AlbumAdapter", "get header, pos[%d]", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(11928600576000L, 88875);
      return null;
    }
    paramInt -= this.lCm.size();
    if (paramInt >= this.lCi.size())
    {
      w.w("MicroMsg.AlbumAdapter", "get item error, media items size[%d], adjustPos[%d]", new Object[] { Integer.valueOf(this.lCi.size()), Integer.valueOf(paramInt) });
      localObject = new GalleryItem.ImageMediaItem();
      ((GalleryItem.ImageMediaItem)localObject).lBF = bg.Pv();
      GMTrace.o(11928600576000L, 88875);
      return (GalleryItem.MediaItem)localObject;
    }
    Object localObject = (GalleryItem.MediaItem)this.lCi.get(paramInt);
    GMTrace.o(11928600576000L, 88875);
    return (GalleryItem.MediaItem)localObject;
  }
  
  public final String oo(int paramInt)
  {
    GMTrace.i(15084730449920L, 112390);
    int i = paramInt;
    if (paramInt < this.lCm.size())
    {
      w.d("MicroMsg.AlbumAdapter", "want to get header view headerId, old pos[%d]", new Object[] { Integer.valueOf(paramInt) });
      i = this.lCm.size();
    }
    Object localObject = new Date(on(i).lBF);
    localObject = com.tencent.mm.ui.gridviewheaders.a.chJ().a((Date)localObject, this.mContext);
    GMTrace.o(15084730449920L, 112390);
    return (String)localObject;
  }
  
  public static abstract interface a
  {
    public abstract View getView();
  }
  
  public static abstract interface b
  {
    public abstract void B(int paramInt1, int paramInt2, int paramInt3);
  }
  
  private static final class c
    implements Runnable
  {
    public static HashMap<TextView, c> lCt;
    public WeakReference<TextView> kVX;
    public GalleryItem.VideoMediaItem lCr;
    public a lCs;
    
    static
    {
      GMTrace.i(11964973580288L, 89146);
      lCt = new HashMap();
      GMTrace.o(11964973580288L, 89146);
    }
    
    private c(TextView paramTextView, GalleryItem.VideoMediaItem paramVideoMediaItem, a parama)
    {
      GMTrace.i(11963362967552L, 89134);
      this.kVX = new WeakReference(paramTextView);
      this.lCr = paramVideoMediaItem;
      this.lCs = parama;
      GMTrace.o(11963362967552L, 89134);
    }
    
    static void a(TextView paramTextView, GalleryItem.VideoMediaItem paramVideoMediaItem)
    {
      Object localObject = null;
      GMTrace.i(11963631403008L, 89136);
      if ((paramTextView == null) || (paramVideoMediaItem == null))
      {
        w.e("MicroMsg.AlbumAdapter", "Error input for duration fetcher");
        GMTrace.o(11963631403008L, 89136);
        return;
      }
      if (lCt.containsKey(paramTextView))
      {
        localc = (c)lCt.get(paramTextView);
        if (localc.lCr.equals(paramVideoMediaItem))
        {
          GMTrace.o(11963631403008L, 89136);
          return;
        }
        if (paramTextView.equals(localc.kVX.get())) {
          localc.f(null);
        }
      }
      if (paramVideoMediaItem.gVq >= 0)
      {
        w.i("MicroMsg.AlbumAdapter", "Directly attach durationMs %d to tv, path %s", new Object[] { Integer.valueOf(paramVideoMediaItem.gVq), paramVideoMediaItem });
        c(paramTextView, paramVideoMediaItem.gVq);
        lCt.remove(paramTextView);
        GMTrace.o(11963631403008L, 89136);
        return;
      }
      paramTextView.setText("");
      c localc = new c(paramTextView, paramVideoMediaItem, new a()
      {
        public final void a(a.c paramAnonymousc, int paramAnonymousInt)
        {
          GMTrace.i(11965510451200L, 89150);
          if ((paramAnonymousc == null) || (paramAnonymousc.kVX == null))
          {
            GMTrace.o(11965510451200L, 89150);
            return;
          }
          paramAnonymousc = (TextView)paramAnonymousc.kVX.get();
          if (paramAnonymousc == null)
          {
            GMTrace.o(11965510451200L, 89150);
            return;
          }
          a.c.c(paramAnonymousc, paramAnonymousInt);
          a.c.lCt.remove(paramAnonymousc);
          GMTrace.o(11965510451200L, 89150);
        }
      });
      if (com.tencent.mm.sdk.f.e.Q(localc))
      {
        w.i("MicroMsg.AlbumAdapter", "task has post to thread pool");
        Iterator localIterator = lCt.entrySet().iterator();
        do
        {
          paramVideoMediaItem = (GalleryItem.VideoMediaItem)localObject;
          if (!localIterator.hasNext()) {
            break;
          }
          paramVideoMediaItem = (Map.Entry)localIterator.next();
        } while (!localc.equals(paramVideoMediaItem.getValue()));
        if ((paramVideoMediaItem == null) || (paramVideoMediaItem.getValue() == null))
        {
          w.e("MicroMsg.AlbumAdapter", "no entry found");
          GMTrace.o(11963631403008L, 89136);
          return;
        }
        ((c)paramVideoMediaItem.getValue()).f(paramTextView);
        lCt.remove(paramVideoMediaItem.getKey());
        lCt.put(paramTextView, paramVideoMediaItem.getValue());
        GMTrace.o(11963631403008L, 89136);
        return;
      }
      com.tencent.mm.sdk.f.e.post(localc, "load_duration_for_" + paramVideoMediaItem.gVn);
      lCt.put(paramTextView, localc);
      GMTrace.o(11963631403008L, 89136);
    }
    
    public static void c(TextView paramTextView, int paramInt)
    {
      GMTrace.i(11963765620736L, 89137);
      if (paramTextView == null)
      {
        GMTrace.o(11963765620736L, 89137);
        return;
      }
      if (paramInt < 0)
      {
        paramTextView.setText("--:--");
        GMTrace.o(11963765620736L, 89137);
        return;
      }
      paramInt = Math.round(paramInt / 1000.0F);
      paramTextView.setText(String.format(Locale.CHINA, "%d:%02d", new Object[] { Integer.valueOf(paramInt / 60), Integer.valueOf(paramInt % 60) }));
      GMTrace.o(11963765620736L, 89137);
    }
    
    private void f(TextView paramTextView)
    {
      GMTrace.i(11963497185280L, 89135);
      this.kVX = new WeakReference(paramTextView);
      GMTrace.o(11963497185280L, 89135);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(11963899838464L, 89138);
      if ((paramObject == null) || (!(paramObject instanceof c)))
      {
        GMTrace.o(11963899838464L, 89138);
        return false;
      }
      boolean bool = this.lCr.equals(((c)paramObject).lCr);
      GMTrace.o(11963899838464L, 89138);
      return bool;
    }
    
    public final int hashCode()
    {
      GMTrace.i(11964034056192L, 89139);
      int i = this.lCr.hashCode();
      GMTrace.o(11964034056192L, 89139);
      return i;
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: ldc2_w 241
      //   3: ldc -13
      //   5: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: new 245	android/media/MediaMetadataRetriever
      //   11: dup
      //   12: invokespecial 246	android/media/MediaMetadataRetriever:<init>	()V
      //   15: astore_2
      //   16: aload_2
      //   17: astore_1
      //   18: aload_2
      //   19: aload_0
      //   20: getfield 62	com/tencent/mm/plugin/gallery/ui/a$c:lCr	Lcom/tencent/mm/plugin/gallery/model/GalleryItem$VideoMediaItem;
      //   23: invokevirtual 249	com/tencent/mm/plugin/gallery/model/GalleryItem$VideoMediaItem:aDc	()Ljava/lang/String;
      //   26: invokevirtual 252	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
      //   29: aload_2
      //   30: astore_1
      //   31: aload_0
      //   32: getfield 62	com/tencent/mm/plugin/gallery/ui/a$c:lCr	Lcom/tencent/mm/plugin/gallery/model/GalleryItem$VideoMediaItem;
      //   35: aload_2
      //   36: bipush 9
      //   38: invokevirtual 256	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
      //   41: iconst_m1
      //   42: invokestatic 262	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
      //   45: putfield 103	com/tencent/mm/plugin/gallery/model/GalleryItem$VideoMediaItem:gVq	I
      //   48: aload_2
      //   49: invokevirtual 265	android/media/MediaMetadataRetriever:release	()V
      //   52: invokestatic 271	android/os/Looper:myLooper	()Landroid/os/Looper;
      //   55: invokestatic 274	android/os/Looper:getMainLooper	()Landroid/os/Looper;
      //   58: if_acmpne +167 -> 225
      //   61: aload_0
      //   62: getfield 64	com/tencent/mm/plugin/gallery/ui/a$c:lCs	Lcom/tencent/mm/plugin/gallery/ui/a$c$a;
      //   65: ifnull +20 -> 85
      //   68: aload_0
      //   69: getfield 64	com/tencent/mm/plugin/gallery/ui/a$c:lCs	Lcom/tencent/mm/plugin/gallery/ui/a$c$a;
      //   72: aload_0
      //   73: aload_0
      //   74: getfield 62	com/tencent/mm/plugin/gallery/ui/a$c:lCr	Lcom/tencent/mm/plugin/gallery/model/GalleryItem$VideoMediaItem;
      //   77: getfield 103	com/tencent/mm/plugin/gallery/model/GalleryItem$VideoMediaItem:gVq	I
      //   80: invokeinterface 277 3 0
      //   85: ldc2_w 241
      //   88: ldc -13
      //   90: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   93: return
      //   94: astore_1
      //   95: ldc 70
      //   97: aload_1
      //   98: ldc_w 279
      //   101: iconst_1
      //   102: anewarray 4	java/lang/Object
      //   105: dup
      //   106: iconst_0
      //   107: aload_1
      //   108: invokevirtual 282	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   111: aastore
      //   112: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   115: goto -63 -> 52
      //   118: astore_3
      //   119: aconst_null
      //   120: astore_2
      //   121: aload_2
      //   122: astore_1
      //   123: ldc 70
      //   125: aload_3
      //   126: ldc_w 288
      //   129: iconst_2
      //   130: anewarray 4	java/lang/Object
      //   133: dup
      //   134: iconst_0
      //   135: aload_0
      //   136: getfield 62	com/tencent/mm/plugin/gallery/ui/a$c:lCr	Lcom/tencent/mm/plugin/gallery/model/GalleryItem$VideoMediaItem;
      //   139: getfield 186	com/tencent/mm/plugin/gallery/model/GalleryItem$VideoMediaItem:gVn	Ljava/lang/String;
      //   142: aastore
      //   143: dup
      //   144: iconst_1
      //   145: aload_3
      //   146: invokevirtual 282	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   149: aastore
      //   150: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   153: aload_2
      //   154: ifnull -102 -> 52
      //   157: aload_2
      //   158: invokevirtual 265	android/media/MediaMetadataRetriever:release	()V
      //   161: goto -109 -> 52
      //   164: astore_1
      //   165: ldc 70
      //   167: aload_1
      //   168: ldc_w 279
      //   171: iconst_1
      //   172: anewarray 4	java/lang/Object
      //   175: dup
      //   176: iconst_0
      //   177: aload_1
      //   178: invokevirtual 282	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   181: aastore
      //   182: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   185: goto -133 -> 52
      //   188: astore_2
      //   189: aconst_null
      //   190: astore_1
      //   191: aload_1
      //   192: ifnull +7 -> 199
      //   195: aload_1
      //   196: invokevirtual 265	android/media/MediaMetadataRetriever:release	()V
      //   199: aload_2
      //   200: athrow
      //   201: astore_1
      //   202: ldc 70
      //   204: aload_1
      //   205: ldc_w 279
      //   208: iconst_1
      //   209: anewarray 4	java/lang/Object
      //   212: dup
      //   213: iconst_0
      //   214: aload_1
      //   215: invokevirtual 282	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   218: aastore
      //   219: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   222: goto -23 -> 199
      //   225: new 11	com/tencent/mm/plugin/gallery/ui/a$c$1
      //   228: dup
      //   229: aload_0
      //   230: invokespecial 291	com/tencent/mm/plugin/gallery/ui/a$c$1:<init>	(Lcom/tencent/mm/plugin/gallery/ui/a$c;)V
      //   233: invokestatic 297	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
      //   236: ldc2_w 241
      //   239: ldc -13
      //   241: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   244: return
      //   245: astore_2
      //   246: goto -55 -> 191
      //   249: astore_3
      //   250: goto -129 -> 121
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	253	0	this	c
      //   17	14	1	localMediaMetadataRetriever1	android.media.MediaMetadataRetriever
      //   94	14	1	localException1	Exception
      //   122	1	1	localMediaMetadataRetriever2	android.media.MediaMetadataRetriever
      //   164	14	1	localException2	Exception
      //   190	6	1	localObject1	Object
      //   201	14	1	localException3	Exception
      //   15	143	2	localMediaMetadataRetriever3	android.media.MediaMetadataRetriever
      //   188	12	2	localObject2	Object
      //   245	1	2	localObject3	Object
      //   118	28	3	localException4	Exception
      //   249	1	3	localException5	Exception
      // Exception table:
      //   from	to	target	type
      //   48	52	94	java/lang/Exception
      //   8	16	118	java/lang/Exception
      //   157	161	164	java/lang/Exception
      //   8	16	188	finally
      //   195	199	201	java/lang/Exception
      //   18	29	245	finally
      //   31	48	245	finally
      //   123	153	245	finally
      //   18	29	249	java/lang/Exception
      //   31	48	249	java/lang/Exception
    }
    
    private static abstract interface a
    {
      public abstract void a(a.c paramc, int paramInt);
    }
  }
  
  private static final class d
  {
    public CheckBox lCA;
    public View lCB;
    public ImageView lCC;
    public ImageView lCD;
    public ImageView lCE;
    public ImageView lCv;
    public ImageView lCw;
    public RelativeLayout lCx;
    public TextView lCy;
    public TextView lCz;
    
    public d()
    {
      GMTrace.i(11945512009728L, 89001);
      GMTrace.o(11945512009728L, 89001);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */