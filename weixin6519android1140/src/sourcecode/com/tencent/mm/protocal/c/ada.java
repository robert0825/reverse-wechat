package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ada
  extends ayx
{
  public int Height;
  public String URL;
  public int Width;
  public String utc;
  
  public ada()
  {
    GMTrace.i(3985058562048L, 29691);
    GMTrace.o(3985058562048L, 29691);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3985192779776L, 29692);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.URL == null) {
        throw new b("Not all required fields were included: URL");
      }
      if (this.utc == null) {
        throw new b("Not all required fields were included: UserAgent");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.URL != null) {
        paramVarArgs.e(2, this.URL);
      }
      if (this.utc != null) {
        paramVarArgs.e(3, this.utc);
      }
      paramVarArgs.fk(4, this.Width);
      paramVarArgs.fk(5, this.Height);
      GMTrace.o(3985192779776L, 29692);
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
      if (this.URL != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.URL);
      }
      i = paramInt;
      if (this.utc != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.utc);
      }
      paramInt = b.a.a.a.fh(4, this.Width);
      int j = b.a.a.a.fh(5, this.Height);
      GMTrace.o(3985192779776L, 29692);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.URL == null) {
        throw new b("Not all required fields were included: URL");
      }
      if (this.utc == null) {
        throw new b("Not all required fields were included: UserAgent");
      }
      GMTrace.o(3985192779776L, 29692);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ada localada = (ada)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3985192779776L, 29692);
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
          localada.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3985192779776L, 29692);
        return 0;
      case 2: 
        localada.URL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3985192779776L, 29692);
        return 0;
      case 3: 
        localada.utc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3985192779776L, 29692);
        return 0;
      case 4: 
        localada.Width = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3985192779776L, 29692);
        return 0;
      }
      localada.Height = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3985192779776L, 29692);
      return 0;
    }
    GMTrace.o(3985192779776L, 29692);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ada.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */