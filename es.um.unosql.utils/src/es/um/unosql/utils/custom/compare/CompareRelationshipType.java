package es.um.unosql.utils.custom.compare;

import es.um.unosql.uNoSQLSchema.RelationshipType;

public class CompareRelationshipType extends Comparator<RelationshipType>
{
  @Override
  public boolean compare(RelationshipType r1, RelationshipType r2)
  {
    if (super.checkNulls(r1, r2))
      return false;

    if (super.checkEquals(r1, r2))
      return true;

    return true;
  }
}
