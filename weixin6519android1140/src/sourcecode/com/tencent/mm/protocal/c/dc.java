package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class dc
  extends com.tencent.mm.bm.a
{
  public String lQa;
  public int tMX;
  public int tRo;
  public int tRp;
  public dh tRq;
  public db tRr;
  
  public dc()
  {
    GMTrace.i(3821984022528L, 28476);
    GMTrace.o(3821984022528L, 28476);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3822118240256L, 28477);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQa == null) {
        throw new b("Not all required fields were included: AppId");
      }
      paramVarArgs.fk(1, this.tMX);
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      paramVarArgs.fk(3, this.tRo);
      paramVarArgs.fk(4, this.tRp);
      if (this.tRq != null)
      {
        paramVarArgs.fm(5, this.tRq.aYq());
        this.tRq.a(paramVarArgs);
      }
      if (this.tRr != null)
      {
        paramVarArgs.fm(6, this.tRr.aYq());
        this.tRr.a(paramVarArgs);
      }
      GMTrace.o(3822118240256L, 28477);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tMX) + 0;
      paramInt = i;
      if (this.lQa != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lQa);
      }
      i = paramInt + b.a.a.a.fh(3, this.tRo) + b.a.a.a.fh(4, this.tRp);
      paramInt = i;
      if (this.tRq != null) {
        paramInt = i + b.a.a.a.fj(5, this.tRq.aYq());
      }
      i = paramInt;
      if (this.tRr != null) {
        i = paramInt + b.a.a.a.fj(6, this.tRr.aYq());
      }
      GMTrace.o(3822118240256L, 28477);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.lQa == null) {
        throw new b("Not all required fields were included: AppId");
      }
      GMTrace.o(3822118240256L, 28477);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      dc localdc = (dc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3822118240256L, 28477);
        return -1;
      case 1: 
        localdc.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3822118240256L, 28477);
        return 0;
      case 2: 
        localdc.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3822118240256L, 28477);
        return 0;
      case 3: 
        localdc.tRo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3822118240256L, 28477);
        return 0;
      case 4: 
        localdc.tRp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3822118240256L, 28477);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new dh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((dh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdc.tRq = ((dh)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3822118240256L, 28477);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new db();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((db)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localdc.tRr = ((db)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3822118240256L, 28477);
      return 0;
    }
    GMTrace.o(3822118240256L, 28477);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */