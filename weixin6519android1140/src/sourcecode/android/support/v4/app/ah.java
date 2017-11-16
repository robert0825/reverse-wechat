package android.support.v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;

final class ah
{
  static RemoteInput[] a(ai.a[] paramArrayOfa)
  {
    if (paramArrayOfa == null) {
      return null;
    }
    RemoteInput[] arrayOfRemoteInput = new RemoteInput[paramArrayOfa.length];
    int i = 0;
    while (i < paramArrayOfa.length)
    {
      ai.a locala = paramArrayOfa[i];
      arrayOfRemoteInput[i] = new RemoteInput.Builder(locala.getResultKey()).setLabel(locala.getLabel()).setChoices(locala.getChoices()).setAllowFreeFormInput(locala.getAllowFreeFormInput()).addExtras(locala.getExtras()).build();
      i += 1;
    }
    return arrayOfRemoteInput;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */