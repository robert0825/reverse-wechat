package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class age
  extends ayx
{
  public String eTJ;
  public String uvT;
  public int uvU;
  
  public age()
  {
    GMTrace.i(3642669137920L, 27140);
    GMTrace.o(3642669137920L, 27140);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3642803355648L, 27141);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eTJ == null) {
        throw new b("Not all required fields were included: card_id");
      }
      if (this.uvT == null) {
        throw new b("Not all required fields were included: to_username");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eTJ != null) {
        paramVarArgs.e(2, this.eTJ);
      }
      if (this.uvT != null) {
        paramVarArgs.e(3, this.uvT);
      }
      paramVarArgs.fk(4, this.uvU);
      GMTrace.o(3642803355648L, 27141);
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
      if (this.eTJ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eTJ);
      }
      i = paramInt;
      if (this.uvT != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uvT);
      }
      paramInt = b.a.a.a.fh(4, this.uvU);
      GMTrace.o(3642803355648L, 27141);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.eTJ == null) {
        throw new b("Not all required fields were included: card_id");
      }
      if (this.uvT == null) {
        throw new b("Not all required fields were included: to_username");
      }
      GMTrace.o(3642803355648L, 27141);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      age localage = (age)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3642803355648L, 27141);
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
          localage.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3642803355648L, 27141);
        return 0;
      case 2: 
        localage.eTJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3642803355648L, 27141);
        return 0;
      case 3: 
        localage.uvT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3642803355648L, 27141);
        return 0;
      }
      localage.uvU = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3642803355648L, 27141);
      return 0;
    }
    GMTrace.o(3642803355648L, 27141);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\age.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */