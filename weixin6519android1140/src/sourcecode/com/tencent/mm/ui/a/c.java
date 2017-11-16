package com.tencent.mm.ui.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.Settings.Secure;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Method;
import java.util.Locale;

@TargetApi(14)
public final class c
  extends View.AccessibilityDelegate
{
  private boolean vOZ;
  
  public c()
  {
    GMTrace.i(1875826966528L, 13976);
    this.vOZ = false;
    a locala = a.a.vOX;
    AudioManager localAudioManager = (AudioManager)locala.sN.getSystemService("audio");
    if ((locala.bYo()) && ((Settings.Secure.getInt(locala.sN.getContentResolver(), "speak_password", 0) != 0) || (localAudioManager.isWiredHeadsetOn()))) {}
    for (boolean bool = true;; bool = false)
    {
      this.vOZ = bool;
      GMTrace.o(1875826966528L, 13976);
      return;
    }
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(1875961184256L, 13977);
    GMTrace.o(1875961184256L, 13977);
    return false;
  }
  
  public final AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
  {
    GMTrace.i(1876095401984L, 13978);
    GMTrace.o(1876095401984L, 13978);
    return null;
  }
  
  public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(1876229619712L, 13979);
    GMTrace.o(1876229619712L, 13979);
  }
  
  public final void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    GMTrace.i(1876363837440L, 13980);
    GMTrace.o(1876363837440L, 13980);
  }
  
  public final void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(1876498055168L, 13981);
    GMTrace.o(1876498055168L, 13981);
  }
  
  public final boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(1876632272896L, 13982);
    GMTrace.o(1876632272896L, 13982);
    return true;
  }
  
  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(1876766490624L, 13983);
    GMTrace.o(1876766490624L, 13983);
    return true;
  }
  
  public final void sendAccessibilityEvent(View paramView, int paramInt)
  {
    GMTrace.i(1876900708352L, 13984);
    if (!this.vOZ)
    {
      GMTrace.o(1876900708352L, 13984);
      return;
    }
    Object localObject;
    if ((paramView != null) && ((paramInt == 128) || (paramInt == 1))) {
      if ((paramView instanceof EditText))
      {
        localObject = (EditText)paramView;
        if (!bg.L(((EditText)localObject).getText())) {
          localObject = ((EditText)localObject).getText();
        }
      }
    }
    for (;;)
    {
      w.d("MicroMsg.MMSecureAccessibilityDelegate", "speak content: %s", new Object[] { localObject });
      if (bg.L((CharSequence)localObject))
      {
        GMTrace.o(1876900708352L, 13984);
        return;
        if (!bg.L(((EditText)localObject).getContentDescription()))
        {
          localObject = ((EditText)localObject).getContentDescription();
          continue;
        }
        if (((EditText)localObject).getHint() != null)
        {
          localObject = ((EditText)localObject).getHint();
          continue;
          if ((paramView instanceof TextView))
          {
            if (bg.L(paramView.getContentDescription()))
            {
              localObject = ((TextView)paramView).getText();
              continue;
            }
            localObject = paramView.getContentDescription();
            continue;
          }
          localObject = paramView.getContentDescription();
        }
      }
      else
      {
        a locala = a.a.vOX;
        String str = ((CharSequence)localObject).toString();
        if (locala.vOV == null) {
          locala.vOV = new TextToSpeech(locala.sN, new a.1(locala, str));
        }
        try
        {
          localObject = View.class.getMethod("clearAccessibilityFocus", new Class[0]);
          ((Method)localObject).setAccessible(true);
          ((Method)localObject).invoke(paramView, new Object[0]);
          localObject = View.class.getMethod("requestAccessibilityFocus", new Class[0]);
          ((Method)localObject).setAccessible(true);
          ((Method)localObject).invoke(paramView, new Object[0]);
          if (locala.jsv != null) {
            locala.jsv = ((Vibrator)ab.getContext().getSystemService("vibrator"));
          }
          if (locala.jsv != null) {
            locala.jsv.vibrate(50L);
          }
          GMTrace.o(1876900708352L, 13984);
          return;
          TextToSpeech localTextToSpeech = locala.vOV;
          if (v.bPG()) {}
          for (localObject = Locale.CHINESE;; localObject = Locale.ENGLISH)
          {
            localTextToSpeech.setLanguage((Locale)localObject);
            locala.vOV.speak(str, 0, null);
            break;
          }
        }
        catch (Exception paramView)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.Accessibility.AccessibilityHelper", paramView, "", new Object[0]);
          }
        }
      }
      localObject = null;
    }
  }
  
  public final void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(1877034926080L, 13985);
    GMTrace.o(1877034926080L, 13985);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */