package com.tencent.mm.ui.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public class AnimatedExpandableListView
  extends ExpandableListView
{
  private static final String TAG;
  private a vYR;
  
  static
  {
    GMTrace.i(3171833348096L, 23632);
    TAG = a.class.getSimpleName();
    GMTrace.o(3171833348096L, 23632);
  }
  
  public AnimatedExpandableListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3171028041728L, 23626);
    GMTrace.o(3171028041728L, 23626);
  }
  
  public AnimatedExpandableListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3171162259456L, 23627);
    GMTrace.o(3171162259456L, 23627);
  }
  
  public final boolean BA(int paramInt)
  {
    GMTrace.i(3171564912640L, 23630);
    int i = getFlatListPosition(getPackedPositionForGroup(paramInt));
    if (i != -1)
    {
      i -= getFirstVisiblePosition();
      if ((i >= 0) && (i < getChildCount()))
      {
        if (getChildAt(i).getBottom() >= getBottom())
        {
          bool = collapseGroup(paramInt);
          GMTrace.o(3171564912640L, 23630);
          return bool;
        }
      }
      else
      {
        bool = collapseGroup(paramInt);
        GMTrace.o(3171564912640L, 23630);
        return bool;
      }
    }
    long l = getExpandableListPosition(getFirstVisiblePosition());
    i = getPackedPositionChild(l);
    int j = getPackedPositionGroup(l);
    if ((i == -1) || (j != paramInt)) {
      i = 0;
    }
    a.a(this.vYR, paramInt, i);
    this.vYR.notifyDataSetChanged();
    boolean bool = isGroupExpanded(paramInt);
    GMTrace.o(3171564912640L, 23630);
    return bool;
  }
  
  @SuppressLint({"NewApi"})
  public final boolean Bz(int paramInt)
  {
    GMTrace.i(3171430694912L, 23629);
    int i = getFlatListPosition(getPackedPositionForGroup(paramInt));
    if (i != -1)
    {
      i -= getFirstVisiblePosition();
      if ((i < getChildCount()) && (getChildAt(i).getBottom() >= getBottom()))
      {
        this.vYR.BB(paramInt).vZf = -1;
        bool = expandGroup(paramInt);
        GMTrace.o(3171430694912L, 23629);
        return bool;
      }
    }
    a.a(this.vYR, paramInt);
    boolean bool = expandGroup(paramInt);
    GMTrace.o(3171430694912L, 23629);
    return bool;
  }
  
  public void setAdapter(ExpandableListAdapter paramExpandableListAdapter)
  {
    GMTrace.i(3171296477184L, 23628);
    super.setAdapter(paramExpandableListAdapter);
    if ((paramExpandableListAdapter instanceof a))
    {
      this.vYR = ((a)paramExpandableListAdapter);
      a.a(this.vYR, this);
      GMTrace.o(3171296477184L, 23628);
      return;
    }
    throw new ClassCastException(paramExpandableListAdapter.toString() + " must implement AnimatedExpandableListAdapter");
  }
  
  public static abstract class a
    extends BaseExpandableListAdapter
  {
    private SparseArray<AnimatedExpandableListView.d> vYS;
    private AnimatedExpandableListView vYT;
    
    public a()
    {
      GMTrace.i(3344839999488L, 24921);
      this.vYS = new SparseArray();
      GMTrace.o(3344839999488L, 24921);
    }
    
    final AnimatedExpandableListView.d BB(int paramInt)
    {
      GMTrace.i(3345242652672L, 24924);
      AnimatedExpandableListView.d locald2 = (AnimatedExpandableListView.d)this.vYS.get(paramInt);
      AnimatedExpandableListView.d locald1 = locald2;
      if (locald2 == null)
      {
        locald1 = new AnimatedExpandableListView.d();
        this.vYS.put(paramInt, locald1);
      }
      GMTrace.o(3345242652672L, 24924);
      return locald1;
    }
    
    public abstract View a(int paramInt1, int paramInt2, View paramView);
    
    public final int getChildType(int paramInt1, int paramInt2)
    {
      GMTrace.i(3345376870400L, 24925);
      if (BB(paramInt1).lFt)
      {
        GMTrace.o(3345376870400L, 24925);
        return 0;
      }
      GMTrace.o(3345376870400L, 24925);
      return 1;
    }
    
    public final int getChildTypeCount()
    {
      GMTrace.i(3345511088128L, 24926);
      GMTrace.o(3345511088128L, 24926);
      return 2;
    }
    
    public final View getChildView(final int paramInt1, int paramInt2, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(3345645305856L, 24927);
      final AnimatedExpandableListView.d locald = BB(paramInt1);
      if (locald.lFt)
      {
        if ((paramView instanceof AnimatedExpandableListView.b)) {
          break label529;
        }
        paramView = new AnimatedExpandableListView.b(paramViewGroup.getContext());
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
      }
      label295:
      label407:
      label529:
      for (;;)
      {
        if (paramInt2 < locald.vZe)
        {
          paramView.getLayoutParams().height = 0;
          GMTrace.o(3345645305856L, 24927);
          return paramView;
        }
        final ExpandableListView localExpandableListView = (ExpandableListView)paramViewGroup;
        final AnimatedExpandableListView.b localb = (AnimatedExpandableListView.b)paramView;
        localb.vYY.clear();
        Drawable localDrawable = localExpandableListView.getDivider();
        paramInt2 = paramViewGroup.getMeasuredWidth();
        int i = localExpandableListView.getDividerHeight();
        if (localDrawable != null)
        {
          localb.vPb = localDrawable;
          localb.vYZ = paramInt2;
          localb.dividerHeight = i;
          localDrawable.setBounds(0, 0, paramInt2, i);
        }
        int k = View.MeasureSpec.makeMeasureSpec(paramViewGroup.getWidth(), 1073741824);
        int m = View.MeasureSpec.makeMeasureSpec(0, 0);
        paramInt2 = 0;
        int n = paramViewGroup.getHeight();
        int i1 = vt(paramInt1);
        int j = locald.vZe;
        for (;;)
        {
          i = paramInt2;
          if (j >= i1) {
            break label295;
          }
          paramViewGroup = a(paramInt1, j, null);
          paramViewGroup.measure(k, m);
          paramInt2 += paramViewGroup.getMeasuredHeight();
          if (paramInt2 >= n) {
            break;
          }
          localb.de(paramViewGroup);
          j += 1;
        }
        localb.de(paramViewGroup);
        i = paramInt2 + (i1 - j - 1) * (paramInt2 / (j + 1));
        paramViewGroup = localb.getTag();
        if (paramViewGroup == null)
        {
          paramInt2 = 0;
          if ((!locald.vZd) || (paramInt2 == 1)) {
            break label407;
          }
          paramViewGroup = new AnimatedExpandableListView.c(localb, 0, i, locald, (byte)0);
          AnimatedExpandableListView.bZr();
          paramViewGroup.setDuration(150L);
          paramViewGroup.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              GMTrace.i(3314238357504L, 24693);
              AnimatedExpandableListView.a.b(AnimatedExpandableListView.a.this, paramInt1);
              AnimatedExpandableListView.a.this.notifyDataSetChanged();
              localb.setTag(Integer.valueOf(0));
              GMTrace.o(3314238357504L, 24693);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymousAnimation)
            {
              GMTrace.i(3314372575232L, 24694);
              GMTrace.o(3314372575232L, 24694);
            }
            
            public final void onAnimationStart(Animation paramAnonymousAnimation)
            {
              GMTrace.i(3314506792960L, 24695);
              GMTrace.o(3314506792960L, 24695);
            }
          });
          localb.startAnimation(paramViewGroup);
          localb.setTag(Integer.valueOf(1));
        }
        for (;;)
        {
          GMTrace.o(3345645305856L, 24927);
          return paramView;
          paramInt2 = ((Integer)paramViewGroup).intValue();
          break;
          if ((!locald.vZd) && (paramInt2 != 2))
          {
            if (locald.vZf == -1) {
              locald.vZf = i;
            }
            paramViewGroup = new AnimatedExpandableListView.c(localb, locald.vZf, 0, locald, (byte)0);
            AnimatedExpandableListView.bZr();
            paramViewGroup.setDuration(150L);
            paramViewGroup.setAnimationListener(new Animation.AnimationListener()
            {
              public final void onAnimationEnd(Animation paramAnonymousAnimation)
              {
                GMTrace.i(3346719047680L, 24935);
                AnimatedExpandableListView.a.b(AnimatedExpandableListView.a.this, paramInt1);
                localExpandableListView.collapseGroup(paramInt1);
                AnimatedExpandableListView.a.this.notifyDataSetChanged();
                locald.vZf = -1;
                localb.setTag(Integer.valueOf(0));
                GMTrace.o(3346719047680L, 24935);
              }
              
              public final void onAnimationRepeat(Animation paramAnonymousAnimation)
              {
                GMTrace.i(3346853265408L, 24936);
                GMTrace.o(3346853265408L, 24936);
              }
              
              public final void onAnimationStart(Animation paramAnonymousAnimation)
              {
                GMTrace.i(3346987483136L, 24937);
                GMTrace.o(3346987483136L, 24937);
              }
            });
            localb.startAnimation(paramViewGroup);
            localb.setTag(Integer.valueOf(2));
          }
        }
        paramView = a(paramInt1, paramInt2, paramView);
        GMTrace.o(3345645305856L, 24927);
        return paramView;
      }
    }
    
    public final int getChildrenCount(int paramInt)
    {
      GMTrace.i(3345779523584L, 24928);
      AnimatedExpandableListView.d locald = BB(paramInt);
      if (locald.lFt)
      {
        paramInt = locald.vZe;
        GMTrace.o(3345779523584L, 24928);
        return paramInt + 1;
      }
      paramInt = vt(paramInt);
      GMTrace.o(3345779523584L, 24928);
      return paramInt;
    }
    
    public abstract int vt(int paramInt);
  }
  
  private static final class b
    extends View
  {
    int dividerHeight;
    Drawable vPb;
    List<View> vYY;
    int vYZ;
    
    public b(Context paramContext)
    {
      super();
      GMTrace.i(3337323806720L, 24865);
      this.vYY = new ArrayList();
      GMTrace.o(3337323806720L, 24865);
    }
    
    public final void de(View paramView)
    {
      GMTrace.i(3337458024448L, 24866);
      paramView.layout(0, 0, getWidth(), getHeight());
      this.vYY.add(paramView);
      GMTrace.o(3337458024448L, 24866);
    }
    
    public final void dispatchDraw(Canvas paramCanvas)
    {
      GMTrace.i(3337726459904L, 24868);
      paramCanvas.save();
      if (this.vPb != null) {
        this.vPb.setBounds(0, 0, this.vYZ, this.dividerHeight);
      }
      int j = this.vYY.size();
      int i = 0;
      while (i < j)
      {
        View localView = (View)this.vYY.get(i);
        localView.draw(paramCanvas);
        paramCanvas.translate(0.0F, localView.getMeasuredHeight());
        if (this.vPb != null)
        {
          this.vPb.draw(paramCanvas);
          paramCanvas.translate(0.0F, this.dividerHeight);
        }
        i += 1;
      }
      paramCanvas.restore();
      GMTrace.o(3337726459904L, 24868);
    }
    
    protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(3337592242176L, 24867);
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      int j = this.vYY.size();
      int i = 0;
      while (i < j)
      {
        ((View)this.vYY.get(i)).layout(paramInt1, paramInt2, paramInt3, paramInt4);
        i += 1;
      }
      GMTrace.o(3337592242176L, 24867);
    }
  }
  
  private static final class c
    extends Animation
  {
    private int vZa;
    private int vZb;
    private AnimatedExpandableListView.d vZc;
    private View view;
    
    private c(View paramView, int paramInt1, int paramInt2, AnimatedExpandableListView.d paramd)
    {
      GMTrace.i(3339873943552L, 24884);
      this.vZa = paramInt1;
      this.vZb = (paramInt2 - paramInt1);
      this.view = paramView;
      this.vZc = paramd;
      this.view.getLayoutParams().height = paramInt1;
      this.view.requestLayout();
      GMTrace.o(3339873943552L, 24884);
    }
    
    protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      GMTrace.i(3340008161280L, 24885);
      super.applyTransformation(paramFloat, paramTransformation);
      if (paramFloat < 1.0F)
      {
        i = this.vZa + (int)(this.vZb * paramFloat);
        this.view.getLayoutParams().height = i;
        this.vZc.vZf = i;
        this.view.requestLayout();
        GMTrace.o(3340008161280L, 24885);
        return;
      }
      int i = this.vZa + this.vZb;
      this.view.getLayoutParams().height = i;
      this.vZc.vZf = i;
      this.view.requestLayout();
      GMTrace.o(3340008161280L, 24885);
    }
  }
  
  private static final class d
  {
    boolean lFt;
    boolean vZd;
    int vZe;
    int vZf;
    
    public d()
    {
      GMTrace.i(3277999570944L, 24423);
      this.lFt = false;
      this.vZd = false;
      this.vZf = -1;
      GMTrace.o(3277999570944L, 24423);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\base\AnimatedExpandableListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */