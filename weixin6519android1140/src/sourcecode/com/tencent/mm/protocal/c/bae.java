package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bae
  extends ayx
{
  public String eSd;
  public String scope;
  public String state;
  public String uOc;
  public String uOd;
  public String uOe;
  
  public bae()
  {
    GMTrace.i(17868406128640L, 133130);
    GMTrace.o(17868406128640L, 133130);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17868540346368L, 133131);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eSd != null) {
        paramVarArgs.e(2, this.eSd);
      }
      if (this.scope != null) {
        paramVarArgs.e(3, this.scope);
      }
      if (this.state != null) {
        paramVarArgs.e(4, this.state);
      }
      if (this.uOc != null) {
        paramVarArgs.e(5, this.uOc);
      }
      if (this.uOd != null) {
        paramVarArgs.e(6, this.uOd);
      }
      if (this.uOe != null) {
        paramVarArgs.e(7, this.uOe);
      }
      GMTrace.o(17868540346368L, 133131);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.eSd != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eSd);
      }
      i = paramInt;
      if (this.scope != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.scope);
      }
      paramInt = i;
      if (this.state != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.state);
      }
      i = paramInt;
      if (this.uOc != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uOc);
      }
      paramInt = i;
      if (this.uOd != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uOd);
      }
      i = paramInt;
      if (this.uOe != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uOe);
      }
      GMTrace.o(17868540346368L, 133131);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17868540346368L, 133131);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bae localbae = (bae)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17868540346368L, 133131);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbae.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17868540346368L, 133131);
        return 0;
      case 2: 
        localbae.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17868540346368L, 133131);
        return 0;
      case 3: 
        localbae.scope = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17868540346368L, 133131);
        return 0;
      case 4: 
        localbae.state = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17868540346368L, 133131);
        return 0;
      case 5: 
        localbae.uOc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17868540346368L, 133131);
        return 0;
      case 6: 
        localbae.uOd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17868540346368L, 133131);
        return 0;
      }
      localbae.uOe = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(17868540346368L, 133131);
      return 0;
    }
    GMTrace.o(17868540346368L, 133131);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */