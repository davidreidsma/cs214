# duck.rb | Defines the Duck class which inherits attributes and methods
#   from the Bird superclass.
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by: David Reidsma
# Date: 04/25/2020
####################################################

require './bird.rb'

class Duck < Bird

  # Get the call of this bird.
  def call
    return "Quack!"
  end

end
