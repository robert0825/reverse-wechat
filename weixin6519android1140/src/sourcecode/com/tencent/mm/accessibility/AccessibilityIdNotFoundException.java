package com.tencent.mm.accessibility;

import com.tencent.gmtrace.GMTrace;

public class AccessibilityIdNotFoundException
  extends AccessibilityCaptureNotSupportException
{
  public AccessibilityIdNotFoundException()
  {
    super("Unable to find accessibility id");
    GMTrace.i(15223914233856L, 113427);
    GMTrace.o(15223914233856L, 113427);
  }
  
  public AccessibilityIdNotFoundException(String paramString)
  {
    super(paramString);
    GMTrace.i(15224048451584L, 113428);
    GMTrace.o(15224048451584L, 113428);
  }
  
  public AccessibilityIdNotFoundException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    GMTrace.i(15224316887040L, 113430);
    GMTrace.o(15224316887040L, 113430);
  }
  
  public AccessibilityIdNotFoundException(Throwable paramThrowable)
  {
    super("Unable to find accessibility id", paramThrowable);
    GMTrace.i(15224182669312L, 113429);
    GMTrace.o(15224182669312L, 113429);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\accessibility\AccessibilityIdNotFoundException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */