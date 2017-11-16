package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar
  extends ProgressBar
{
  private final Runnable AA = new Runnable()
  {
    public final void run()
    {
      ContentLoadingProgressBar.b(ContentLoadingProgressBar.this);
      if (!ContentLoadingProgressBar.c(ContentLoadingProgressBar.this))
      {
        ContentLoadingProgressBar.a(ContentLoadingProgressBar.this, System.currentTimeMillis());
        ContentLoadingProgressBar.this.setVisibility(0);
      }
    }
  };
  private boolean Ax = false;
  private boolean Ay = false;
  private final Runnable Az = new Runnable()
  {
    public final void run()
    {
      ContentLoadingProgressBar.a(ContentLoadingProgressBar.this);
      ContentLoadingProgressBar.a(ContentLoadingProgressBar.this, -1L);
      ContentLoadingProgressBar.this.setVisibility(8);
    }
  };
  private long mStartTime = -1L;
  private boolean oc = false;
  
  public ContentLoadingProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  private void ck()
  {
    removeCallbacks(this.Az);
    removeCallbacks(this.AA);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ck();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ck();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\android\support\v4\widget\ContentLoadingProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */