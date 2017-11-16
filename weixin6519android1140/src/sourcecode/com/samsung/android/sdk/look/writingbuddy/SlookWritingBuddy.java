package com.samsung.android.sdk.look.writingbuddy;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.samsung.android.sdk.look.Slook;
import com.samsung.android.writingbuddy.WritingBuddyImpl;
import com.samsung.android.writingbuddy.WritingBuddyImpl.OnImageWritingListener;
import com.samsung.android.writingbuddy.WritingBuddyImpl.OnTextWritingListener;

public final class SlookWritingBuddy
{
  private static final String TAG = "WritingBuddy";
  public static final int TYPE_EDITOR_NUMBER = 1;
  public static final int TYPE_EDITOR_TEXT = 2;
  public ImageWritingListener mImageWritingListener;
  private View mParentView;
  private Slook mSlook = new Slook();
  public TextWritingListener mTextWritingListener;
  private WritingBuddyImpl mWritingBuddyImpl;
  
  public SlookWritingBuddy(ViewGroup paramViewGroup)
  {
    if (!isSupport(1)) {
      return;
    }
    this.mParentView = paramViewGroup;
    this.mWritingBuddyImpl = new WritingBuddyImpl(paramViewGroup);
  }
  
  public SlookWritingBuddy(EditText paramEditText)
  {
    if (!isSupport(1)) {
      return;
    }
    this.mParentView = paramEditText;
    this.mWritingBuddyImpl = new WritingBuddyImpl(paramEditText);
  }
  
  private boolean isSupport(int paramInt)
  {
    return this.mSlook.isFeatureEnabled(3);
  }
  
  public final int getEditorType()
  {
    if (!isSupport(1)) {
      return 0;
    }
    return this.mWritingBuddyImpl.getEditorType();
  }
  
  public final boolean isEnabled()
  {
    if (!isSupport(1)) {
      return false;
    }
    if (this.mParentView == null) {
      throw new IllegalStateException("mParentView is null.");
    }
    return this.mParentView.isWritingBuddyEnabled();
  }
  
  public final void setEditorType(int paramInt)
  {
    if (!isSupport(1)) {
      return;
    }
    this.mWritingBuddyImpl.setEditorType(paramInt);
  }
  
  public final void setEnabled(boolean paramBoolean)
  {
    if (!isSupport(1)) {
      return;
    }
    if (this.mParentView == null) {
      throw new IllegalStateException("mParentView is null.");
    }
    if ((this.mParentView instanceof EditText))
    {
      this.mParentView.setWritingBuddyEnabled(paramBoolean);
      return;
    }
    if (this.mParentView.getWritingBuddy(false) != null)
    {
      this.mParentView.setWritingBuddyEnabled(paramBoolean);
      return;
    }
    throw new IllegalStateException("WritingBuddy was not enabled.");
  }
  
  public final void setImageWritingListener(ImageWritingListener paramImageWritingListener)
  {
    if (!isSupport(1)) {
      return;
    }
    this.mImageWritingListener = paramImageWritingListener;
    if (paramImageWritingListener == null)
    {
      this.mWritingBuddyImpl.setImageWritingEnabled(false);
      this.mWritingBuddyImpl.setOnImageWritingListener(null);
      return;
    }
    this.mWritingBuddyImpl.setImageWritingEnabled(true);
    this.mWritingBuddyImpl.setOnImageWritingListener(new WritingBuddyImpl.OnImageWritingListener()
    {
      public void onImageReceived(Bitmap paramAnonymousBitmap)
      {
        SlookWritingBuddy.this.mImageWritingListener.onImageReceived(paramAnonymousBitmap);
      }
    });
  }
  
  public final void setTextWritingListener(TextWritingListener paramTextWritingListener)
  {
    if (!isSupport(1)) {
      return;
    }
    this.mTextWritingListener = paramTextWritingListener;
    this.mWritingBuddyImpl.setOnTextWritingListener(new WritingBuddyImpl.OnTextWritingListener()
    {
      public void onTextReceived(CharSequence paramAnonymousCharSequence)
      {
        SlookWritingBuddy.this.mTextWritingListener.onTextReceived(paramAnonymousCharSequence);
      }
    });
  }
  
  public static abstract interface ImageWritingListener
  {
    public abstract void onImageReceived(Bitmap paramBitmap);
  }
  
  public static abstract interface TextWritingListener
  {
    public abstract void onTextReceived(CharSequence paramCharSequence);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\samsung\android\sdk\look\writingbuddy\SlookWritingBuddy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */