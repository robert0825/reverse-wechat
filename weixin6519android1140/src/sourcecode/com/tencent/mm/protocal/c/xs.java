package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xs
  extends ayx
{
  public String data;
  public int nJ;
  public String ufb;
  
  public xs()
  {
    GMTrace.i(4042637967360L, 30120);
    GMTrace.o(4042637967360L, 30120);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4042772185088L, 30121);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufb == null) {
        throw new b("Not all required fields were included: corp_id");
      }
      if (this.data == null) {
        throw new b("Not all required fields were included: data");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ufb != null) {
        paramVarArgs.e(2, this.ufb);
      }
      paramVarArgs.fk(3, this.nJ);
      if (this.data != null) {
        paramVarArgs.e(4, this.data);
      }
      GMTrace.o(4042772185088L, 30121);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.ufb != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.ufb);
      }
      i += b.a.a.a.fh(3, this.nJ);
      paramInt = i;
      if (this.data != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.data);
      }
      GMTrace.o(4042772185088L, 30121);
      return paramInt;
    }
    Object localObject1;
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      localObject1 = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a((b.a.a.a.a)localObject1); paramInt > 0; paramInt = ayx.a((b.a.a.a.a)localObject1)) {
        if (!super.a((b.a.a.a.a)localObject1, this, paramInt)) {
          ((b.a.a.a.a)localObject1).csW();
        }
      }
      if (this.ufb == null) {
        throw new b("Not all required fields were included: corp_id");
      }
      if (paramVarArgs == null) {
        throw new b("Not all required fields were included: data");
      }
      GMTrace.o(4042772185088L, 30121);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject2 = (b.a.a.a.a)paramVarArgs[0];
      localObject1 = (xs)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4042772185088L, 30121);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject2).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject3 = (byte[])paramVarArgs.get(paramInt);
          localObject2 = new er();
          localObject3 = new b.a.a.a.a((byte[])localObject3, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject2).a((b.a.a.a.a)localObject3, (com.tencent.mm.bm.a)localObject2, ayx.a((b.a.a.a.a)localObject3))) {}
          ((xs)localObject1).uNh = ((er)localObject2);
          paramInt += 1;
        }
        GMTrace.o(4042772185088L, 30121);
        return 0;
      case 2: 
        ((xs)localObject1).ufb = ((b.a.a.a.a)localObject2).yqV.readString();
        GMTrace.o(4042772185088L, 30121);
        return 0;
      case 3: 
        ((xs)localObject1).nJ = ((b.a.a.a.a)localObject2).yqV.nj();
        GMTrace.o(4042772185088L, 30121);
        return 0;
      }
      ((xs)localObject1).data = ((b.a.a.a.a)localObject2).yqV.readString();
      GMTrace.o(4042772185088L, 30121);
      return 0;
    }
    GMTrace.o(4042772185088L, 30121);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\xs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */